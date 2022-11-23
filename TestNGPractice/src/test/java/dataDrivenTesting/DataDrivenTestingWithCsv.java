package dataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestingWithCsv {
	@DataProvider(name = "dataProvider")
	public Object[][] dataProviderMethod(){
		Object[][] testObjArray = null;
		
		try {
			testObjArray = CsvUtils.getTableArray("D:\\QA_Class\\TestData\\UserID_Password.csv");
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return testObjArray;
		
	}
	
	@Test(dataProvider = "dataProvider")
	public void test(String userName, String password) {
		System.out.println("User Name: " +userName +" Password: " +password);
		
	}
	
	
}
