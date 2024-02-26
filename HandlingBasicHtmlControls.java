package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Basic HTML controls textbox,link, button, radio button, checkbox, dropdown
public class HandlingBasicHtmlControls {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DRS\\eclipse-workspace2\\SeleniumPractice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement hindicheck = driver.findElement(By.id("hindichbx"));
		hindicheck.click();  // check
		Thread.sleep(3000);
		if(hindicheck.isSelected())
			hindicheck.click(); //uncheck
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		Thread.sleep(3000);
		
		
	}

}
