package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_URLs {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://google.com/");
		d.manage().window().maximize();
		
		// identify no.of links 
		List<WebElement> links= d.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			// if link text is not empty ( Visible link)
			if(  !  links.get(i).getText().isEmpty())
			{
			links.get(i).click();
			String url= d.getCurrentUrl();
			
			System.out.println(url);
			d.navigate().back();
			
			links=d.findElements(By.tagName("a"));
			}
		}
		
	}

}
