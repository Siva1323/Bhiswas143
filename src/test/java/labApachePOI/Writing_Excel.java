package labApachePOI;

import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Writing_Excel {
	@Test
	public void test1() throws Exception{
	XSSFWorkbook workbook = new XSSFWorkbook();
	XSSFSheet sheet = workbook.createSheet("Emp Info");
	
	ArrayList<Object[]> empdata =new ArrayList<Object[]>();
	
	empdata.add(new Object[]{"empId","empName","empJob"});
	empdata.add(new Object[]{"101","Siva","SoftwateTester"});
	empdata.add(new Object[]{"102","Pavan","Manager"});
	empdata.add(new Object[]{"103","Bhiswas","Engineer"});
	empdata.add(new Object[]{"104","Sai","Doctor"});
	empdata.add(new Object[]{"105","Lakshmi","Teacher"});
	
	// for ..each loop
	int rownum= 0;
	for(Object[] emp:empdata) {
	XSSFRow row = sheet.createRow(rownum++);
	
	int cellnum = 0;
	for(Object value:emp) {
	XSSFCell cell= row.createCell(cellnum++);
	
	if(value instanceof String)
		cell.setCellValue((String)value);
	if(value instanceof Integer)
		cell.setCellValue((Integer)value);
	if(value instanceof Boolean)
		cell.setCellValue((Boolean)value);
	}
	}
	
	String filePath = "D:\\ExcelFiles\\SaiExcel.xlsx";
	FileOutputStream outstreem =new FileOutputStream(filePath);
	workbook.write(outstreem);
	outstreem.close();
	System.out.println("Employee Data Written Sucessfully");
	
}
}
	
	
	