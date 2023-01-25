package testngSession;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	//CRUD
	//Create a user + assert ----T1
	//Create a user + get a user + assert --- T2
	//Create a user + get a user + update the same user with phone + assert --- T3
	//Create a user + get a user + delete the same user + assert --- T4
	
	//AAA -- Arrange, Act , Assert
	//test cases should be independent
	//it should not maintain any order
	//can be executed in any order
	
	//Assert: only one assertion should be there in a test case
	//we can avoid priority as well for the test cases
	
	//My Notes:
	//creating dependency 
	//in this if we assign any dependecy on any test case like search test's dependency apply on addToCart test
	//so in this if searchTest have some exception then it the addToCartTest will go on wait state
	//so when searchTest is complete and case passed then addToCartTest will execute 
    //if we put Test(enabled = false) this test will not run and rest are run
	//if we put Test(invocationCount = 0) also this test will not run
	
	@Test
	public void searchTest() {
		System.out.println("search test");
	//	int i = 9/0;
		int i = 9/3;
	}
	
	@Test(dependsOnMethods = "searchTest")
	public void addToCartTest() {
		System.out.println("addToCartTest");
		int j = 9/0;
	}
	
	@Test(dependsOnMethods = "addToCartTest")
	public void paymentTest() {
		System.out.println("paymentTest");
	}
	
	
	
	
	
	
	
	
	
	
}
