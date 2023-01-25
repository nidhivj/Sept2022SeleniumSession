package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//b. explicitly wait:
		                   // can be applied for a specific element
		                   // its not a global wait
		                   // can be used for non web element: alerts, urls, title etc.
	     //  WebDiverWait(class)---> extending one class called---> FluentWait(class)---> implements--->wait(Interface)--> having a method--->until();
	     
		
		
		//  FluentWait ----> class
	
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		By macBook = By.linkText("MacBook");
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement mac_ele = wait.until(ExpectedConditions.presenceOfElementLocated(macBook));
//		mac_ele.click(); 
		
		waitForElementPresence(emailId, 5).sendKeys("nidhivj27@gmail.com");
	    getElement(password).sendKeys("nidhi123");
	    getElement(loginBtn).click();

	}

	//An expectation for checking that an element is present on the DOM of a page. 
	//This does notnecessarily mean that the element is visible
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	//An expectation for checking that an element is present on the DOM of a page and visible.
	//Visibility means that the element is not only displayed but also has a height and width that isgreater than 0.
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
}
