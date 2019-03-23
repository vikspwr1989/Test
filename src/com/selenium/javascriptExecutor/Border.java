package com.selenium.javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Border {

	WebDriver driver;
	@Test
	public void setBorder()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		driver.get("http://www.google.com");
		
		// border an element using JavascriptExecutor :Locating and Operating by using javascript
		//executor.executeScript("document.getElementsByName('q')[0].style.border='3px solid blue'");
		
		
		// border an element using JavascriptExecutor :Locating by webdriver and Operating by using javascript
		executor.executeScript("arguments[0].style.border = '2px outset red';", driver.findElement(By.name("q")));
		
		
	}
	
}
