package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Program {

public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Batch 11\\Driver\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
			   
	driver.manage().window().maximize();
					 
	driver.get("https://demoqa.com/alerts");		
		
	//PromptAlert	
		
//	WebElement prompt = driver.findElement(By.id("promtButton"));	
//		prompt.click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().sendKeys("Charu");
//		driver.switchTo().alert().accept();

	//ConfirmAlert
	WebElement confirm = driver.findElement(By.id("confirmButton"));
	confirm.click();
	driver.switchTo().alert().accept();
	
	//SimpleAlert
	WebElement simple = driver.findElement(By.id("alertButton"));
		simple.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		System.out.println("Clicked successfully");
	}
	

	
	
	
	
	
	
}
