package labApachePOI;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

  public class LP1_ExportDataInExcel {
  @Test
  public void CreateExcel1() throws Exception {

	  XSSFWorkbook workbook = new XSSFWorkbook();
	  XSSFSheet sheet = workbook.createSheet("Lucky");
	  XSSFRow row=sheet.createRow(0);
	  XSSFCell cell=row.createCell(0);
	  cell.setCellValue("Hello");
	  row.createCell(1).setCellValue("Bhiswas");
	  
	  //sheet.createRow(1);
	  sheet.createRow(1).createCell(0).setCellValue("Good Morning");
	  sheet.createRow(1).createCell(1).setCellValue("Lucky Sai");
	  
	 // File file = new File(D:\\ExcelFiles\\SaiExcel.xlsx");
	  File file = new File("D:\\ExcelFiles\\SaiExcel.xlsx");
	  FileOutputStream fos = new FileOutputStream(file);
	  workbook.write(fos);
	 fos.close();
	  
  }
}

//  public void CreateExcel() throws Exception {
//	  HSSFWorkbook workbook = new HSSFWorkbook();
//	  //HSSFSheet sheet = workbook.createSheet();
//	  HSSFSheet sheet = workbook.createSheet("Lucky");
//	  sheet.createRow(0);
//	  sheet.getRow(0).createCell(0).setCellValue("Hello");
//	  sheet.getRow(0).createCell(1).setCellValue("Bhiswas");
//	  
//	  sheet.createRow(1);
//	  sheet.getRow(1).createCell(0).setCellValue("Good Morning");
//	  sheet.getRow(1).createCell(1).setCellValue("Lucky Sai");
//	  
//	 // File file = new File("D:\\Bhiswas.xls");
//	  File file = new File("D:\\Bhiswas2.xls");
//	  FileOutputStream fos = new FileOutputStream(file);
//	  workbook.write(file);
//	  workbook.close();
//	  
//  }
//}
  
  