package com.selenium.javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Enable_disable_Element {
	WebDriver driver;
	@Test
	public void enable_disable() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.google.com");
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	
	driver.findElement(By.name("q")).sendKeys("vikas");
	Thread.sleep(2000);
	driver.findElement(By.name("q")).clear();
	Thread.sleep(3000);
	
	// Disable and enable element using JavascriptExecutor :Locating and Operating by using javascript
	
	executor.executeScript("document.getElementsByName('q')[0].setAttribute('disabled',' ');");
	Thread.sleep(10000);
	executor.executeScript("document.getElementsByName('q')[0].removeAttribute('disabled');");
	
	// Disable and enable element using JavascriptExecutor :Locating by webdriver and Operating by using javascript
	
	/*executor.executeScript("arguments[0].setAttribute('disabled',' ');", driver.findElement(By.name("q")));
	Thread.sleep(10000);
	executor.executeScript("arguments[0].removeAttribute('disabled');", driver.findElement(By.name("q")));*/
	
	
	
	
	
	}
	
}
