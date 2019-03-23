package com.selenium.javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void getAlert(WebDriver driver,String msg)
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("alert('"+msg+"');");
	}
	
	public static void main(String [] args) throws Exception
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.gcrit.com/build3/admin");
		
		getAlert(driver, "This is JS generated alert!!!");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.quit();
		
	}
	
}
