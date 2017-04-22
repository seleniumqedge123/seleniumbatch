package webElement;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot1_Validations{

	public static void main(String[] args) throws IOException {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://opensource.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		
		 String exp= "orangeHRM";
		 
		 String act= d.getTitle();
		 System.out.println(act);
		 
		 if(exp.equals(act))
		 {
			 System.out.println("Launch Sucesssssss");
		 }
		 else
		 {
			 System.out.println("Launch not Sucesssssss");
			 
			File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File("E:\\Weekend_April1\\Screens\\abcd.jpg"));
			
		 }
	}
}
