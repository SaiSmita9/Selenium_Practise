package gmail_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail_Login {

	public static WebDriver driver;
	@BeforeMethod
	public void setup()
	{  
		
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		driver.get("http://gmail.com");
		}
	@Test
	public void xpathtest() throws Exception
	{
		driver.findElement(By.xpath("//input[@name=\"identifier\"]")).sendKeys("saismita.rath@gmail.com");
		driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
		Thread.sleep(3000);
		String x = driver.findElement(By.xpath("//*[text()='Forgot password?']")).getText();
		System.out.println(x);
	}
	@AfterMethod
	public void teardown()
	{
	//	driver.close();
}
}
