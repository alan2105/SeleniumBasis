package com.selenium.webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.popuptest.com/goodpopups.html");

		driver.findElement(By.linkText("Good PopUp #1")).click();
		
		Set<String> windowsId = driver.getWindowHandles();
		Iterator<String> itr =windowsId.iterator();
		
		String parentWindow = itr.next();
		
		System.out.println("Parent Window ID:" + parentWindow);
		String childWindow = itr.next();
		System.out.println("Child Window ID:" + childWindow);
		driver.switchTo().window(childWindow);
	
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());

	}

}
