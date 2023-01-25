package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isElementDisplayed {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
//		boolean flag = driver.findElement(By.name("search")).isDisplayed();     //isDisplayed method is boolean type so we have to store in boolean
//		
//		if(flag) {
//			System.out.println("ele is displayed");
//		}
//		else {
//			System.out.println("ele is not displayed");
//		}
		By search = By.name("search");
		By logo = By.xpath("//img[@title = 'naveenopencart']");
		
//		if(doIsDisplayed(search)) {System.out.println("pass");}
//		if(doIsDisplayed(logo)) {System.out.println("pass");}
		
//		int count = driver.findElements(search).size();
//		if(count == 1) {
//			System.out.println("ele is displayed");
//		}
		
		if(isSingleElementExit(search)) {System.out.println("ele is displayed");}
		if(isSingleElementExit(logo)) {System.out.println("ele is displayed");}
	    
	
	}
	
	public static boolean isSingleElementExit(By locator) {
	   int actCount = getElements(locator).size();
	   System.out.println("actual count of element ===" +actCount);
	      if(actCount == 1) {
	    	  return true;
	      }
	      return false;
	}
	
	public static boolean isTwoElementExit(By locator) {
		   int actCount = getElements(locator).size();
		   System.out.println("actual count of element ===" +actCount);
		      if(actCount == 2) {
		    	  return true;
		      }
		      return false;
	}   
	
	public static boolean isMultiElementExit(By locator) {
		   int actCount = getElements(locator).size();
		   System.out.println("actual count of element ===" +actCount);
		      if(actCount>1) {
		    	  return true;
		      }
		      return false;
	}  //the both two are example of method overloading 
	                                                      //expected element count
	public static boolean isMultiElementExit(By locator, int expElementCount) {
		   int actCount = getElements(locator).size();
		   System.out.println("actual count of element ===" +actCount);
		      if(actCount == expElementCount) {
		    	  return true;
		      }
		      return false;
	}   

	private static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
}
