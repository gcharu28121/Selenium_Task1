package com.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leafground_DropDown {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Batch 11\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();	
		
	driver.get("http://www.leafground.com/pages/Dropdown.html");

	Thread.sleep(2000);

	WebElement dropdown = driver.findElement(By.xpath("//h5[text()='Drop down']"));
	dropdown.click();

	//select program using index
	WebElement drop1 = driver.findElement(By.id("dropdown1"));
	drop1.click();	
	Select s=new Select(drop1);
		s.selectByIndex(1);;
		
	//List<WebElement> index = s.getAllSelectedOptions();	
//		for (WebElement webElement : index) {
//			System.out.println(webElement.getText());
		
		
		
		
}
		

	
	
	
}
