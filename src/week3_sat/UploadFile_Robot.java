package week3_sat;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class UploadFile_Robot {
  @Test
  public void f() throws AWTException {
	  
	  WebDriver d=new FirefoxDriver();
		d.get("http://toolsqa.com/automation-practice-form/");
		d.manage().window().maximize();
		
		// copy file path
		StringSelection src=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(src, null);
		
		
		//click browse button
		d.findElement(By.id("photo")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		Robot rb=new Robot();
		rb.delay(2000);
		
		//  ctrl + v
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
  }
}
