package com.HRM.TestExec;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.HRM.ReUse.Actionkw;



public class LoginusingKeywords  {
	
	@Test
	public  void loginTest() throws IOException
	{
		Actionkw keys=new Actionkw();
		
		String path="E:\\Weekend_April1\\workspace\\Selenium_project\\src\\com\\HRM\\Testdata\\LoginKeywords12.xlsx";
		
		FileInputStream f=new FileInputStream(path);
	
		
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		//ws.getLastRowNum()
		
		Iterator<Row> row=ws.iterator();
		row.next();
		
		while(row.hasNext())
		{
			Row r=row.next();
			
			
			String action=r.getCell(3).getStringCellValue();
			
			if(action.equals("launchBrowser"))
			{
				keys.launchBrowser();
			}
			else if(action.equals("navigate"))
			{
				keys.navigate();
			}
			else if(action.equals("enterUsername"))
			{
				keys.enterUsername();
			}
			else if(action.equals("enterPassword"))
			{
				keys.enterPassword();
			}
			else if(action.equals("clickLogin"))
			{
				keys.clickLogin();
			}
			
		}
	}



}

