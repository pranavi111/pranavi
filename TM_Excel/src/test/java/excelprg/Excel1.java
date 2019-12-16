package excelprg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	public static void main(String[] args) throws Exception {
	
File f=new File("C:\\Users\\Bharath\\eclipse-workspace\\TM_Excel\\Test1\\Test1.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("DATA1");
		
		XSSFRow row=sheet.getRow(1);
		
		XSSFCell cell=row.getCell(1);
		
		
		switch (cell.getCellTypeEnum()) {
		case STRING:
			System.out.println(cell.getStringCellValue());
			break;
			
		case NUMERIC:
			System.out.println(Integer.valueOf((int) cell.getNumericCellValue()));
			break;

		default:
			break;
		}
		
		
		//get total number of rows
		
		System.out.println(sheet.getLastRowNum());
		
		//get total number of columns
		
		System.out.println(sheet.getRow(0).getLastCellNum());
		
	}

}
