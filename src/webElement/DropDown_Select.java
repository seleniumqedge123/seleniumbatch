package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DropDown_Select {

	@Test
	public void gggggg()
	{
		
		WebDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		d.findElement(By.linkText("REGISTER")).click();
		
		// identify the Drop down
		WebElement drop= d.findElement(By.name("country"));

		// identify the all items from Drop down
		List<WebElement> items= drop.findElements(By.tagName("option"));
		System.out.println(items.size());
		
		for (int i = 0; i < items.size(); i++) 
		{
			String str= items.get(i).getText();
			items.get(i).click();
		
			if(items.get(i).isSelected())
			{
				System.out.println("Item is working==="+str);
			}
			else
			{
				System.out.println("Item is not working==="+str);
			}
		}
		
	}
}


