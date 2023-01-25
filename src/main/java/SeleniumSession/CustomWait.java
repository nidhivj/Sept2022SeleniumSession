package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	
	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement retryingElement(By locator, int timeOut) {
		
		WebElement element = null;
		int attempts = 0;
		
		while(attempts < timeOut) {
			try {
			    element = getElement(locator);  //if element is not available throws exception noSuchElement	
			    System.out.println("element is found in attempt: " + attempts);
			    break;
			}
			catch(NoSuchElementException e){
				System.out.println("element is not found in attempt :"+ attempts + " for " + locator );
			    //after giving thread.sleep we didn't add throws declaration we surround it by try catch block and this thread.sleep is using here bcz wait for 1 sec
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			
			attempts++;  //attempt = 0 < timeout come inside try catch block to check condition whether the element is found or not if not thn come into
			             //catch block thn wait for 1 sec in thread.sleep thn attempts++ now attempt = 1.. and so on....
		}
		
		if(element == null) { //if element is null we have to throw the exception from FrameWorkException class.. so we create object here
			System.out.println("element is not found.. tried for :" + timeOut + " secs " + "with the interval of 500 millisecs");
			throw new FrameworkException("TimeOutException");
		}
		
		return element;
	}
	
    public static WebElement retryingElement(By locator, int timeOut, int intervalTime) {
		
		WebElement element = null;
		int attempts = 0;
		
		while(attempts < timeOut) {
			try {
			    element = getElement(locator);  //if element is not available throws exception noSuchElement	
			    System.out.println("element is found in attempt: " + attempts);
			    break;
			}
			catch(NoSuchElementException e){
				System.out.println("element is not found in attempt :"+ attempts + " for " + locator );
			    //after giving thread.sleep we didn't add throws declaration we surround it by try catch block and this thread.sleep is using here bcz wait for 1 sec
				try {
					Thread.sleep(intervalTime*1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			
			attempts++;  //attempt = 0 < timeout come inside try catch block to check condition whether the element is found or not if not thn come into
			             //catch block thn wait for 1 sec in thread.sleep thn attempts++ now attempt = 1.. and so on....
		}
		
		if(element == null) { //if element is null we have to throw the exception from FrameWorkException class.. so we create object here
			System.out.println("element is not found.. tried for :" + timeOut + " secs " + "with the interval of "+intervalTime+" millisecs");
			throw new FrameworkException("TimeOutException");
		}
		
		return element;
	}
	
	
	
	public static void main(String[] args) {
	
	driver = new ChromeDriver();
	driver.get("https://classic.freecrm.com/register/");
	By firstName = By.name("first_name11");
	retryingElement(firstName, 20, 2).sendKeys("Naveen");
		
		

	}

}
