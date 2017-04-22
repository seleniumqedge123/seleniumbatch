package week2_testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebTables1 {
 
	@Test
  public void f() {
	
		WebDriver d=new FirefoxDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		
		//identify webtable
		WebElement table= d.findElement(By.xpath("html/body/...../div[1]/table"));
		
		//identify rows in webtable
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		for (int i = 0; i < rows.size(); i++) 
		{
			//identify columns in a row
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println(cols.size());
			
			for (int j = 0; j < cols.size(); j++) 
			{
				System.out.print(cols.get(j).getText()+"         ");
			}
			
		}
		
  }
}
