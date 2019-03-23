package com.selenium.javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Click {
	
	WebDriver driver;
	@Test
	public void basicsJs() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		// Clicking By using JavascriptExecutor :Locating and Operating by using javascript
		
		executor.executeScript("document.getElementById('enterimg').click()");
		
		// Clicking By using JavascriptExecutor :Locating by WebDriver and Operating by using javascript
		
		/*WebElement e = driver.findElement(By.id("enterimg"));
		executor.executeScript("arguments[0].click()", e);*/
		
		
		
		driver.quit();
	}

}
