package week3_sat_grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid1 {
	@Parameters("browser")
	
	@Test
	public void sample(String b) throws MalformedURLException, Exception 
	{
		System.out.println(b);
		
		
		DesiredCapabilities cap=null;
		
		if(b.equals("firefox"))
		{
		cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		}
		
		
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		else if(b.equals("iexplore"))
		{
			cap=DesiredCapabilities.internetExplorer();
			cap.setBrowserName("iexplore");
			cap.setPlatform(Platform.WINDOWS);
		}
	
		RemoteWebDriver d=new RemoteWebDriver(new URL
				                   ("http://localhost:4444/wd/hub"),cap);
		
		d.get("http://google.com");
		d.manage().window().maximize();
			
	}
}




