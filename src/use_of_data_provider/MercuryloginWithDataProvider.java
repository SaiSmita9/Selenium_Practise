package use_of_data_provider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MercuryloginWithDataProvider {

	 @DataProvider(name="MercuryData")
	 public String[][] getData(){
		 String[][] data=new String[2][2];
		 data[0][0]="abdul";
		 data[0][1]="abdul";
		 data[1][0]="sridhar";
		 data[1][1]="sridhar";
		 return data;
	 }
	 
	  @Test(dataProvider="MercuryData")
	  public void login(String username,String password) {
		  WebDriver driver = new ChromeDriver();
			driver.get("http://www.newtours.demoaut.com");
			WebElement un=driver.findElement(By.name("userName"));
			un.sendKeys(username);
			WebElement pwd=driver.findElement(By.name("password"));
			pwd.sendKeys(password);
			WebElement login=driver.findElement(By.name("login"));
			login.click();
			driver.findElement(By.linkText("SIGN-OFF")).click();
			driver.close();
	  }
	}


