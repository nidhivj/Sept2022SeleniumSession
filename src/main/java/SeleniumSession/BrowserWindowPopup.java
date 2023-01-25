package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		Thread.sleep(2000);
		//when we open any page that have some link like twitter, facbook, linkdin.... and when we click on them they open in another page this type
		// of things called window pop up
		
	
		//window handler api
		//target=" _blank" if it written when we inspect that mean open in new page
		
		WebElement lnkdEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		lnkdEle.click();
		
		//child window opens
		//switch driver to child window
		
		Set<String> handles = driver.getWindowHandles(); //set of window HANDLE / set of string
//		//set is a collection that contains no duplicate element set contains no pairs like e1, e2 ... to know more move curser on set
//		
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
//		System.out.println("parent window id : " + parentWindowId);
		
		String childWindowId = it.next();
//		System.out.println("child window id : " + childWindowId);
		
//		//2nd : switch work
		driver.switchTo().window(childWindowId);
		System.out.println("child window url: " +driver.getCurrentUrl());
		//close the child window:
		driver.close();
		
		//swiitch back to parent window:
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url : " +driver.getCurrentUrl());
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	

}
