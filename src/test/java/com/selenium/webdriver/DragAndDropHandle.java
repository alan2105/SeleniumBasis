package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropHandle {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.globalsqa.com/demo-site/draganddrop/");
		//Switch to iFrame 
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src, 'photo-manager')]")));
		// Create a object for an actions class
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//h5[text()='High Tatras']"))) // Click and holding the Drag element
		.moveToElement(driver.findElement(By.id("trash"))) // move to that element to drop area.
		.release() // release that dragged element.
		.build()
		.perform();

	}

}
