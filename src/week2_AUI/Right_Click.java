package week2_AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Right_Click {

	public static void main(String[] args) {
		
		ProfilesIni pr=new ProfilesIni();
		  FirefoxProfile  fp=	pr.getProfile("week_April");
		  
		  WebDriver d=new FirefoxDriver(fp);
		  d.get("https://www.google.co.in/");
		  d.manage().window().maximize();
		  
		 WebElement gmail=  d.findElement(By.xpath
				                   (".//*[@id='gbw']/div/div/div[1]/div[1]/a"));

		 Actions rc=new Actions(d);
		 
		 //rc.contextClick(gmail).sendKeys("W").build().perform();
		 
		 Sleeper.sleepTightInSeconds(2);
		 rc.contextClick(gmail).sendKeys(Keys.ARROW_DOWN).
		                         sendKeys(Keys.ARROW_DOWN).click().build().perform();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
