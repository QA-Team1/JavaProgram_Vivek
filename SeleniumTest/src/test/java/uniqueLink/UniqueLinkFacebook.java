package uniqueLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UniqueLinkFacebook {

	public static void main(String[] args) throws IOException, InterruptedException {

		int count = 0;
		int count1 = 0;
		int count2 = 0;

		System.setProperty("webdriver.edge.driver", "D:\\QA_Class\\Driver\\edgedriver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		// To print total number of the links in WebPage.
		System.out.println("Total Links : " + links.size());

		System.out.println();

		// Converting link list into Set to find unique links.
		Set<String> uniqueLinks = new HashSet<String>();

		for (WebElement link : links) {

			System.out.println(count + " : " + link.getAttribute("href"));
			uniqueLinks.add(link.getAttribute("href"));
			count++;

		}

		System.out.println();

		System.out.println("Total unique links : " + uniqueLinks.size());

		for (String uLink : uniqueLinks) {
			System.out.println(count1 + " : " + uLink);
			count1++;
		}

		// To print links in next line.
		Iterator<String> itr = uniqueLinks.iterator();

		// To convert set into ArrayList.
		ArrayList<String> uniqueLinkList = new ArrayList<String>();

		while (itr.hasNext()) {

			uniqueLinkList.add(itr.next());
			count1++;
		}

		System.out.println();
		System.out.println("Checking for Broken Links....");
		System.out.println();

		for (int i = 0; i < uniqueLinkList.size(); i++) {

			URL url = new URL(uniqueLinkList.get(i));

			HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();

			Thread.sleep(2000);

			int rescode = httpConn.getResponseCode();

			if (rescode >= 400) {
				System.out.println("Broken link - " + url);
				count2++;
			}

			else {
				System.out.println("Valid link - " + url);
				
			}

		}

		System.out.println();
		System.out.println("Total Broken Link : " + count2);
		driver.close();
	}

}
