package com.ron.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingChrome {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D://Automation/Selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

	}

}
