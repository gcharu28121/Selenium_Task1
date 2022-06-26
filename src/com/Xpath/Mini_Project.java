package com.Xpath;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	public static void main(String[] args) throws Throwable{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Tasks\\Driver\\chromedriver.exe");	
	
	WebDriver driver=new ChromeDriver();
	   
	driver.manage().window().maximize();
		
	driver.get("http://automationpractice.com/");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
 WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("Geetha81@gmail.com");

WebElement account = driver.findElement(By.id("SubmitCreate"));		
		account.click();
	
 WebElement gender = driver.findElement(By.id("id_gender2"));		
gender.click();	
		
	WebElement first = driver.findElement(By.id("customer_firstname"));	
	first.sendKeys("Geetha");	
		
	WebElement last = driver.findElement(By.id("customer_lastname"));	
		last.sendKeys("Kavi");
	
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("Kevs984");
		
		WebElement day = driver.findElement(By.id("days"));
		Select s=new Select(day);
		s.selectByValue("28");
		
		WebElement month = driver.findElement(By.id("months"));
		Select s1=new Select(month);
		s1.selectByIndex(05);
		
		WebElement year = driver.findElement(By.id("years"));
		Select s2=new Select(year);
		s2.selectByValue("1994");
		
		WebElement comp = driver.findElement(By.id("company"));
		comp.sendKeys("TCS");
		
		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys("Washington Street");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Newyork");
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select s3=new Select(state);
        s3.selectByVisibleText("New York");
			
WebElement postal = driver.findElement(By.id("postcode"));		
  postal.sendKeys("10006");      
       
  WebElement phone = driver.findElement(By.id("phone_mobile"));
       phone.sendKeys("7456246481"); 
        
     WebElement reg = driver.findElement(By.id("submitAccount"));  
       reg.click();
       
   WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));    
      women.click(); 
       
      Actions act=new Actions(driver);
       WebElement tops = driver.findElement(By.xpath("//a[text()='Tops']"));
       act.contextClick(tops).build().perform();
       
       Robot rob=new Robot();
       
       rob.keyPress(KeyEvent.VK_DOWN);
       rob.keyRelease(KeyEvent.VK_DOWN);
       
       
     WebElement tshirt = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
       tshirt.click();
       
       
       
       
		}
		
	}
	
	
	
	
	


