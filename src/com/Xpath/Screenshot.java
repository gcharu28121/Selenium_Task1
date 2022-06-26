package com.Xpath;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Batch 11\\Driver\\chromedriver.exe" );
				
				WebDriver driver=new ChromeDriver();
					   
			driver.manage().window().maximize();
							 
			driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");		
				
				TakesScreenshot s=(TakesScreenshot) driver;//Narrowing typecasting
				File src = s.getScreenshotAs(OutputType.FILE);
		 File desti=new File ("C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Tasks\\Screenshot_save\\screen.png");
			FileUtils.copyFile(src, desti);			
			
			}

	
}
