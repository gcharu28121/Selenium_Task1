package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_ProgramUrl {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Batch 11\\Driver\\chromedriver.exe" );
				
		 WebDriver driver=new ChromeDriver();
				
			driver.get("https://byjus.com/");
				
			}

	
	
	
}
