package mercury_login;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excellibrary 
{
	public String getExcelData(String sheetName,int rownum,int cellnum) throws InvalidFormatException
	{
		String val=null;
		try
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\Smita\\eclipse-workspace\\Selenium_Practise\\src\\utilities\\user_loogin_details.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetName);
			Row r=s.getRow(rownum);
			Cell c=r.getCell(cellnum);
			val=c.getStringCellValue();	
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(EncryptedDocumentException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return val;
	}
	public int getRowCount(String sheetName)
	{
		int rowCnt=0;
		try
		{
			FileInputStream fis=new FileInputStream("D://SeleniumRCM19/WebDriver123/data/data.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetName);
			rowCnt=s.getLastRowNum();
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(EncryptedDocumentException e)
		{
			e.printStackTrace();
		}
		catch(InvalidFormatException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return rowCnt;
	}
	public void setExcelData(String sheetName,int rowNum,int cellNum,String data)
	{
		try
		{
			FileInputStream fis=new FileInputStream("D://SeleniumRCM19/WebDriver123/data/data.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetName);
			Row r=s.getRow(rowNum);
			Cell c=r.createCell(cellNum);
			c.setCellValue(data);
			FileOutputStream FOS=new FileOutputStream("D://SeleniumRCM19/WebDriver123/data/data.xlsx");
			wb.write(FOS);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(InvalidFormatException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
