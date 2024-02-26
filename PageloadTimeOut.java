package com.selenium;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageloadTimeOut {
	// default timeout is 300sec
	//exception - timeout exception
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DRS\\eclipse-workspace2\\SeleniumPractice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		Instant starttime = Instant.now();
		System.out.println(starttime);
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().window().maximize();
		
		
		
		Instant endtime = Instant.now();
		System.out.println(endtime);
		
		Duration duration = Duration.between(starttime, endtime);
		System.out.println(duration.toMillis() + "milliseconds");
		System.out.println(driver.getTitle());

	}

}
