package excelExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel2 {

	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream fis = new FileInputStream(".\\data\\RegisterStudent.xls");
		
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		//workbook.getSheetAt(0);				//index --- start from 0
		
		HSSFSheet sheet = workbook.getSheet("smokeTest");					//SheetName - smokeTest
		
		
		
		int rowCount = sheet.getLastRowNum();
		
		
		//int rowCount1 = sheet.getPhysicalNumberOfRows();
		
		
		int columnCount =  sheet.getRow(0).getLastCellNum();			//accessing row 0 
		
		System.out.println("No of Rows: " + rowCount);
		//System.out.println("No of Rows: " + rowCount1);
		System.out.println("No of Columns: " + columnCount);
		
		
		for (int i = 1; i <= rowCount; i++) {
			
			
			
			String firstName = sheet.getRow(i).getCell(0).toString();
			
			System.out.println("FirstName: " + firstName);
			
		}
		
		
		
	}

}
