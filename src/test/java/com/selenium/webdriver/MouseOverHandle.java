package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverHandle {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.goindigo.in/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Manage']"))).build().perform();
		driver.findElement(By.xpath(""));

	}

}
