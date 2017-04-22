package week2_AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws Exception {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/droppable/");
		d.manage().window().maximize();
		
		d.switchTo().frame(0);
		
		//identify the source element
		WebElement src=d.findElement(By.id("draggable"));
		
		//identify the target element
		WebElement targ=d.findElement(By.id("droppable"));
		
		Actions dd=new Actions(d);
		Thread.sleep(2000);
		
		dd.dragAndDrop(src, targ).build().perform();
		
		
		
		
		
		
		
		
	}

}
