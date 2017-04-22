package week3_sat;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MouseMove {
  @Test
  public void f() throws AWTException {
	  
	  
	  
	  Robot robo=new Robot();
	  
	   Color clr =robo.getPixelColor(20, 20);
	   
	   System.out.println(clr.getRed());
	   
	   
	   robo.mouseMove(200, 200);
		  robo.delay(3000);
		  
		  robo.mousePress(InputEvent.BUTTON1_MASK);
		  robo.mouseRelease(InputEvent.BUTTON1_MASK);
		  
		  robo.delay(3000);
		  robo.mouseWheel(-100);
	   
	  
  }
}

