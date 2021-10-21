package labApachePOI;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.*;

import org.testng.annotations.Test;

public class ImportDataFromExcel {
	
	public FileInputStream fis = null;
    public XSSFWorkbook workbook = null;
    public XSSFSheet sheet = null;
    public XSSFRow row = null;
    public XSSFCell cell = null;

@Test  
  public void Exceldata() throws Exception 	{
	  File file = new File ("D:\\ExcelFiles\\SaiExcel.xlsx");
	  FileInputStream fis = new FileInputStream(file);
	  XSSFWorkbook workbook = new XSSFWorkbook(fis);
	  XSSFSheet sheet = workbook.getSheetAt(1);
	  
	  int rowCount = sheet.getLastRowNum();
	  int cellcount=sheet.getRow(0).getLastCellNum();
	  
	
	  
	  for(int i=0;i<rowCount;i++)
	  {
		  XSSFRow row = sheet.getRow (i);
		  
		  for(int j=0;j<cellcount;j++)
		  {
			  XSSFCell cell = row.getCell(j);
			  String cellValue =cell.getStringCellValue();
			  System.out.print("||"+cellValue);
		  }
	  }
	  
	  workbook.close();
	  fis.close();
		}
		
}
