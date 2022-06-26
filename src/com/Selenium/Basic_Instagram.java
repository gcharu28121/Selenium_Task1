package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Instagram {

public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Batch 11\\Driver\\chromedriver.exe" );
		
		 WebDriver driver=new ChromeDriver();
    
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.instagram.com/accounts/login/?hl=en");
		 
		 Thread.sleep(2000);
		 
	WebElement username = driver.findElement(By.name("username"))	; 
	   username.sendKeys("Charuvathi");	
	
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("456237jk");
	
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	
}
	
}
