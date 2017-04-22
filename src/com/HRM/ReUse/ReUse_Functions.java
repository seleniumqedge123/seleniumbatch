package com.HRM.ReUse;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.HRM.Utilities.ScreenShot;

public class ReUse_Functions
{
	public WebDriver d;
	
	public String launchApp(String url) throws IOException
	{
		String expres= "OrangH";
		
		 d=new FirefoxDriver();
		 d.get(url);
		 
		String actres= d.getTitle();
		
		if(expres.equals(actres))
		{
			return "pass";
		}
		else
		{
			ScreenShot.sceerns(d, "launch");
			
			return "fail";
		}
	}
	
	
	
	

}
