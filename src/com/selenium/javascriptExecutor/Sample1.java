package com.selenium.javascriptExecutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws IOException {
		
		Properties properties = new Properties();
		FileInputStream inStream = new FileInputStream("D:\\EclipseRun\\MyProject\\Page_Object_Model\\or.properties");
		properties.load(inStream);
		
		System.out.println(properties.getProperty("objbtn_login"));
		
		
		
	}

}
