package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/fozbek/Documents/selenium dependencies/drivers/chromedriver");
	
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://cybertekschool.com");
	  
	  WebDriver driver1 = new ChromeDriver();
	  driver.get("http://amazon.com");
	  
	  WebDriver driver2 = new ChromeDriver();
	  driver.get("http://ebay.com");
	  
	  WebDriver driver3 = new ChromeDriver();
	  driver.get("http://google.com");
	  
	  
	  
   }
}
