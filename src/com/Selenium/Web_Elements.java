package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Elements {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Batch 11\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailid = driver.findElement(By.id("email"));
		emailid.sendKeys("charuvathiganesan@gmail.com");
	
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Charu28!@");
		
	WebElement login = driver.findElement(By.name("login"));
	login.click();
		
	}
	
	
	
	
	
	
}
