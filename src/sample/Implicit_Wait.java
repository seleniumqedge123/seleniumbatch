package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Implicit_Wait {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver=new FirefoxDriver();
		
		driver.get("http://fb.com");
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
		
		//Thread.sleep(10000);
		
		driver.findElement(By.id("email")).sendKeys("hellooooo");
		
		
	  
  }
}
