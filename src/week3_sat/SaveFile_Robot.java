package week3_sat;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class SaveFile_Robot {
  @Test
  public void f() throws AWTException {
	  
	 WebDriver d=new FirefoxDriver();
		d.get("http://www.seleniumhq.org/download/");
	
		
		//click browse button
		d.findElement(By.linkText("3.3.1")).click();
		
	
		Sleeper.sleepTightInSeconds(2);
		
		Robot robo=new Robot();
		robo.delay(2000);
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		robo.delay(2000);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
			
		
  }
}
