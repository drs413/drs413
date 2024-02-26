package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownElements {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DRS\\eclipse-workspace2\\SeleniumPractice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement courseElement = driver.findElement(By.id("course"));
		Select courseNameDropdown = new Select(courseElement);
		
		List<WebElement> coursenameoptions = courseNameDropdown.getOptions();
		for (WebElement option : coursenameoptions) {
			System.out.println(option.getText());
		}
		courseNameDropdown.selectByIndex(4);
		Thread.sleep(3000);
		courseNameDropdown.selectByValue("java");
		Thread.sleep(3000);
		courseNameDropdown.selectByVisibleText("Python");
		Thread.sleep(3000);
		
		String selectedtext = courseNameDropdown.getFirstSelectedOption().getText();
		System.out.println("selected visible text -" +selectedtext);
		
		
		
		
		WebElement ideElement = driver.findElement(By.id("ide"));
		Select ideDropdown = new Select(ideElement);
		
		List<WebElement> idedropdownoptions = ideDropdown.getOptions();
		
		for (WebElement option : idedropdownoptions) {
			System.out.println(option.getText());
		}
		ideDropdown.selectByIndex(0);
		Thread.sleep(3000);
		ideDropdown.selectByValue("ij");
		Thread.sleep(3000);
		ideDropdown.selectByVisibleText("NetBeans");
		Thread.sleep(3000);
		ideDropdown.deselectByVisibleText("IntelliJ IDEA");
		
		List<WebElement> selectedoptions = ideDropdown.getAllSelectedOptions();
		System.out.println("selected visible text -" +selectedoptions);
		for (WebElement selectedoption : selectedoptions) {
			System.out.println("Selected visible text - " +selectedoption.getText());
		}
		
	}

}
