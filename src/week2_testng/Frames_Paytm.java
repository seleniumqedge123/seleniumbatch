package week2_testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Frames_Paytm {
  @Test
  public void f() {
	  
	  FirefoxDriver	driver=new FirefoxDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		//Click LOgin LInk
		driver.findElement(By.xpath("html/........]/div[3]/div")).click();
		
		//identify no.of frames
		List<WebElement> frame= driver.findElements(By.tagName("iframe"));
		System.out.println(frame.size());
		
		for (int i = 0; i < frame.size(); i++) 
		{
			//switchTo from window to frames
			driver.switchTo().frame(i);
			
			try 
			{
				Sleeper.sleepTightInSeconds(3);
				driver.findElement(By.id("input_0")).sendKeys("9898989899");
				
				driver.findElement(By.id("input_1")).sendKeys("ggtgtgtggt");
				driver.findElement(By.xpath("html/.....ent/button[1]")).click();
				
			} catch (Exception e) {
				
				driver.switchTo().defaultContent();
			}
		}		
  }
}
