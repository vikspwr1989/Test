package com.selenium.robot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class UploadUsingAutoIT {
	@Test
	public void upload() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("imagesrc")).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\Selenium\\AutoIT\\Upload.exe");
	}
	
}
