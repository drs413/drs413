package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingFrames {

	public static void main(String[] args) throws Exception {
		System.setProperty("web.driver.chrome.driver","C:\\Users\\DRS\\eclipse-workspace2\\SeleniumPractice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys("Text1"); // Entering details in main web page 
		Thread.sleep(3000);
		
		driver.switchTo().frame("frm1"); //Switching from main web page to frame1 i.e., dropdown page
		Select dropdown = new Select(driver.findElement(By.id("course")));
		dropdown.selectByVisibleText("Java");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent(); // Switching to main web page from Frame1
		driver.findElement(By.id("name")).clear(); //Clearing the existing text i.e., Text1
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("text2");
		Thread.sleep(3000);
		
		driver.switchTo().frame("frm2"); //switching from frame 1 to frame 2
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("drs");
		
		driver.switchTo().defaultContent(); // switching from frame2  to  main web page
		
		driver.switchTo().frame("frm1"); //switching from main web page to frame 1
		Select dropdown1 = new Select(driver.findElement(By.id("course")));
		Thread.sleep(3000);
		dropdown1.selectByVisibleText("Dot Net");
		
		driver.switchTo().defaultContent(); //Switching to main web page from frame1
		
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Text3");
		
		driver.switchTo().frame("frm3");
		driver.findElement(By.id("name")).sendKeys("welcome to frame3 textbox");
		
		
		//driver.switchTo().defaultContent();
		
		
		Select dropdown2 = new Select(driver.findElement(By.id("course")));
		dropdown2.selectByVisibleText("Python");
		Thread.sleep(3000);
		
		driver.findElement(By.id("lastName")).sendKeys("abc");
		
		
		
		
	}

}
