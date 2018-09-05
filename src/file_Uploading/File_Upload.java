package file_Uploading;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class File_Upload {

 public static void main(String[] args) throws IOException { 
 
 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 //To open URL "http://softwaretestingmaterial.com"
 driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
 //Locating 'browse' button
 WebElement browse =driver.findElement(By.id("uploadfile"));
 //pass the path of the file to be uploaded using Sendkeys method
 browse.sendKeys("D:\\SaiSmita\\upload.txt");
 //'close' method is used to close the browser window
// driver.close();
 }


	}


