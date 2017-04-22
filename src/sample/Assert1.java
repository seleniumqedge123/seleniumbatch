package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert1 {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("http://opensource.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		
		String exp= "OrangeHRtgffgfgM";
		
      String act=d.getTitle();
      System.out.println("The Title is===="+act);
      
 
      Assert.assertEquals(act, exp);
      
      System.out.println("launch successs");
      
      
		
	  
  }
}
