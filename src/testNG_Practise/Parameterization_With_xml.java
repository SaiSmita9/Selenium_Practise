package testNG_Practise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_With_xml {
	
	@Test
		//@Parameters("Browsers")
	public void parameterizedTest(String Browser){
		 if(Browser.equals("firefox")){
		 System.out.println("Open Firefox Driver");
		 }else if(Browser.equals("chrome")){
		 System.out.println("Open Chrome Driver");
		 }
		 } 
	
}
