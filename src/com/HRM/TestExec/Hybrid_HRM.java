package com.HRM.TestExec;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


//import com.Project.ReusableFunctions.Reuse_function;
import com.HRM.ReUse.ReUse_Functions;

public class Hybrid_HRM {
  
	public  String res;
	@Test
  public void f() throws IOException {
	  
		ReUse_Functions obj=new ReUse_Functions();
		
		
		//Excel
		  FileInputStream f1 = new FileInputStream("E:\\Selenium10AMto1pm\\Workspace10am\\Selenium10am_proj\\src\\com\\HRM\\TestData\\Datadriventesting.xlsx");
		  @SuppressWarnings("resource")
		  XSSFWorkbook wd = new XSSFWorkbook(f1);
		 // XSSFSheet wslog = wd.getSheet("Sheet5");
		  XSSFSheet wslaunch = wd.getSheet("Sheet6");
		  
		
		  
		  res=obj.launchApp(wslaunch.getRow(1).getCell(0).getStringCellValue());
	  wslaunch.getRow(1).createCell(1).setCellValue(res);
	  
	  String output="E:\\Weekend_April1\\workspace\\Selenium_project\\src\\com\\HRM\\TestResults\\hybrid_output123.xlsx";
		
		FileOutputStream fos=new FileOutputStream(output);
		wd.write(fos);
		fos.close();
		

	  
	  
	  
  }
}
