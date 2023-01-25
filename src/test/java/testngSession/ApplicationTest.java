package testngSession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationTest {

	//global pre condition - BeforeSuite, BeforeTest, BeforeClass
	//pre condition- Before
	//test steps-- test
	//validations: actual vs expectation result---> Assertions ---> Annotation
	//post step -- After
	
	/**
	 *  BS --- connectWithDOB
      BT--- createUser
      BC--- launchBrowser
      
      BM--- login to app
      CartTest
      logout
      
      BM--- login to app
      homepageTest
      logout
      
      BM--- login to app
      searchTest
      logout
      
      closeBrowser
      ddelete user
      disconnectWithDB
	 */
	//1
	@BeforeSuite
	public void connectWithDOB() {
		System.out.println("BS --- connectWithDOB");
	}
	
	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT--- createUser");
	}
	
	//3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC--- launchBrowser");
	}
	
	//4 7 10
	@BeforeMethod
	public void login() {
		System.out.println("BM--- login to app");
	}
	
	//8
	@Test
	public void homePageTest() {
		System.out.println("homepageTest");	
	}
	
	//11
	@Test
	public void searchTest() {
		System.out.println("searchTest");
	}
	
	//5
	@Test
	public void cartTest() {
		System.out.println("CartTest");
	}
	
	//6 9 12
	@AfterMethod
	public void logOut() {
		System.out.println("logout");
	}
	
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("closeBrowser");
	}
	
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("ddelete user");
	}
	
	//15
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("disconnectWithDB");
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
