package com.ron.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//testing chrome browser
public class testingChrome {

	public static void main(String[] args) 
	{
		// set system property
		System.setProperty("webdriver.chrome.driver", "D://Automation/Selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		// test finished
	}

}
