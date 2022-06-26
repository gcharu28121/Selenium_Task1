package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Methods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Batch 11\\Driver\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/");
					
				WebElement emailid = driver.findElement(By.id("email"));
				emailid.sendKeys("charuvathiganesan@gmail.com");
			
				WebElement password = driver.findElement(By.name("pass"));
				password.sendKeys("*********");
				
			WebElement email = driver.findElement(By.id("email"));
				email.clear();
				
			WebElement login = driver.findElement(By.name("login"));
			
			//WebElements Methods
			
			boolean displayed = login.isDisplayed();
			 System.out.println(displayed);
			
			boolean enabled = login.isEnabled();
			System.out.println(enabled);
			
			boolean selected = login.isSelected();
			System.out.println(selected);
			
			String text = login.getText();
			System.out.println(text);
			
			String attribute = login.getAttribute("data-testid");
			System.out.println(attribute);
			
			login.click();
				
		}
			

	
	
	
	
	
	
}
