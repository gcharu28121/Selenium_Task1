package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Concept {

	public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Batch 11\\Driver\\chromedriver.exe" );
		
	WebDriver driver=new ChromeDriver();
					   
	driver.manage().window().maximize();
							 
	driver.get("https://www.amazon.in/");
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
		
	//scroll down
	js.executeScript("window.scrollBy(0,9000)");
	
	//scrollup
	js.executeScript("window.scrollBy(0,-3000)");
	
	WebElement elec = driver.findElement(By.xpath("//h2[text()='Electronics devices for home office']"));
		js.executeScript("arguments[0].scrollIntoView();",elec);
	
	Thread.sleep(3000);
		
WebElement sell = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
js.executeScript("arguments[0].click();",sell);
		
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	js.executeScript("arguments[0].click();",search);
	js.executeScript("document.getElementById('twotabsearchtextbox').value='Handbag';");
	
	String in = js.executeScript("return document.documentElement.innerText;").toString();
	
	
	
	}
	
	
	
	
	
	
	
}
