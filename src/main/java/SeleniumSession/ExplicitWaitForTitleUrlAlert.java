package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitForTitleUrlAlert {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
//		//for title
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		driver.findElement(By.linkText("Register")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//      wait.until(ExpectedConditions.titleContains("Register"));
//   	System.out.println(driver.getTitle());
//		String actualTitle = waitForTitleContains("Register", 5);
//      System.out.println(actualTitle);
//		
	
		//for url:
//		driver.get("https://www.amazon.com/");
//		driver.findElement(By.linkText("Careers")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//      wait.until(ExpectedConditions.titleContains("jobs"));
//	    System.out.println(driver.getCurrentUrl());
//		//https://www.amazon.jobs/en/
		
		//for alerts:
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		//driver.switchTo().alert();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//     	Alert alerts = wait.until(ExpectedConditions.alertIsPresent());   //here importing alert class and this statement waiting for alert and switching to alert also
//    	System.out.println(alerts.getText());                             //and until method internally switch to alert don't need to write the switchto() method
//     	alerts.accept();
		
		waitForAlertPresentAndSwitch(10);
	
	
	
	
	
	
	}
	
//	public static String waitForTitleContains(String titleFractionValue, int timeOut) {
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
//		if(wait.until(ExpectedConditions.titleContains(titleFractionValue))){
//			return driver.getTitle();
//		}
//		else {
//			System.out.println("expected title is not visible..");
//			return null;
//		}
//	}
//	
//    public static String waitForTitleIs(String titleValue, int timeOut) {
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
//		if(wait.until(ExpectedConditions.titleIs(titleValue))){                give the exact title
//			return driver.getTitle();
//		}
//		else {
//			System.out.println("expected title is not visible..");
//			return null;
//		}
//	}

	//for url:
//     public static String waitForUrlContains(String urlFractionValue, int timeOut) {
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
//		if(wait.until(ExpectedConditions.urlContains(urlFractionValue))){
//			return driver.getCurrentUrl();
//		}
//		else {
//			System.out.println("expected url is not visible..");
//			return null;
//		}
//	}
//	
//    public static String waitForUrlIs(String urlValue, int timeOut) {
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
//		if(wait.until(ExpectedConditions.urlToBe(urlValue))){                          //give exact url
//			return driver.getCurrentUrl();
//		}
//		else {
//			System.out.println("expected url is not visible..");
//			return null;
//		}
//	}
	
//	 public static String waitForUrlContains(String urlFractionValue, int timeOut) {
//			
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
//			if(wait.until(ExpectedConditions.urlContains(urlFractionValue))){
//				return driver.getCurrentUrl();
//			}
//			else {
//				System.out.println("expected url is not visible..");
//				return null;
//			}
//		}
//		
//	    public static String waitForUrlIs(String urlValue, int timeOut) {
//			
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
//			if(wait.until(ExpectedConditions.urlToBe(urlValue))){
//				return driver.getCurrentUrl();
//			}
//			else {
//				System.out.println("expected url is not visible..");
//				return null;
//			}
//		}
	
	public static Alert waitForAlertPresentAndSwitch(int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     	return wait.until(ExpectedConditions.alertIsPresent());   //here importing alert class and this statement waiting for alert and switching to alert also
	}
	
	public static String getAlertText(int timeOut) {
		return waitForAlertPresentAndSwitch(timeOut).getText();
	}

	public static void acceptAlert(int timeOut) {
		waitForAlertPresentAndSwitch(timeOut).accept();
	}
	
	public static void dismissAlert(int timeOut) {
		waitForAlertPresentAndSwitch(timeOut).dismiss();
	}

	public static void alertSendKeys(int timeOut, String value) {
		waitForAlertPresentAndSwitch(timeOut).sendKeys(value);
	}











}
