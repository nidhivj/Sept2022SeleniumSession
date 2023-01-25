package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		//for parentmeanu
//		WebElement addons = driver.findElement(By.xpath("//div[text()='Add-ons']"));   //so when class/id/name is not present and some text are present
//		                                                           //when we inspect the Add-on then we can use text() in xpath
//		//now we create the object of action class
//		Actions act = new Actions(driver);  //this class comes from selenium and you have to give it the driver.
//		
//		//now using moveToElement method it went on add-on and give the suboption of it
//		//and whenever we use act class we have to add two more method build() and perform() means build this perticular action(moveToElement) and perform on the browser
//	    act.moveToElement(addons).build().perform();
//	    Thread.sleep(2000);
//	
//	    driver.findElement(By.xpath("//div[text()='Student Discount']")).click();   //forsubmenu option

		selectSubMenu("div", "Add-ons", "Student Discount");
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void selectSubMenu(String htmltag, String parentMenu, String childMenu) throws InterruptedException {
			
		By parentMenuLocator = By.xpath("//"+htmltag+"[text()= '"+parentMenu+"']");
		By childMenuLocator = By.xpath("//"+htmltag+"[text()='"+childMenu+"']");
		//WebElement addons = driver.findElement(By.xpath("//div[text()='Add-ons']"));   //instead of this line we write above line for parentMeanu
		
		WebElement parentMenuElement = getElement(parentMenuLocator);
		Actions act = new Actions(driver); 
		
		act.moveToElement(parentMenuElement).build().perform();
	    
		Thread.sleep(2000);
	
	   // driver.findElement(By.xpath("//div[text()='Student Discount']")).click();     //we create a locator of this above
		
	    doClick(childMenuLocator);
	
	}
	
}


















