package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDown {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(3000);
		
	//  By locator
		By choices = By.xpath("//span[@class='comboTreeItemTitle']");
		
	//1. Single selection:	
	//calling method(By locator. String choice)
	//	selectChoice(choices, "choice 1");
		
	//2. multi selection:
		//selectChoice(choices, "choice 1", "choice 2", "choice 2 3","choice 7");
		
		
	//3 selecting all choices:
	//	selectChoice(choices, "all");
		
	//4. 
		selectChoice(choices, "choice 9");  //that doesn't exist 
		                                    //for this we put another boolean condition with flag
		
	}

	//generic method for select the choice
	                                       //String... or String choice[] both are presenting String array for multi selection we have use this
	//writing documentation: /** then enter
	/**
	 * this method is handling single, multiple and all choices selection
	 * this method is also handling if choice is not available
	 * please pass the choices which are oresent in case of multiple choice selection
	 * @param locator
	 * @param choice
	 */
	public static void selectChoice(By locator, String... choice) {
		//now inspect the choices
		//creating a connection btw parent and child
		//no need to parent and child xpath directly create the xpath for child
		//in this ul-->li--->span a tree of parent and child
		
		                                                 //this xpath is mention above and store in By locator(choice) so hear we remove it mention below...
	//	List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));  //it gives us 44 selection choices but we are bother about 14 only
		
		List<WebElement> choiceList = driver.findElements(locator); 
		boolean flag = false;
		
		
//		for(WebElement e : choiceList) {                                            //loop start from hear choice 1,2,3.... everthing start from hear than go on for loop
//			String text = e.getText();
////			System.out.println(text);
////			
////			//selecting on choice so putting if condition
////			            //this choice coming from "String choice" 
////			if(text.equals(choice)) {                               //this loop for single selection
////				e.click();
////				break;
////			}
//			
//			   for(int i=0; i<choice.length; i++) {                                   //for loop check the condition  and send it in if- condition
//				   if(text.equals(choice[i])) {                                       //if condition check that weather the condtion satisfy or not 
//					   e.click();                                                     //after condition match it give the command of click
//					   break;                                                        // and then this for loop is break
//				   }
//			   }
//		}
		 
		if(!choice[0].equalsIgnoreCase("all")) {            //in this we put condition if choice[0] equal all then this condition make flase bcz of this (!)
			for(WebElement e : choiceList) {                             //and go on else part there it select all the choices              
				String text = e.getText();                              // so all selction method works this way and for multi or single selection
				for(int i=0; i<choice.length; i++) {                      // that choice[0] condition make false and (!) this make it ture and select what choices in             
					   if(text.equals(choice[i])) {                        // single or multi option               
						   flag = true;
						   e.click();                                                     
						   break;                                                        
					   }
				   }
			}	
		}
		
		else {
			//all selection logic
			try {
			for(WebElement e : choiceList) {
				 flag = true;
				e.click();                          //it gives error bcz we have 14 choices out of 44 so to handle this error we use try catch
			} 
			}	
			catch(Exception e) {
				}
			}
		if(flag == false) {
			System.out.println("choice is not available.." +choice[0]);
		}
	}
	
	
	
	
}
