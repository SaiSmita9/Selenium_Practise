package testNG_Practise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

	//@Test
	//@Parameters("Browsers")
	public static void browserTest(String Browser)
	{
		if (Browser.equalsIgnoreCase("chrome")){
			System.out.println("its Chrome");
		}
	}
	
	@Test
	public static void print()
	{
		browserTest("Chrome");
	}
}
