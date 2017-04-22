package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hidden_links {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://google.com/");
		d.manage().window().maximize();
		
		// identify no.of links 
				List<WebElement> links= d.findElements(By.tagName("a"));
				System.out.println("Total links are====="+links.size());
				
				int count=0;
	
			for(int i=0;i<links.size();i++)
			{
				if(   ! links.get(i).getText().isEmpty())
				{
					count=count+1;
				}
			}
			System.out.println("The Visible links are==="+count);	
			
			System.out.println("Hidden Links are====="+(links.size()-count));
	}

}
