package excelprg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel11 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Bharath\\Desktop\\Test2.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheeet1");
		
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
		
		
		System.out.println(sheet.getLastRowNum());
		
		System.out.println(sheet.getRow(0).getLastCellNum());
		
		
	}

}
