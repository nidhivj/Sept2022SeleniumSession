package testngSession;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	//i want execute same test multiple times so we use invocation count
	//if we put Test(enabled = false) this test will not run and rest are run
	//if we put Test(invocationCount = 0) also this test will not run
		
	
	@Test(invocationCount = 10)
	public void searchTest() {
		System.out.println("search test");
	}

}
