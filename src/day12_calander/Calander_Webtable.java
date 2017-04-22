package day12_calander;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Calander_Webtable {
	
	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.cleartrip.com/");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(3);
		
	}
	@Test
	public void calanderTest()
	{
		
		//click one way radio
		driver.findElement(By.id("OneWay")).click();
		driver.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		driver.findElement(By.id("ToTag")).sendKeys("New Delhi, IN - Indira Gandhi Airport (DEL)");

// Click on Date
		driver.findElement(By.xpath
				("//*[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i")).click();
		
//User defined date
		String doj="10/May/2018";
		
		String a[]= doj.split("/");
		
		
		
		
		String day=a[0];
		String month= a[1];
		String year=a[2];
		
// get the calander year text
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();

		
		
		while(! calyear.equals(year))
		{
			Sleeper.sleepTightInSeconds(1);
//click on Arrow in calander
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a"))
			.click();

        // get the calander year text
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}

		
		
       // get the calander month text
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();

		while(!calmonth.equals(month))
		{

         //click on Arrow in calander
			Sleeper.sleepTightInSeconds(1);
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a"))
			.click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		//identify the date webtable
		WebElement table=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]"));
		
		//identify the rows from calander
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		Sleeper.sleepTightInSeconds(2);
		
		
		System.out.println(rows.size());
		
		
		for(int i=0;i<rows.size();i++)
		{
			//columns from rows
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			Sleeper.sleepTightInSeconds(1);
			
			for(int j=0;j<cols.size();j++)
			{
				if(cols.get(j).getText().equals(day))
				{
					//click on date
					cols.get(j).click();
					break;
				}
			}
		}
		Sleeper.sleepTightInSeconds(4);
		driver.findElement(By.id("SearchBtn")).click();
		
		
	}
	

}

