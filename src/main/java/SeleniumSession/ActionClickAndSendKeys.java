package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClickAndSendKeys {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By passwrd = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
//		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(emailId), "nidhivj@gmail.com").build().perform();
//		act.sendKeys(driver.findElement(passwrd), "nidhivj@123").build().perform();
//		
//		act.click(driver.findElement(loginBtn)).build().perform();

		doActionsSendKeys(emailId, "nidhivj@gmail.com");
		doActionsSendKeys(passwrd, "nidhivj123");
		doActionsClick(loginBtn);
		
		
	
	}

	public static void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	
	
	
}
