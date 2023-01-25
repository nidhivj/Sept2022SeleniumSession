package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitForFrame {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//     	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
     	
		 waitForFramePresentAndSwitch(2, 5);
		 
		String header = driver.findElement(By.xpath("/html/body/h2")).getText();
     	System.out.println(header);
     	
     	driver.switchTo().defaultContent();
     	
      
		
		

	}

	public static void waitForFramePresentAndSwitch(int frameIndex, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
     	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	
	public static void waitForFramePresentAndSwitch(By frameLocator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
     	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}

	public static void waitForFramePresentAndSwitch(WebElement frameElement, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
     	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
	
	public static void waitForFramePresentAndSwitch(String framenameOrId, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
     	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framenameOrId));
	}










}
