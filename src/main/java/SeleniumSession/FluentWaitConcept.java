package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		//fluent wait is a class--> implementing--->(Wait interface)-->UnTill()
		//WebDriverWait extending FluentWait or //WebDriverWait is child of FluentWait
		//difference b/w WebDriverWait and FluentWait:
		//
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		By forgotPwd = By.linkText("Forgot Password?");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				          .withTimeout(Duration.ofSeconds(10))
				          .pollingEvery(Duration.ofSeconds(2))
				          .ignoring(ElementNotInteractableException.class)
				          .ignoring(NoSuchElementException.class)
				          .ignoring(StaleElementReferenceException.class)
				          .withMessage("Element not found on the page...");
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(forgotPwd));
		ele.click();
		

	}

	public static WebElement waitForElementToBeVisibleWithFluentWait(By locator, int timeOut, int intervalTime) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		          .withTimeout(Duration.ofSeconds(timeOut))
		          .pollingEvery(Duration.ofSeconds(intervalTime))
		          .ignoring(ElementNotInteractableException.class)
		          .ignoring(NoSuchElementException.class)
		          .ignoring(StaleElementReferenceException.class)
		          .withMessage("Element not found on the page...");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
