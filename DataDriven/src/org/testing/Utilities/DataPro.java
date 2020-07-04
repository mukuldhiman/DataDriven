package org.testing.Utilities;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.*;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataPro {
	
  @DataProvider
  public static Object[][] getData() throws BiffException, IOException
  {
	  File file = new File("C:\\Users\\mukul.dhiman\\Desktop\\FbLogin.xls");
	  Workbook workbook = Workbook.getWorkbook(file);
	  Sheet sheet = workbook.getSheet(0);
	  int r = sheet.getRows();
	  int c =sheet.getColumns();
	  
	  Object[][] object = new Object[r][c];
	  
	  
	  for(int i=1; i<r; i++ )
	  {
		  for(int j=0; j<c; j++)
		  {
			Cell cell = sheet.getCell(j, i);
			object[i][j] = cell.getContents();
		  }
			  
	  }
	return object;
	  
	  
	  
	  
	  
  }
  

}
