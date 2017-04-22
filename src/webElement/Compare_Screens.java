package webElement;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Compare_Screens {

	public static void main(String[] args) throws IOException {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		File src=	((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);

		
		d=new FirefoxDriver();
		d.get("http://fb.com");
		
		File src12=	((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		if(FileUtils.contentEquals(src, src12))
		{
			System.out.println("screens are same");
		}
		else
		{
			System.out.println("screens are not same");
		}
		
	}

}
