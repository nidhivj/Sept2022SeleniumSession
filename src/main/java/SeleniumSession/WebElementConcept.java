package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		
		//create a webElement + perform action on it ---> click, sendKeys, getText, isDisplayed

		//after launching the url whatever you see is wed element but not url, backword, forword...
		//how to create web element
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();            //open browser
		
		//driver.get("https://www.google.com"); 
		driver.get("https://https://naveenautomationlabs.com/opencart/index.php?route=account/login"); 
		
		//1.  Id locator
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("naveen@123");
		
		//2.
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//
//		emailId.sendKeys("naveen@gmail.com");
//		password.sendKeys("naveen@123");
		
		//3. By locator approach:
//		By emailid = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement email_id = driver.findElement(emailid);
//		WebElement pass_word = driver.findElement(password);
//		
//		email_id.sendKeys("test@gmail.com");
//		pass_word.sendKeys("test123");
//		
		
//		//4. By locator + generic function
//		By emailid = By.id("input-email");
//		By password = By.id("input-password");
//		//calling the getElement method
//		getElement(emailid).sendKeys("test@gmail.com");
//		getElement(password).sendKeys("test123");
//		
		
		//5: By locator + generic function - getElemnt() and action methods:
		
//		By emailid = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendKeys(emailid, "test@gmail.com");
//		doSendKeys(password, "test123");
		
		//6: By locator + generic function - getElemnt() and action methods in a util class
		By emailid = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailid, "test@gamil.com");
		eleUtil.doSendKeys(password, "test@123");
		
		
  }	
	     public static WebElement getElement(By locator) {
	    	 return driver.findElement(locator);
	     }
	    
		public static void doSendKeys(By locator, String value) {
			getElement(locator).sendKeys(value);
		}
		

		//in real time projects 1 is not the write way for the project bcz we have generate every time a new web element for different email id
		// the 2 approach is good bcz hear we generate the web element once and give the sendkeys for every email id
		// in 4 we use web element only once and pass the sendkeys anytime
	    // in 6 webElement Element util class can use for any application/textfields.. this approach is usability

}

    //<input type="text" name="email" value="" placeholder="E-Mail Address" id="input-email" class="form-control">
   //in upper line this "<input" is the html type


    //assignment written usename or password for the naveen automation page





   //after this all is attribute