package com.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getty_Image {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Batch 11\\Driver\\chromedriver.exe" );
				
			WebDriver driver=new ChromeDriver();
				   
		driver.manage().window().maximize();
						 
		driver.get("https://www.gettyimages.in/");		

		Thread.sleep(2000);
		WebElement image = driver.findElement(By.xpath("//div[contains(@class,'DesktopMediaFilter-module__mainLabel___h1cMI')]"));
		  Select s=new Select(image);
		  boolean multiple = s.isMultiple();
		System.out.println(multiple);
				
				
				
				
				
				
				
			}
			 	

	
	
	
	
}
