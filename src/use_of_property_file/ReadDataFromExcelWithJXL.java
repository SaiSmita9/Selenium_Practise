package use_of_property_file;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadDataFromExcelWithJXL {
	public void readExcel() throws BiffException, IOException {
		String FilePath = "C:\\Users\\Smita\\eclipse-workspace\\Selenium_Practise\\src\\utilities\\user_loogin_details.xls";
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		// To get the access to the sheet
		Sheet sh = wb.getSheet("Sheet1");
		// To get the number of rows present in sheet
		int totalNoOfRows = sh.getRows();
		// To get the number of columns present in sheet
		int totalNoOfCols = sh.getColumns();
		for (int row = 0; row < totalNoOfRows; row++) {
			for (int col = 0; col < totalNoOfCols; col++) {
			System.out.print(sh.getCell(col, row).getContents() + "\t");
			}
			System.out.println();
			}
		}
		public static void main(String args[]) throws BiffException, IOException {
		ReadDataFromExcelWithJXL DT = new ReadDataFromExcelWithJXL();
		DT.readExcel();
		}
	 



}
