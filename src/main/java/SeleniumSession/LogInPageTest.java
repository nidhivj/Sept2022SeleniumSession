package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPageTest {

	public static void main(String[] args) {
		
		BrowserUtility brUtil = new BrowserUtility();   //creating object of browserUtility class to call the driver for launch browser
		WebDriver driver = brUtil.launchBrowser("chrome");
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(brUtil.getpageTitle());
		
		By emailid = By.id("input-email");        //by.id locators                 //taking from WebElementConcept class
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);         //creating object of elementUtil for do send keys
		eleUtil.doSendKeys(emailid,"naveen@gmail.com");
		eleUtil.doSendKeys(password, "test123");
		
		//brUtil.quitBrowser();   //this is call from browser utility class
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
