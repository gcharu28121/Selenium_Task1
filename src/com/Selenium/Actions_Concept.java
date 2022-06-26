package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Concept {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Batch 11\\Driver\\chromedriver.exe" );
		
WebDriver driver=new ChromeDriver();
					   
driver.manage().window().maximize();
							 
	driver.get("https://demoqa.com/buttons");		
		
	WebElement dc = driver.findElement(By.id("doubleClickBtn"));	
		Actions sc=new Actions(driver);
		sc.doubleClick(dc).build().perform();
		
		WebElement rc = driver.findElement(By.id("rightClickBtn"));
		Actions sc1=new Actions(driver);
		sc1.contextClick(rc).build().perform();
		
	WebElement cl = driver.findElement(By.xpath("//button[text()='Click Me']"));
		Actions sc2=new Actions(driver);
		sc2.click(cl).build().perform();
		
		
	}
	
	
	
	
	
	
}
