package com.selenium.javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HighLightElementDemo {


	public WebDriver driver;
	@Test
	public void demo()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.gcrit.com/build3/admin");
		
		Highlight.flash(driver.findElement(By.id("tdb1")), driver);
	
		
	}
	
}
