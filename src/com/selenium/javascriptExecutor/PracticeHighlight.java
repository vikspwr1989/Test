package com.selenium.javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeHighlight {
	
	public static void main(String[] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.gcrit.com/build3/admin");
		
		blink(driver.findElement(By.id("tdb1")), driver);
		
		
	}
	
	static public void blink(WebElement element,WebDriver driver)
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		String bgColor = element.getCssValue("backgroundColor");
		for(int i=0;i<50;i++)
		{
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgColor, element, driver);
		}
		
	}
	
	static public void changeColor(String color,WebElement element,WebDriver driver)
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
