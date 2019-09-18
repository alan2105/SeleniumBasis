package com.selenium.webdriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.cgsdev.com/ProviderPortal/");
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Register as a new user']"))));
		element.click();
		

	}
	
	public  static void waitForElementToVisible(WebDriver driver, WebElement element, int timeout)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public  static void waitForElementToClick(WebDriver driver, WebElement element, int timeout)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	


}
