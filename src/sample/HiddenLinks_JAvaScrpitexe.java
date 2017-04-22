package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class HiddenLinks_JAvaScrpitexe {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.get("http://www.bing.com/");
		d.manage().window().maximize();
		
		
		WebElement excel=d.findElement(By.xpath(".//*[@id='officemenu_excel_img']"));
		
		WebElement cal=d.findElement(By.xpath(".//*[@id='officemenu_calendar_img']"));
		
		JavascriptExecutor jse=(JavascriptExecutor)d;
		
		
		
		
		jse.executeScript("arguments[0].click()", excel);
		
		Sleeper.sleepTightInSeconds(2);
		
		jse.executeScript("arguments[0].click()", cal);
		
		
	  
  }
}
