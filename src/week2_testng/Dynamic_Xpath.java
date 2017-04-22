package week2_testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Dynamic_Xpath {
  @Test
  public void f() {
	  
	  FirefoxDriver	driver=new FirefoxDriver();
		driver.get("http://yahoo.com/");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		// Search box
		driver.findElement(By.id("uh-search-box")).sendKeys("selenium");
		
		//get Ajax control Elements
		List<WebElement> links=driver.findElements(By.
				    xpath("//*[starts-with(@id,'yui_3_18_0_3_149173')]/span"));
		System.out.println(links.size());
		
		Sleeper.sleepTightInSeconds(3);
		
		//click Selenium tutorial link
		links.get(2).click();
  }
}






