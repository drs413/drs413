package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTextboxes {
// Handling textboxes using selenium
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DRS\\eclipse-workspace2\\SeleniumPractice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement Usernametxt = driver.findElement(By.id("email"));
		if(Usernametxt.isDisplayed()) {
			if(Usernametxt.isEnabled()) {
				Usernametxt.sendKeys("drs");
				Thread.sleep(3000);
				Usernametxt.clear();
				Thread.sleep(3000);
			}
			else
				System.err.println("textbox is not enabled");
			
		}
		
		else
			System.err.println("textbox is not displayed");
		
	}

}
