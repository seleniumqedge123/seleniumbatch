package week2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Firefox_Profile {

	public static void main(String[] args) {
		
		ProfilesIni pr=new ProfilesIni();
	  FirefoxProfile  fp=	pr.getProfile("week_April");
	  
	  WebDriver d=new FirefoxDriver(fp);
	  d.get("http://primusbank.qedgetech.com");
		

	}

}
