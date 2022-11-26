package listenerPractice;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listenerPractice.Base;
import listenerPractice.CustomListener;

@Listeners(CustomListener.class)
public class ScreenshotTest extends Base {

	@BeforeMethod
	public void setUp() {
		initialization();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test
	public void takeScreenshotTest() {
		Assert.assertEquals(false, true);
	}

}
