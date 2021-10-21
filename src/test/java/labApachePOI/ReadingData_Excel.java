package labApachePOI;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingData_Excel {
	
	
	@Test
	public static void Test2() throws Exception  {
	String excelFilePath = "D:\\ExcelFiles\\Sai.xlsx";
	FileInputStream fis = new FileInputStream(excelFilePath);
	
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
	//USING FOR LOOP
	
	int rows = sheet.getLastRowNum();
	int column = sheet.getRow(1).getLastCellNum();
	
	for(int r=0;r<=rows;r++) {
		
		XSSFRow row = sheet.getRow(r);
		
		for(int c=0;c<=column;c++) {
			
			XSSFCell cell =row.getCell(c);
			
			switch(cell.getCellType())
			{
				case STRING: System.out.println(cell.getStringCellValue()); break;
				case NUMERIC: System.out.print(cell.getStringCellValue()); break;
				case BOOLEAN: System.out.print(cell.getStringCellValue()); break; 
			}
			System.out.println( "   --  ");
		}
		
		System.out.println();
			
			}
			
		}
	}
		

        		/////Iterator//////



		
	
