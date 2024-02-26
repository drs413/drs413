package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DRS\\eclipse-workspace2\\SeleniumPractice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://www.salesforce.com/in/");
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.className("cta_button")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		//Thread.sleep(2000);
		for (String windowhandle : windowhandles) {
			if(!windowhandle.equals(parentwindow)) {
				//Thread.sleep(2000);
				driver.switchTo().window(windowhandle);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("UserFirstName-PqSt")));
				driver.findElement(By.id("UserFirstName-PqSt")).sendKeys("abc");
			}
			
		}
		
		
		
	}

}
