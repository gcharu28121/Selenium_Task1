package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_Single {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Batch 11\\Driver\\chromedriver.exe" );
			
			WebDriver driver=new ChromeDriver();
				   
		driver.manage().window().maximize();
						 
		driver.get("http://demo.automationtesting.in/Frames.html");		
		
		driver.switchTo().frame(0);
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text'][1]"));
			textbox.sendKeys("Helooo");
			
	
	}	
	
	

}
