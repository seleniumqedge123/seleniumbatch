package week2_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Webtable_Rows {
  
	 WebDriver d;
	
	@Test
  public void f() {
		
		for (int i = 1; i <= 10; i++) 
		{
			for (int k = 1; k <=3; k++) 
			{
			String path1="html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
				String path2="]/td[";
				String path3="]";
				
				
				String names=d.findElement(By.xpath(path1+i+path2+k+path3)).getText();
						
			   System.out.print(names+"      ");
			}
			
			System.out.println();
			
		}	
  }
  
  @BeforeTest
  public void setUp()
  {
	   d=new FirefoxDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize(); 
  }
}

