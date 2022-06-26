package com.Adactin;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_project {
	
	public static void main(String[] args) throws Throwable {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Tasks\\Driver\\chromedriver.exe");	
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	
	WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Charu2812");
		
WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Pineapple!@");
		
   WebElement login = driver.findElement(By.id("login"));	
   login.click();
   
   WebElement location = driver.findElement(By.id("location"));
   Select s=new Select(location);
   s.selectByValue("Melbourne");  
   
   WebElement hotel = driver.findElement(By.id("hotels"));
   Select s1=new Select(hotel);
   s1.selectByValue("Hotel Sunshine");
   
   WebElement roomtype = driver.findElement(By.id("room_type"));
   Select s2=new Select(roomtype);
   s2.selectByIndex(1);
   
   WebElement roomno = driver.findElement(By.id("room_nos"));
   Select s3=new Select(roomno);
   s3.selectByVisibleText("1 - One");
   
   WebElement checkin = driver.findElement(By.id("datepick_in"));
   checkin.clear();
   checkin.sendKeys("25/06/2022");
   
   WebElement checkout = driver.findElement(By.id("datepick_out"));
   checkout.clear();
   checkout.sendKeys("29/06/2022");
   
   WebElement adults = driver.findElement(By.id("adult_room"));
   Select s4=new Select(adults);
   s4.selectByVisibleText("2 - Two");
   
   WebElement submitbut = driver.findElement(By.id("Submit"));
   submitbut.click();
   
   WebElement confirmhotel = driver.findElement(By.xpath("//input[@type='radio']"));
   confirmhotel.click();
   
   WebElement continuebutton = driver.findElement(By.id("continue"));
   continuebutton.click();
   
   WebElement firstname = driver.findElement(By.id("first_name"));
   firstname.sendKeys("Setha");
   
   WebElement lastname = driver.findElement(By.id("last_name"));
   lastname.sendKeys("Veena");
   
   WebElement address = driver.findElement(By.id("address"));
   address.sendKeys("No:5,Serangoon Street,Melabourne");
   
   WebElement cardnumber = driver.findElement(By.id("cc_num"));
   cardnumber.sendKeys("6454217836182452");
   
   WebElement cardtype = driver.findElement(By.id("cc_type"));
   Select s5=new Select(cardtype);
   s5.selectByVisibleText("Master Card");
   
   WebElement month = driver.findElement(By.id("cc_exp_month"));
   Select s6=new Select(month);
   s6.selectByValue("7");
   
   WebElement year = driver.findElement(By.id("cc_exp_year"));
   Select s7=new Select(year);
   s7.selectByVisibleText("2022");
   
   WebElement cvv = driver.findElement(By.id("cc_cvv"));
   cvv.sendKeys("331");
   
   driver.findElement(By.id("book_now")).click();

   Thread.sleep(4000);
   
   driver.findElement(By.id("logout")).click();
   
   TakesScreenshot sc = (TakesScreenshot) driver;
	File src = sc.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Tasks\\Screenshot\\adactin1.png");
	FileUtils.copyFile(src, dest);
	
	}
   
}
	
	

	


