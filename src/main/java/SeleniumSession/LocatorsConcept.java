package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		ElementUtil eleUtil = new ElementUtil(driver);         //creating object of elementUtil for do send keys
		
		//id,name,class name are attribute they are not computable with xpath an selectors with both are not attribute 
		// xpath and selectors are locators strategies
		//1. ID: unique attribute
		
		//By emailid = By.id("input-email");
		//eleUtil.doSendKeys(emailid,"test@gmail.com");
		
		
		//2. name: can be duplicate
		//driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		
		//By emailid = By.name("email");
	    //eleUtil.doSendKeys(emailid,"test@gmail.com");
				
	    
	    //3. class name: can be duplicate
	    //driver.findElement(By.className("form-control")).sendKeys("naveen");
	    
	    // in page when it open selenium check from starting and className locator is in search also and email and in password also it put who come first is search
	    // so it is not good bcz we want to put value anywhere else and it put it anywhere
	    
	    //so above these three option "id" is better option  after this "name"

	    
	    //4.Xpath: 
	    //xpath is not a attribute... it is a simple of address of web element in HTML DOM. xpath is a static method and return "By" reference
	    // to get xpath--> go on <input--> click right button go on copy---> choose option copy Xpath---> ctrl+f---> you can see somewhere on page that find by String, xpath,selector,.. etc
	    //hear paste that copy xpath.... then it highlight the particular action and shows 1 of 1 on the bar
	   // driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gamil.com");
	   // driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test123");
	    
	    //for login
	   // driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();	    
		
	    
	    //xpath is a static method and return "By" reference
//	    By emailid = By.xpath("//*[@id=\"input-email\"]");
//		By password = By.xpath("//*[@id=\"input-password\"]");
//		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//	
//	
//		eleUtil.doSendKeys(emailid,"test@gmail.com");
//		eleUtil.doSendKeys(password, "test123");
//		eleUtil.doClick(loginBtn);

		
		//5. CSS selector:not an attribute
		
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("test123");
//		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
//		
		//6. linkText: only for links: Can be duplicate...  like login page have registration page so to go on that page we have link of that page when we inspect where we get
		//<a href="https://naveenautomationlabs.com/opencart/index.php?route=account/register" class="list-group-item">Register</a>
		//in above line the starting <a is represent the link and we get Register at the end
		
		//driver.findElement(By.linkText("Register")).click();
		
		//By registerlink = By.linkText("Register");
		//eleUtil.doClick(registerlink);
		
		//7.partial links text: only for links :Can be duplicate
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();  //"Forgotten Password" taken from inspect
		
		// what if forgotten password or forgotten userid for which one you pass this.. so linktext is better option
		
		//8. tagName: HTML tag: Can be duplicate
		//<h2>New Customer</h2>
//		String header = driver.findElement(By.tagName("h2")).getText();    //get taxt will give string so we store in string
//		System.out.println(header);
		
		By header = By.tagName("h2");
		String h2 = eleUtil.doGetElementText(header);
		System.out.println(h2);
		
		//these are 8 locators all are methods and they all are coming from "By" class and all the methods will return "By reference"
	    
		
		
	}
		 public static WebElement getElement(By locator) {
	    	 return driver.findElement(locator);
	     }
		 
		 public static void doSendKeys(By locator, String value) {
				getElement(locator).sendKeys(value);
			}
		 public static void doClick(By locator) {
			 getElement(locator).click();
		 }
		
	
		 public static String doGetElementText(By locator) {
			 return getElement(locator).getText();
		 }
	
}
