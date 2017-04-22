package com.HRM.TestExec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginusingProperties {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}
	@Test
	public void loginTest() throws IOException
	{
		//Excel app
		String prop="E:\\Weekend_April1\\workspace\\Selenium_project\\src\\com\\HRM\\Properties\\Test.properties";
		String path="E:\\Weekend_April1\\workspace\\Selenium_project\\src\\com\\HRM\\Testdata\\LoginKeywords12.xlsx";
        
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		
		//Properties File
		
		FileInputStream f=new FileInputStream(prop);
		Properties pr=new Properties();
		pr.load(f);
		
		
		driver.findElement(By.xpath(pr.getProperty("un"))).sendKeys
		                           (ws.getRow(3).getCell(4).getStringCellValue());;
		
		driver.findElement(By.id(pr.getProperty("psd"))).sendKeys("admin");
		driver.findElement(By.id(pr.getProperty("loginbtn"))).click();
			
	}

}

