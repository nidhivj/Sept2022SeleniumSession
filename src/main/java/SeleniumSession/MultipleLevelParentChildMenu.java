package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MultipleLevelParentChildMenu {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
//		WebElement shopByCatL1 = driver.findElement(By.xpath("//a[@qa='categoryDD']"));
//		Thread.sleep(2000);
//		
//		Actions act = new Actions(driver);
//		
//		act.moveToElement(shopByCatL1).build().perform();
//		
//		WebElement bevragesL2 = driver.findElement(By.xpath("(//a[text()='Beverages'])[2]"));
//		act.moveToElement(bevragesL2).build().perform();
//		Thread.sleep(2000);
//		
//		WebElement teaL3 = driver.findElement(By.xpath("(//a[text()='Tea'])[2]"));
//		act.moveToElement(teaL3).build().perform();
//		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("(//a[text()='Green Tea'])[2]")).click();
		
		//to freez the page use fn+f8 if some time you can't get the codes for further
	
	
		By parentMenu = By.xpath("//a[@qa='categoryDD']");
		
		selectLevel4MenuItem(parentMenu, "a", "Beverages", "Tea", "Green Tea");
		
	}

	public static void selectLevel4MenuItem(By parentMenuLocator, String htmlTag, String level1menu, String level2menu, String level3menu) throws InterruptedException {
		
		
		WebElement parentMenu = driver.findElement(parentMenuLocator);
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(parentMenu).build().perform();
		
		By.xpath("(//"+htmlTag+"[text()='"+level1menu+"'])[2]");
		WebElement L1level = driver.findElement(By.xpath("(//"+htmlTag+"[text()='"+level1menu+"'])[2]"));
		act.moveToElement(L1level).build().perform();
		Thread.sleep(2000);
		
		WebElement L2level = driver.findElement(By.xpath("(//"+htmlTag+"[text()='"+level2menu+"'])[2]"));
		act.moveToElement(L2level).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//"+htmlTag+"[text()='"+level3menu+"'])[2]")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
