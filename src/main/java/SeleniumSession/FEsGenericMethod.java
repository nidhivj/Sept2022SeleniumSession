package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FEsGenericMethod {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		
		//to capture footer link
		//so this xpath having parent to child indirect connection thats why we use //a to get the child
		//and hear we use contains... why?? latter we will discuss in xpath  
		
//		By footerLink = By.xpath("//div[contains(@class, 'footer-left-section')]//a");
//
//		int actFooterCount = totalElementsCount(footerLink);
//		System.out.println(actFooterCount);
//		if(actFooterCount== 21) {
//			System.out.println("footer count -- PASS");
//		}
//		
//		List<String> actEleTextList = getElementsTextList( footerLink );   //we call the below method and store in listString giving the name actEleTextList
//		System.out.println(actEleTextList);
//	
//		//if any is contain or not
//		if(actEleTextList.contains("Investors")) {System.out.println("pass");}         //this is for sanity or smoke testing
//		if(actEleTextList.contains("Affiliates")) {System.out.println("pass");}
//		if(actEleTextList.contains("Contact us")) {System.out.println("pass");}
		
		//assignment
	
		By footerLink = By.xpath("//div[contains(@class, 'copyrights-nav hide-in-mobile')]/a");
		int actEleCount = totalElementsCount(footerLink);
		System.out.println(actEleCount);
		if(actEleCount==7) {
			System.out.println("footer count --- pass");
		}
		
		List<String> actEleTextList = getElementsTextList(footerLink); 
		System.out.println(actEleTextList);
		
		if(actEleTextList.contains("Privacy Notice")) {System.out.println("pass");}
		
		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	//to count the element
	public static int totalElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<String> getElementsTextList(By locator) {
		
     // List<WebElement> eleList = driver.findElements(locator);
		List<WebElement> eleList = getElements(locator);          //we make a generic method of getElements so we call it hear directly or mention it hear insted of above 
		
		List<String> eleTextList = new ArrayList<String>();      //the physical capacity of this list is write now 0 , and virtual capacity is 10...
		
		for(WebElement e : eleList) {
			String text = e.getText();
			//System.out.println(text);
			eleTextList.add(text);               //this method hear to written to add the element if we want to add more...
		
		//so what if tomorrow the size of footer will change like 21 to 25 links are available than what to do so.. we have to store in dynamic array
			//so we have to create one array list
		
		}
	    return eleTextList;
	}
	
}






















