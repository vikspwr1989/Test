package com.selenium.robot;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

public class CalculatorFeb {

	@Test
	public void myCalci() throws Exception
	{
		
		Runtime.getRuntime().exec("calc.exe");
		Robot robot = new Robot();
		Thread.sleep(2000);
		StringSelection selection = new StringSelection("10");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ADD);
		
		robot.keyRelease(KeyEvent.VK_ADD);
		
		Thread.sleep(2000);
		
		StringSelection selection2 = new StringSelection("20");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection2, null);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_EQUALS);
		
		robot.keyRelease(KeyEvent.VK_EQUALS);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_CONTEXT_MENU);
		robot.keyRelease(KeyEvent.VK_CONTEXT_MENU);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		
		String str = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		
		System.out.println(str);
		
		
		
		
		
		
		
	}
}
