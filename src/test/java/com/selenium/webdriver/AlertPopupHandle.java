package com.selenium.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		Alert alert;
		
		System.setProperty("webdriver.chrome.driver", "D:/eclipse/java-neon/eclipse/git/SeleniumBasis/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='ACCEPT']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Simple Alert')]")).click();
		//Switch to alert and click on 'OK' button in alert box
		alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		//Switch to alert and click on 'Cancel' button in alert box
		driver.findElement(By.xpath("//button[contains(text(),'Confirm Pop up')]")).click();
		alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.dismiss();
		// Switch to alert and enter the name to textbox in alert box 
		driver.findElement(By.xpath("//button[contains(text(),'Prompt Pop up')]")).click();
		Thread.sleep(3000);
		alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys("Yes");
		
		alert.accept();
		driver.quit();

	}

}
