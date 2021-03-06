package use_of_config_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class property_file_use {
	
	@Test
	public void TestOR() throws IOException{
	 
	// Specify the file location I used . operation here because
	//we have object repository inside project directory only
	File src=new File("C:\\Users\\Smita\\eclipse-workspace\\Selenium_Practise\\Object.Repo.properties");
	 
	// Create  FileInputStream object
	FileInputStream fis=new FileInputStream(src);

	// Create Properties class object to read properties file
	Properties pro=new Properties();
	 
	// Load file so we can use into our script
	pro.load(fis);
	 
	System.out.println("Property class loaded");
	 
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	// Open FirefoxBrowser
	WebDriver driver=new ChromeDriver();
	 
	// Maximize window
	driver.manage().window().maximize();
	 
	// Pass application
	driver.get("http://www.facebook.com");
	 
	// Enter username here I used keys which is specified in Object repository.
	// Here getProperty is method which
	// will accept key and will return value for the same
	driver.findElement(By.xpath(pro.getProperty("facebook.login.username.xpath"))).
	sendKeys("Selenium@gmail.com");
	 
	// Enter password here I used keys which is specified in Object repository.
	// Here getProperty is method which
	// will accept key and will return value for the same
	driver.findElement(By.xpath(pro.getProperty("facebook.login.password.xpath"))).
	sendKeys("adsadasdas");
	 
	// Click on login button here I used keys which is specified in Object repository.
	// Here getProperty is method which
	// will accept key and will return value for the same
	driver.findElement(By.xpath(pro.getProperty("facebook.login.Signup.xpath"))).click();
	 
	}
	 

	 

}
