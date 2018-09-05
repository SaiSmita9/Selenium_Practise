package use_of_property_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_of_property_file {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties property = new Properties();
		try {
			FileInputStream fs =new FileInputStream("C:\\Users\\Smita\\eclipse-workspace\\Selenium_Practise\\src\\utilities\\config.properties");
			property.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver", property.getProperty("driverpath"));
		WebDriver driver=new ChromeDriver();
		driver.get(property.getProperty("url"));
		Thread.sleep(5000);

	}

}
