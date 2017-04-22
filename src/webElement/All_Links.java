package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class All_Links {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://online.citi.com/US/login.do");
		d.manage().window().maximize();
		
		// identify no.of links 
		List<WebElement>  links= d.findElements(By.tagName("a"));
		int a= links.size();
		
		System.out.println(a);
		
		for(int i=0;i<a;i++)
		{	
		String	name= links.get(i).getText();
			
			System.out.println(name);
			
		}
	}
}


