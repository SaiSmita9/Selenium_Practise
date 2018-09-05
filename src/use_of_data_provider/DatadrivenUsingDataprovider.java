package use_of_data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DatadrivenUsingDataprovider {

	
	  @DataProvider(name="TestData")
	  public Object[][] getData() {
		  Object[][] anArray=new Object[2][2];
		  anArray[0][0]=10;
		  anArray[0][1]=11;
		  anArray[1][0]=20;
		  anArray[1][1]=23;
		  return anArray;
	  }
	  
	  @Test(dataProvider="TestData")
	  public void myAddition(int a,int b) {
		  int c=a+b;
		  System.out.println("Addition of two no. is : " +c);
	  }
	}


