package com.Xpath;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Within_frame {

	public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Batch 11\\Driver\\chromedriver.exe" );
				
		WebDriver driver=new ChromeDriver();
					   
			driver.manage().window().maximize();
							 
			driver.get("http://demo.automationtesting.in/Frames.html");
			
    //to find how many frames		
	int size = driver.findElements(By.tagName("iframe")).size();		
	System.out.println(size);		
	
	//switch to single frame
   driver.switchTo().frame(0);
   WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
    textbox.sendKeys("Helooo");
			
		Thread.sleep(2000);
			
				//return to main page
	driver.switchTo().defaultContent();
			
	//switch to multiple frame
WebElement iframe = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
	iframe.click();
			
WebElement outerframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
driver.switchTo().frame(outerframe);
			
	WebElement innerframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	driver.switchTo().frame(innerframe);
			
	WebElement textbox2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	textbox2.sendKeys("Hi");
	
	//Take Screenshot
	TakesScreenshot s=(TakesScreenshot) driver;
	File src = s.getScreenshotAs(OutputType.FILE);
	 File desti=new File ("C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Tasks\\Screenshot_save\\frames.png");
		FileUtils.copyFile(src, desti);	
			
			
			
			}
			

	
	
	
	
}
