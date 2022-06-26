package com.Xpath;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {
	
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Batch 11\\Driver\\chromedriver.exe" );
	
	WebDriver driver=new ChromeDriver();
		   
driver.manage().window().maximize();
				 
driver.get("https://www.amazon.in/");

Actions act=new Actions(driver);
WebElement fas = driver.findElement(By.linkText("Fashion"));	
	act.contextClick(fas).build().perform();
	
	Robot rob=new Robot();
	
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement elec = driver.findElement(By.xpath("//a[normalize-space()='Electronics']"));
	act.contextClick(elec).build().perform();
	
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement kit = driver.findElement(By.xpath("//a[normalize-space()='Home & Kitchen'][1]"));
	act.contextClick(kit).build().perform();
	
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
	
	//Window Handles(current id of window)
	
	String wh = driver.getWindowHandle();
	System.out.println(wh);
	
	//get id of all window
	
	Set<String> windows = driver.getWindowHandles();
	for (String string : windows) {
		System.out.println(string);
	}
	
	//to get title
	for (String string : windows) {
	String title = driver.switchTo().window(string).getTitle();	
		System.out.println(title);
		}
	
	//to stop with any one tab
	
	String fashion="Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";
	for (String string : windows) {
		if (driver.switchTo().window(string).getTitle().equals(fashion)) {
			System.out.println("Success");
			break;
		}
	}
	
}	
	
	
	
	
	
	
	

}
