package com.Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Tables {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Batch 11\\Driver\\chromedriver.exe" );
		
WebDriver driver=new ChromeDriver();
			   
driver.manage().window().maximize();
					 
	driver.get("http://www.leafground.com/pages/table.html");	
	//to get all data from table
	 List<WebElement> table = driver.findElements(By.xpath("//table/tbody/tr/td"));	
		for (WebElement webElement : table) {
			System.out.println(webElement.getText());
		}
	//to get row
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
	for (WebElement webElement : row) {
		System.out.println(webElement.getText());
	}
		
		
		
		
	}
	
	
	

}
