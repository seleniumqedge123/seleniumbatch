package week2_AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

  


public class Slider {
	
	
	
	@Test
	  public void f() {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/slider/");
		d.manage().window().maximize();
		
		d.switchTo().frame(0);
		
		//identify the slider
		WebElement slider= d.findElement(By.xpath(".//*[@id='slider']/span"));
		
	
		Actions act=new Actions(d);
		
		act.dragAndDropBy(slider, 500, 0).build().perform();
	
	}

}







