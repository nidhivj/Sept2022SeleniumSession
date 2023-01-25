package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeconcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		    driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
		
			
		//amazonlogo on page
			
		//	String hrefVal = driver.findElement(By.id("nav-logo-sprites")).getAttribute("href");   //<a href="/ref=nav_logo" id="nav-logo-sprites" class="nav-logo-link nav-progressive-attribute" aria-label="Amazon">
			                                              //getAttribute methos is use for capture the attribute value you just need to pass the attribute key/name hear it will capture that
			                                                                     // so the attribute are in above line.. href, id, clas, aria-lable... so we took "href" attribute from hear
		//     System.out.println(hrefVal);  // the output will be href="/ref=nav_logo"
		     //we get the output is "https://www.amazon.com/ref=nav_logo"

//         WebElement ele = driver.findElement(By.id("nav-logo-sprites")); 
//
//         String hrefVal = ele.getAttribute("href");
//         String lable = ele.getAttribute("aria-label");               //aria-label="Amazon"
//		 
//         System.out.println(hrefVal);   //output : https://www.amazon.com/ref=nav_logo
//         System.out.println(lable);     //output:  Amazon
//         
//         
//         //Search on amazon page
//         
//         //<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="" 
//         //class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search" spellcheck="false">
//         
//         String type = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("type");      //<input type="text"    this attribute we take
//         System.out.println(type);       //output: text
       
         
			By logo = By.id("nav-logo-sprites"); 
			By search = By.id("twotabsearchtextbox");
			
			String hrefVal = doGetAttributeValue(logo, "href");
			String lable = doGetAttributeValue(logo, "aria-label");
			String type = doGetAttributeValue(search, "type");
			
			System.out.println(hrefVal);
			System.out.println(lable);
			System.out.println(type);
         
         
         
         
         
	}
	
	public static WebElement getElement(By locator) {   //getElement asking for By locators
		return driver.findElement(locator);
	}
         
	public static String doGetAttributeValue(By locator, String attrName ) {
		return getElement(locator).getAttribute(attrName);
	}
	
	
         
         
         
         
         
		     
		     
		

	

}
