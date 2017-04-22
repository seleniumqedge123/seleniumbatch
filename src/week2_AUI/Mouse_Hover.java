package week2_AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Mouse_Hover {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.emirates.com/in/English/");
		d.manage().window().maximize();
		
		//identify EXPERIENCE LINK
		WebElement src= d.findElement(By.xpath(".//*[@id='inFlight']/a/span[1]"));
		//identify BOOK LINK
		WebElement book= d.findElement(By.xpath(".//*[@id='book']/a/span[1]"));

		Actions mo=new Actions(d);
		Sleeper.sleepTightInSeconds(2);
		
		mo.moveToElement(src).moveToElement(book).build().perform();
		
		//mo.moveToElement(book).perform();
		
		
		
	}

}
