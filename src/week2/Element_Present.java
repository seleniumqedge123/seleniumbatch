package week2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_Present {
	
	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		
		
		String src= d.getPageSource();
		System.out.println(src);
		
		
		if(src.contains("yahoo"))
		{
			System.out.println("Elemnt is present");
		}
		else
		{
			System.out.println("Elemnt is not present");
		}
		
	}

}
