package com.ron.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testingFireFox {

	public static void main(String[] args) {
		
		
		// in order to run FF with selenium 3 and above 
		// need latest version of FF browser very important !!!
		
		System.setProperty("webdriver.gecko.driver","D://Automation/Selenium/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("http://www.google.com");
	
	}

}
