package com.HRM.TestExec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;


public class datadriventesting {
  
	
	@Test
  public void f() throws  IOException {
	  
	  //Excel
	  FileInputStream f1 = new FileInputStream("E:\\Selenium10AMto1pm\\Workspace10am\\Selenium10am_proj\\src\\com\\HRM\\TestData\\Datadriventesting.xlsx");
	  @SuppressWarnings("resource")
	  XSSFWorkbook wd = new XSSFWorkbook(f1);
	  XSSFSheet ws = wd.getSheet("Sheet3");
	  
	  //Properties file
	  
	  FileInputStream fis=new FileInputStream("E:\\Selenium10AMto1pm\\Workspace10am\\Selenium10am_proj\\src\\com\\HRM\\Properties\\data.properties");
		Properties pr=new Properties();
		pr.load(fis);
	  
	  
	  WebDriver dr = new FirefoxDriver();
	  dr.navigate().to("http://newtours.demoaut.com/");
	  dr.manage().window().maximize();
	  Sleeper.sleepTightInSeconds(3);
	  
	  dr.findElement(By.linkText("REGISTER")).click();
	 
	 
	   
	int rc= ws.getLastRowNum();
	 System.out.println(rc); 
	 
	 for(int i=1;i<=rc;i++)
	 {
	
		dr.findElement(By.name(pr.getProperty("fn"))).
			sendKeys(ws.getRow(i).getCell(0).getStringCellValue());
		dr.findElement(By.name(pr.getProperty("ln"))).
			sendKeys(ws.getRow(i).getCell(1).getStringCellValue());
		dr.findElement(By.name(pr.getProperty("ph"))).
			sendKeys(ws.getRow(i).getCell(2).getStringCellValue());
		dr.findElement(By.id(pr.getProperty("email"))).
			sendKeys(ws.getRow(i).getCell(3).getStringCellValue());
		dr.findElement(By.name(pr.getProperty("add"))).
			sendKeys(ws.getRow(i).getCell(4).getStringCellValue());
		dr.findElement(By.name(pr.getProperty("city"))).
			sendKeys(ws.getRow(i).getCell(5).getStringCellValue());
		dr.findElement(By.name(pr.getProperty("state"))).
			sendKeys(ws.getRow(i).getCell(6).getStringCellValue());
		dr.findElement(By.name(pr.getProperty("postal"))).
			sendKeys(ws.getRow(i).getCell(7).getStringCellValue());
		dr.findElement(By.name(pr.getProperty("coun"))).
			sendKeys(ws.getRow(i).getCell(8).getStringCellValue());
		dr.findElement(By.id(pr.getProperty("user"))).
			sendKeys(ws.getRow(i).getCell(9).getStringCellValue());
		dr.findElement(By.name(pr.getProperty("pswd"))).
			sendKeys(ws.getRow(i).getCell(10).getStringCellValue());
		dr.findElement(By.name(pr.getProperty("cpswd"))).
			sendKeys(ws.getRow(i).getCell(11).getStringCellValue());
		dr.findElement(By.name(pr.getProperty("submit"))).click();
		
		
		Sleeper.sleepTightInSeconds(2);
		dr.navigate().back();
	}
	 
	 
	 
	  }
}

