package week2_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test(priority=0)
  public void f() {
	  System.out.println("lOGIN");
  }
  
  @Test(priority=1)
  public void a() {
	  System.out.println("lOGOUT");
  }
  
  @Test(priority=2)
  public void z() {
	  System.out.println("C/A");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("LAUNCH");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("CLOSE");
  }

}
