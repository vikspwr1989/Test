package com.selenium.javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolling {

	WebDriver driver;
	@Test
	public void basicsJs() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		//executor.executeScript("window.scrollBy(0,200);"); // Scroll By 200 pixels to bottom
		
		// executor.executeScript("window.scrollBy(0,document.body.scrollHeight);");  // Scroll to bottom of page
		
		// Scrolling By using JavascriptExecutor :Locating and Operating by using javascript
		executor.executeScript("document.getElementById('msdd').scrollIntoView();");
		
		// Scrolling By using JavascriptExecutor :Locating by WebDriver and Operating by using javascript
		/*WebElement e = driver.findElement(By.id("msdd"));
		executor.executeScript("arguments[0].scrollIntoView();", e);*/
		
		Thread.sleep(3000);
		
		driver.quit();
	}

	
	
	
	
	
	
}
