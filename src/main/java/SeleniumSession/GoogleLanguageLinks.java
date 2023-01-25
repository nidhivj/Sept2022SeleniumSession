package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		// google language option
		
//		By langLocator = By.xpath("//*[@id=\"SIvCob\"]/a");   
		                                                    //go on the link after inspect the "google offered in" get this xpath from div on right click "//*[@id="SIvCob"]" this
		                                                   //is parent and add in this "/a" to get direct child
		                                                  //for direct child use one single forward "/a" and for indirect child use two forward "//a"

		//		doClickOnElement(langLocator, "मराठी");        //mention the language that we need to select
		
		
		
		//assignment get links of google page below line
		
		By footerLocator = By.xpath("/html/body/div[1]/div[5]/div[2]//a");
		doClickOnElement(footerLocator, "Business");
		
	}

	public static void doClickOnElement(By locators, String Linktext) {     //after writing this we don't need to define all things for every links on page  
		
		List<WebElement> Linklist = driver.findElements(locators);   
		System.out.println("total lang links : " +Linklist.size());
		

	
		for(WebElement e : Linklist) {
			String text = e.getText();
			System.out.println(text);      //print all language
		      
			  if(text.contains(Linktext)) {        //for going on any language
		    	   e.click();
		    	   break;
		       }
			
			}
	}
	
	
	
	
	
	
	
	
}
