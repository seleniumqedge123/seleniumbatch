package week3_sat;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class SaveFile_AutoIT {
  @Test
  public void f() throws IOException {
	  
	  WebDriver d=new FirefoxDriver();
		d.get("http://www.seleniumhq.org/download/");
	
		
		//click browse button
		d.findElement(By.linkText("3.3.1")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		Runtime.getRuntime().exec("E:\\Weekend_April1\\AutoIT\\Savefile.exe");
		
  }
}
