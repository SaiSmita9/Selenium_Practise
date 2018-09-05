package use_of_property_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_compatibility {

	private static WebDriver driver;
	public static Properties property;
	public static void loaddata() throws InterruptedException, IOException {
		 property = new Properties();
		try {
			FileInputStream fs =new FileInputStream("C:\\Users\\Smita\\eclipse-workspace\\Selenium_Practise\\src\\utilities\\config.properties");
			property.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void setDriver(String browsertype){
		switch(browsertype){
		 
		case "chrome":
			driver = initchromedriver();
			break;
			
		case "firefox":
			driver = initfirefoxdriver();
	      break;
	      
		case "ie":
			driver = initIEDriver();
	      break;   
	      }
		
	}

		private static WebDriver initIEDriver() {
			
			System.setProperty("webdriver.ie.driver", property.getProperty("IEDriverPath"));
			System.out.println("launch ie");
			WebDriver driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(property.getProperty("url"));
			return driver;
		}
		
	private static WebDriver initfirefoxdriver() {
		System.setProperty("webdriver.gecko.driver",property.getProperty("GeckoDriverPath"));
		    WebDriver driver = new FirefoxDriver(); 
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		    driver.get(property.getProperty("url"));
			return driver;
	}
	
	private static WebDriver initchromedriver() {
		System.setProperty("webdriver.chrome.driver", property.getProperty("ChromeDriverPath"));
		System.out.println("launch chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(property.getProperty("url"));
		return driver;
	}

}
