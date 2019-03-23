package com.selenium.javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void changeColor(String color,WebElement element,WebDriver driver)
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void flash(WebElement element,WebDriver driver)
	{
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i=1;i<50;i++)
		{
			changeColor("rgb(250,0,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/admin");
		//driver.get("http://jqueryui.com/slider/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		flash(driver.findElement(By.id("tdb1")), driver);
		
		
		
		
		
		
		
		
		
		//executor.executeScript("arguments[0].style.border='2px solid blue';",driver.findElement(By.id("tdb1")));
		//executor.executeScript("document.getElementById('tdb1').style.border='2px solid blue';");
		//executor.executeScript("arguments[0].click();",driver.findElement(By.id("tdb1")));
		
		/*executor.executeScript("arguments[0].setAttribute('disabled','null');",driver.findElement(By.name("username")));
		Thread.sleep(7000);
		executor.executeScript("arguments[0].removeAttribute('disabled');",driver.findElement(By.name("username")));*/
		
		//executor.executeScript("document.getElementsByName('username')[0].setAttribute('disabled','null');");
		//executor.executeScript("arguments[0].value='vikas';",driver.findElement(By.name("username")));
		//executor.executeScript("document.getElementsByName('username')[0].value='vikas';");
		
		//executor.executeScript("window.scrollBy(0,600);");
		//executor.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		//Thread.sleep(3000);
		//executor.executeScript("window.scrollBy(document.body.scrollHeight,0);");
		//executor.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.linkText("Button")));
/*		executor.executeScript("alert('Hi');");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
*/
	}

}
