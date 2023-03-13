package excelExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream fis = new FileInputStream(".\\data\\RegistrationData.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//workbook.getSheetAt(0);				//index --- start from 0
		
		XSSFSheet sheet = workbook.getSheet("smokeTest");					//SheetName - smokeTest
		
		
		
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
