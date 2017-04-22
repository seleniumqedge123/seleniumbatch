package week3_sat_grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_FF {

	public static void main(String[] args) throws MalformedURLException {
	
		DesiredCapabilities cap=null;
		
		cap=DesiredCapabilities.firefox();
		
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver  driver=new RemoteWebDriver(new URL("http://192.168.1.54:4444/wd/hub"), cap);
		
		
		driver.get("http://fb.com");
		

	}

}
