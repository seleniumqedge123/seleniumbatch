package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class Customized_Xpath {

	public static void main(String[] args) {
		

		WebDriver d=new FirefoxDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("java");

	}

}








