package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Alerts1 {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://primusbank.qedgetech.com/");
		d.manage().window().maximize();

		d.findElement(By.id("login")).click();
		Sleeper.sleepTightInSeconds(2);
		
		 String str= d.switchTo().alert().getText();
		 System.out.println(str);
		
		 Sleeper.sleepTightInSeconds(2);
		
		 d.switchTo().alert().accept();
		 
		 d.findElement(By.id("txtuId")).sendKeys("Admin");
	}
}



