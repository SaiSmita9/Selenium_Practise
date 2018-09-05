package use_of_property_file;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class ReadDataFromExcelUsingPOI_Testng {
 WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
 
    @BeforeTest
 public void initialization(){
         
    }
   
 @Test
 public void readExcel() throws IOException{
 // Import excel sheet.
 File src=new File("C:\\Users\\Smita\\eclipse-workspace\\Selenium_Practise\\src\\utilities\\user_loogin_details.xlsx");   
 // Load the file.
 FileInputStream fis = new FileInputStream(src);
 // Load he workbook.
 workbook = new XSSFWorkbook(fis);
 // Load the sheet in which data is stored.
 sheet= workbook.getSheetAt(0);
 for(int i=0; i<=sheet.getLastRowNum(); i++){
	 for(int j=0; j<=sheet.getLastRowNum(); j++) {
 // Import data for Email.
 cell = sheet.getRow(i).getCell(j);
 System.out.print(cell +"\t");
 }
 
	System.out.println();
 }
 }
 
}