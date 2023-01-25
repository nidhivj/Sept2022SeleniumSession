package testngSession;

public class MyNotes {

	
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
	
	//BeforeTest will execute all the test cases together but in BeforeMethod all test cases executed one by one
	
	//*************************testng.xml**************************************//
	//testng.xml are very important it will execute all classes together like in GoogleTest, AmazonTest, OpenCartTest every has 2 test cases
	    //but all written in testng.xml file together so it will run all test means 6 test cases execute together.. so the advantage is we don't
	    //need execute all the the classes individual
	 //verbose is how detail your logs... maximum value can be 10 or minimum is 1.. so 3 and 4 verbose value is enough
	 //in this we can add hard coad value like url, browser as parameter
	 //thread-count depends on how many test cases you written.. and parallel execution done in this
	
	
	//selenium is automation library or tool
	//selenium needs testng
	//testng dosn't provide the xpath,id locators such things.. it can not open browser selenium open the browser thats why we combine them togther
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
