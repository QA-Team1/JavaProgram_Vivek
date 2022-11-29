package com.BasicPractice;

import org.testng.annotations.*;

/*@BeforeSuite -- setup system property for chrome.
@BeforeTest -- launchBrowser
@BeforeClass -- login to app
@BeforeMethod -- enter URL
@Test3 -- google logo test
@AfterMethod -- logout from the app
@BeforeMethod -- enter URL
@Test1 -- Google Title Test
@AfterMethod -- logout from the app
@BeforeMethod -- enter URL
@Test2 -- search test
@AfterMethod -- logout from the app
@AfterClass -- Close Browser
@AfterTest -- delete all cookies

*/

public class TestNgBasics {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("@BeforeSuite -- setup system property for chrome.");
		
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("@BeforeTest -- launchBrowser");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("@BeforeClass -- login to app");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("@BeforeMethod -- enter URL");
	}

	@Test
	public void googleTitleTest() {
		System.out.println("@Test1 -- Google Title Test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("@Test2 -- search test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("@Test3 -- google logo test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("@AfterMethod -- logout from the app");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass -- Close Browser");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("@AfterTest -- delete all cookies");
	}
}
