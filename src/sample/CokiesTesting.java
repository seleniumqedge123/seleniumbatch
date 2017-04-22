package sample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CokiesTesting {
	WebDriver  driver;
	
	@BeforeMethod
	public void setup()
	{
		
	//	System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");		
		driver=new FirefoxDriver();
		
		driver.get("http://fb.com");	
	}
	
	@Test
	public void cookiesTest()
	{
		Set<Cookie> myCookies=driver.manage().getCookies();
		System.out.println(myCookies.size());
		
		Iterator<Cookie> it=myCookies.iterator();
		
		
		while(it.hasNext())
		{
			Cookie c=it.next();
			System.out.println(c.getName()+"--"+c.getValue()+"--"+c.getDomain());
		}
		
		driver.manage().deleteAllCookies();
		
		myCookies=driver.manage().getCookies();
		System.out.println(myCookies.size());
		
	}

}

