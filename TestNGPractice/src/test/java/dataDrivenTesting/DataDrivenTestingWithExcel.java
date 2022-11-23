package dataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestingWithExcel {

	@DataProvider(name = "dataProvider")
	public Object[][] dataProviderMethod(){
		Object[][] testObjArray = null;
		
		try {
			testObjArray = ExcelUtils.getTableArray("D:\\QA_Class\\TestData\\UserID_Password.xlsx", "Sheet1");
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
