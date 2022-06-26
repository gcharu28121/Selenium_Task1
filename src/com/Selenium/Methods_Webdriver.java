package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_Webdriver {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Batch 11\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://accounts.google.com/");		
		
		//Navigate Methods
      driver.navigate().to("https://www.facebook.com/");

      driver.navigate().back();
      
      driver.navigate().refresh();
      
      driver.navigate().forward();
      
      driver.quit();
      
     driver.close();

           //Webdriver Methods
     
  String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl+" ");
		
		String title = driver.getTitle();
		System.out.println(title +" ");
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource +" ");
	}
	

	
	
	
	
	
	
}
