package week3_sat;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;

import org.testng.annotations.Test;

public class Robot_Mouse {
  @Test
  public void f() throws AWTException {
	  
	  Robot robo=new Robot();
	  
	  robo.delay(2000);
	  
	  System.out.println(Toolkit.getDefaultToolkit().getScreenSize());
	
	  robo.mouseMove(1000, 10);
	  
	  robo.delay(2000);
	  
	  robo.mousePress(InputEvent.BUTTON1_MASK);
	  robo.mouseRelease(InputEvent.BUTTON1_MASK);
	 
	  robo.delay(2000);
	  
	  
	  
  }
}
