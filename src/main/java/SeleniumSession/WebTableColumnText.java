package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableColumnText {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");
		 
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(2000);
			
		System.out.println(getUserCompanyName("Romi singh"));
		System.out.println(getUserCompanyName("Ali khan"));
		System.out.println(getUserPhoneNo("Ali khan"));
		System.out.println(getUserPhoneNo("deepti gupta"));
		
		
		
	}

	public static String getUserCompanyName(String userName) {
		return driver
		.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
	}
	
	public static String getUserPhoneNo(String userName) {
		return driver
		.findElement(By.xpath("(//a[text()='"+userName+"']/parent::td/following-sibling::td/span[@context='phone'])[1]")).getText();
	}
	
	
	
	
	
	
	
	
	
	
	
}
