package week2_AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Tool_Tip {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://demoqa.com/tooltip/");
		d.manage().window().maximize();
		//identify text box
		WebElement src= d.findElement(By.id("age"));
		
		Actions act=new Actions(d);
		
		act.moveToElement(src).perform();
		Sleeper.sleepTightInSeconds(2);
		
		//get tool tip text
		String tip= d.findElement(By.className("ui-tooltip-content")).getText();
		System.out.println(tip);
	}

}


