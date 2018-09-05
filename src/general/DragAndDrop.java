package general;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.interactions.Action;

	public class DragAndDrop {

	   public static void main(String[] args) throws InterruptedException {
	   
		   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      //Puts a Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      // Launch website
	      driver.navigate().to("http://www.keenthemes.com/preview/metronic/templates/admin/ui_tree.html");
	      driver.manage().window().maximize();
	      
	      WebElement From = driver.findElement(By.xpath(".//*[@id='j3_7']/a"));
	      WebElement To = driver.findElement(By.xpath(".//*[@id='j3_1']/a"));
	      
	      Actions builder = new Actions(driver);
	      Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();
	      
	      dragAndDrop.perform();
	  //    driver.close();
	   }
	}

