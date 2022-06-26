package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Batch 11\\Driver\\chromedriver.exe" );
		
		 WebDriver driver=new ChromeDriver();
		   
		driver.manage().window().maximize();
				 
driver.get("https://www.facebook.com/");		
	
	WebElement email = driver.findElement(By.xpath("//html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div/input"));	
		email.sendKeys("charuvathi@gmail.com");
	
	WebElement password = driver.findElement(By.xpath("//html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div[2]/div/input"));	
	password.sendKeys("Kedgg2");	
		
	WebElement button = driver.findElement(By.xpath("//html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div[2]/button"));	
	button.click();
	
	}
	
	
	

}
