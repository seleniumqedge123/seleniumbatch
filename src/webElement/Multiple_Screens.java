package webElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Screens {

	public static void main(String[] args) throws IOException {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		// identify no.of links 
		List<WebElement> links= d.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			String str= links.get(i).getText();
			
			links.get(i).click();
			
		  File src=	((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File("E:\\Weekend_April1\\Screens\\"+str+".png"));
			
		  d.navigate().back();
			
			links=d.findElements(By.tagName("a"));	
		
		}

	}

}
