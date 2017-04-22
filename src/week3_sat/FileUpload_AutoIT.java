package week3_sat;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class FileUpload_AutoIT {
  @Test
  public void f() throws IOException {
	  
	  WebDriver d=new FirefoxDriver();
		d.get("http://toolsqa.com/automation-practice-form/");
		d.manage().window().maximize();
		
		
		//click browse button
		d.findElement(By.id("photo")).click();
		
		Sleeper.sleepTightInSeconds(2);
		//implement AutoIT script into Webdriver testcase
		Runtime.getRuntime().exec("E:\\Weekend_April1\\AutoIT\\uploadFile.exe");
		
  }
}




