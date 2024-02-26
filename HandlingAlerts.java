package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
//types of alerts 1 Alert box 2 Confirm box 3 Prompt Box
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DRS\\eclipse-workspace2\\SeleniumPractice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(3000);
		 //alert box
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.id("output")).getText());
		
		//confirm box
		
	System.out.println(driver.findElement(By.id("output")).getText());
	driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.id("output")).getText());
		
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.id("output")).getText());
		
		//Prompt Box
		System.out.println(driver.findElement(By.id("output")));
		driver.findElement(By.id("promptBox")).click();
		System.out.println(driver.findElement(By.id("promptBox")).getText());
		driver.switchTo().alert().sendKeys("drs");
		System.out.println(driver.findElement(By.id("promptBox")).getText());
		driver.switchTo().alert().accept();
		
		
	}

}
