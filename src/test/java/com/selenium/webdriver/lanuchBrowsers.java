package com.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class lanuchBrowsers {

	public static void main(String[] args) {
		//Declaring variable for WebDriver interface
		WebDriver driver;
		//Launch Firefox browser
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver = new FirefoxDriver(); // create a object for ff class
		//Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		//Launch Internet Explorer browser
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
	//	driver = new SafariDriver();
		
		driver.get("http://www.google.com");
	}

}
