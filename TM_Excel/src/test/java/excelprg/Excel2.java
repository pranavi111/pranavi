package excelprg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2 {

	public static void main(String[] args) throws Exception {

		File f=new File("TestData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Data");
		
		XSSFRow row=sheet.createRow(0);
		
		XSSFCell cell=row.createCell(0);
		
		cell.setCellValue("Writing excel Data");
		
		
		FileOutputStream fos=new FileOutputStream(f);
		workbook.write(fos);
		fos.flush();
		fos.close();
		

	}

}
