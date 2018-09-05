package use_of_property_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelUsingPOI {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook;
	    XSSFSheet sheet;
	    XSSFCell cell;
	    File src=new File("C:\\Users\\Smita\\eclipse-workspace\\Selenium_Practise\\src\\utilities\\user_loogin_details.xlsx");
	 // Load the file.
	    FileInputStream fis = new FileInputStream(src);
	 // Load he workbook.
	    workbook= new XSSFWorkbook(fis);
	    // Load the sheet in which data is stored.
		 sheet= workbook.getSheet("Sheet1");
		 
		// int col_count  = sheet.getRow(0).getLastCellNum();
		 
		 for(int i=0; i<=sheet.getLastRowNum(); i++)
		 {
			 for(int j=0; j<=sheet.getRow(0).getLastCellNum()-1; j++) 
			 {
				 cell = sheet.getRow(i).getCell(j);
				 System.out.print(cell+"\t");
			 }
			
			 System.out.println();
		 }	

	
	}

}

	 


