package com.selenium.javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RefreshBackForward {

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
		Thread.sleep(3000);
		executor.executeScript("history.go(0);"); // Refresh page
		Thread.sleep(3000);
		executor.executeScript("document.getElementById('enterimg').click();");
		Thread.sleep(3000);
		executor.executeScript("window.history.back();"); // Back to page
		Thread.sleep(3000);
		executor.executeScript("window.history.forward();"); // Forward to
		Thread.sleep(3000);
		
		driver.quit();
	}

}
