package com.Xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_Dynamicxpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Tasks\\Driver\\chromedriver.exe" );
		
		 WebDriver driver=new ChromeDriver();
		   
		driver.manage().window().maximize();
				 
			driver.get("https://www.myntra.com/kids");		
		
		
		
		
	}
	
	
	

}
