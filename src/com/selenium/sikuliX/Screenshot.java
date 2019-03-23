package com.selenium.sikuliX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Screenshot {

	public static void main(String[] args) throws Exception{
		
		Screen screen = new Screen();
		//Pattern gmail = new Pattern("D:\\EclipseRun\\MyProject\\RSJ\\Gmail.PNG");
		//Pattern back = new Pattern("D:\\EclipseRun\\MyProject\\RSJ\\back.PNG");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		//screen.wait(gmail, 100);
		screen.click("D:\\EclipseRun\\MyProject\\RSJ\\Gmail.PNG");
		
		Thread.sleep(3000);
		//screen.wait(back, 100);
		//screen.click();
		

	}

}
