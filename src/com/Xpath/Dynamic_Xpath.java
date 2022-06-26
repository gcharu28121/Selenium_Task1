package com.Xpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {

public static void main(String[] args) throws Throwable {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Batch 11\\Driver\\chromedriver.exe" );
	
	 WebDriver driver=new ChromeDriver();
	   
	driver.manage().window().maximize();
			 
		driver.get("https://www.myntra.com/men-casual-shirts");	
		
	//to get price of all product	
List<WebElement> product = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));	

//for (WebElement webElement : product) {
//System.out.println(webElement.getText());
//}

//price of all product
// //li[@class='product-base']//descendant::span[@class='product-discountedPrice']

	List<Integer>price=new ArrayList<>();
	for ( WebElement  webElement: product) {
		String replace = webElement.getText().replace("Rs. ","");
		int parseInt = Integer.parseInt(replace);
		price.add(parseInt);
	}
	//to get max,minimum values
	Collections.sort(price,Collections.reverseOrder());
	System.out.println(price);
	
	System.out.println("Product count  :"+price.size());//product  count
	System.out.println("Maxi :"+Collections.max(price));//maximum price
	System.out.println("Min  :"+Collections.min(price));//minimum price
	
	
	}
}
