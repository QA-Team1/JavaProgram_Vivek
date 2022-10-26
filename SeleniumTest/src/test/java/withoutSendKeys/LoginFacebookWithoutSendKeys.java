package withoutSendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginFacebookWithoutSendKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\QA_Class\\Driver\\edgedriver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.cssSelector("input#email"));
		
		WebElement password = driver.findElement(By.cssSelector("input#pass"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].value='vivek123',arguments[1].value='vivek'", email , password);
	

		
		
		
	

	}

}
