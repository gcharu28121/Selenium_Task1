package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Creation {

	public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Batch 11\\Driver\\chromedriver.exe" );
		
 WebDriver driver=new ChromeDriver();
   
driver.manage().window().maximize();
		 
	driver.get("https://www.facebook.com/");		
		
	//xpath with index
	
	WebElement newaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));	
		newaccount.click();
		
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));	
		firstname.sendKeys("Charu");	
		
		WebElement lastname = driver.findElement(By.name("lastname"));
            lastname.sendKeys("vathi");        
	
WebElement mobilenum = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	mobilenum.sendKeys("7534278561");
	
	WebElement password = driver.findElement(By.id("password_step_input"));
	password.sendKeys("G456294");
	
	WebElement date = driver.findElement(By.name("birthday_day"));
     Select s=new Select(date);
          s.selectByValue("25"); 

    WebElement month = driver.findElement(By.name("birthday_month"));
      Select s1=new Select(month);
      s1.selectByIndex(11);;

	WebElement year = driver.findElement(By.name("birthday_year"));
      Select s2=new Select(year);
      s2.selectByVisibleText("1993");
	
      WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
	gender.click();
	
	WebElement sign = driver.findElement(By.xpath("//button[text()='Sign Up']"));
    sign.click();
	
    System.out.println("Signed up successfully");
	
	}

}
