package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		//Switching to iFrame by using name and click on the element inside the frame.
		driver.switchTo().frame("globalSqa");
		driver.findElement(By.id("mobile_menu_toggler")).click();
		Thread.sleep(3000);
		//Switching back to default main page or parent frame
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='menu']//a[text()='Home']")).click();
	}

}
