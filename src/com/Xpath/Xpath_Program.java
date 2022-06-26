package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Program {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Batch 11\\Driver\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount%3Fnc%3D1&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
				
			//Basic Xpath
			
			WebElement firstname = driver.findElement(By.xpath("//input[@type='text']"));
				firstname.sendKeys("Charu");
				
		//Xpath with Index
				
			WebElement lastname = driver.findElement(By.xpath(("(//input[@type='text'])[2]")));
			lastname.sendKeys("vathi");	
			
			//Xpath with contains
			
		WebElement email = driver.findElement(By.xpath("(//input[contains(@class='whsOnd zHQkBf')])"));	
		email.sendKeys("gcharuvathi");	

		//Xpath with index
			//WebElement email = driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[3]"));
			//email.sendKeys("charuvathig");
			
		//Xpath with Text

		WebElement name = driver.findElement(By.xpath("//div[text()='First name']"));
		name.sendKeys("Devi");

		//Xpath text&contains

		WebElement password = driver.findElement(By.xpath("//div[contains(text(),'Password']"));
		  password.sendKeys("******");

				
		}
			
			
	
	
	
	
}
