package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultiplewindowsorTabs {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DRS\\eclipse-workspace2\\SeleniumPractice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/");
		Thread.sleep(3000);  // Hard wait
		
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles); 
		
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		System.out.println(parentwindow);
		String childwindow = iterator.next();
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow); // as we need to switch to parent window to child window
		
		
		driver.findElement(By.name("UserFirstName")).sendKeys("drs");
		driver.findElement(By.name("UserLastName")).sendKeys("123");
		
		
		
	}
}