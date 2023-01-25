package testngSession;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	String name;
	
    @Test(expectedExceptions = ArithmeticException.class)
    public void calTest(){
	   System.out.println("calTest");
	  // int a = 9/0;
	   //now it would not fail
	   //what if we write some other exception like below
	   ExpectedExceptionConcept obj = null; //here we assign null value and below we give some name
	   obj.name = "tom"    ;                //so it comes nullPointerException then the case is fail bcz it is arithmetic exception.. to slove this see below
   }
	
    @Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
    public void calTest1(){
	   System.out.println("calTest");
	   int a = 9/0;
	   ExpectedExceptionConcept obj = null; 
	   obj.name = "tom"    ;                  //now the case didn't fail 
   }
    
    //we can put priorit and description too 
    @Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class}, priority = 1, description = "exception concept")
    public void calTest2(){
	   System.out.println("calTest");
	   int a = 9/0;
	   ExpectedExceptionConcept obj = null; 
	   obj.name = "tom"    ;                  
   }
    
	
	
	
}
