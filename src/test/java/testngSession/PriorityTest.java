package testngSession;

import org.testng.annotations.Test;

public class PriorityTest {
	
	//we we assign the priority then the test cases run according to assign priority
	//priority assign can be negative or zero so it run according them
	//otherwise if no priority it run according to alphabetic and 
	//what if some are mention priority some are non priority then it will run first non priority  by alphabetic then after priority but negative or zero priority comes first
	
	

	@Test(priority = 0)
	public void aTest() {
		System.out.println("aTest");	
	}
	
	@Test(priority = -3)
	public void bTest() {
		System.out.println("bTest");	
	}
	
	@Test(priority = 1)
	public void cTest() {
		System.out.println("cTest");	
	}
	
	@Test
	public void dTest() {
		System.out.println("dTest");	
	}
	
	@Test(priority = 2)
	public void eTest() {
		System.out.println("eTest");	
	}
	
	
	
	
	
	
	
	
}
