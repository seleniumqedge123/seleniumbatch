package week2_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class CssSelector12 {
  @Test
  public void f() {
	  
	  FirefoxDriver	driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		driver.findElement(By.cssSelector
				("div.nav-search-field>input#twotabsearchtextbox")).sendKeys("hello");
  }
}







