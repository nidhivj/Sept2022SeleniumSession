package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationConcept {
	
	//in a table select multi option with same name or select single name in one page or so many pages using next method 
	
	static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);
		
		//multiple selection:
		while(true){
			                                                                                //find element give NoSuchElement if their is no element
			if(driver.findElements(By.xpath("//td[text()='India']")).size()>0){            //find elements give empty if list having no element that mean 0
				selectMultiCountry("India");
				
			}
			 
			
				//pagination logic: if hongkong not available on first page we have to click on next for next page
				WebElement next = driver.findElement(By.linkText("Next"));
				
				//what if any country is not mentioned thn how to come out from this using if condition
				          if(next.getAttribute("class").contains("disabled")) {
					          System.out.println("pagination is over.....");
					          break;
				          }
				
				next.click();
			    Thread.sleep(1000);
				                                                       
		
		}
		
		
		//single selection:
		
//		while(true){                                                                               //find element give NoSuchElement if their is no element
//			if(driver.findElements(By.xpath("//td[text()='Denmark']")).size()>0){            //find elements give empty if list having no element that mean 0
//				selectCountry("Denmark");
//				break;
//			}
//			 
//			else {
//				//pagination logic: if hongkong not available on first page we have to click on next for next page
//				WebElement next = driver.findElement(By.linkText("Next"));
//				
//				//what if any country is not mentioned thn how to come out from this using if condition
//				          if(next.getAttribute("class").contains("disabled")) {
//					          System.out.println("pagination is over... country is not found...");
//					          break;
//				}
//				
//				next.click();
//			    Thread.sleep(2000);
//				}                                                        
		
//		}

	}

    public static void selectCountry(String country) { 
    	//giving xpath for country and on left side having checkbox so to click on that this xpath is given
    	driver.findElement(By.xpath("//td[text()='"+country+"']//preceding-sibling::td/input[@type='checkbox']")).click();
    
    }
    
    public static void selectMultiCountry(String country) {
    	List<WebElement> checkboxList = 
    	driver.findElements(By.xpath("(//td[text()='"+country+"'])/preceding-sibling::td/input[@type='checkbox']"));
   
    	for(WebElement e : checkboxList) {
    		e.click();
    	}
    
    }


}
