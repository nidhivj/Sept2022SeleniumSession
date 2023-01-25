package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserWindowWithAllWindow {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		Thread.sleep(3000);
//
//	    WebElement cookie = driver.findElement(By.xpath("//div[@class='optanon-alert-box-button optanon-button-allow']"));
//	
////	    cookie.click();                        //ElementClickInterceptedException
//	    Actions act = new Actions(driver);     //MoveTargetOutOfBoundException
//	    act.click(cookie).build().perform();
//	    
//		
//	//	driver.manage().deleteAllCookies();
//		
//		
		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href, 'facebook')]"));
//	//	WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href, 'facebook')]"));
//	//	WebElement yotubeEle = driver.findElement(By.xpath("//a[contains(@href, 'youtube')]"));
//		

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		jsUtil.clickElementByJS(fbEle);
		
//		 Actions act = new Actions(driver);
//		 act.click(fbEle).build().perform(); //MoveTargetOutOfBoundsException
//		fbEle.click();  //ElementNotInteractableException
//	//	fbEle.click();
//	//	youtubeEle.click();
//		
//		
		Set<String> handles = driver.getWindowHandles(); //set of window HANDLE / set of string
////		//set is a collection that contains no duplicate element set contains no pairs like e1, e2 ... to know more move curser on set
////		
		Iterator<String> it = handles.iterator();
//		
		String parentWindowId = it.next();
//		System.out.println("parent window id : " + parentWindowId);
		
		String childWindowId = it.next();
//		System.out.println("child window id : " + childWindowId);
		
//		//2nd : switch work
		driver.switchTo().window(childWindowId);
		Thread.sleep(1000);
//		System.out.println("child window url: " +driver.getCurrentUrl());
		//close the child window:
//		driver.close();
		
		//swiitch back to parent window:
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url : " +driver.getCurrentUrl());

		
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		Thread.sleep(2000);
//		
//		String parentWindowId = driver.getWindowHandle();
//		
//		WebElement lnkdEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
//		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href, 'facebook')]"));
//		WebElement yotubeEle = driver.findElement(By.xpath("//a[contains(@href, 'youtube')]"));
//			
//		lnkdEle.click();
//		fbEle.click();
//		yotubeEle.click();
//		
//		Set<String> handles = driver.getWindowHandles(); //the written type of driver.getWindowHandles() is return set of string.. why ? .. bcz set never holds the duplicate value but in list two windows might be having same windows id's etc..
//		Iterator<String> it = handles.iterator();    //iterator means to perform multiple operations in the collection
//		//so we have to iterate three window one by one
//		while(it.hasNext()) {  //it.next() 3times so we write while loop here and so one by one i iterate i switch i andd i come back here
//			String windowId = it.next();
//			driver.switchTo().window(windowId);
//			System.out.println(driver.getCurrentUrl());
//			//driver.close();
//			Thread.sleep(1000);
//		
//			      if(!windowId.equals(parentWindowId)) {
//			    	  driver.close();
//			      }
//		}
//		
//		driver.switchTo().window(parentWindowId); //driver has to come back on this parent window so that we have to write this code
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
	}

}
