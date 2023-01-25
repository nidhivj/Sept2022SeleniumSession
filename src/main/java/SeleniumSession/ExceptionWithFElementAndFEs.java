package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionWithFElementAndFEs {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//driver.findElement(By.id("input-email11")).sendKeys("test123@gmail.com");  //hear i put wrong "id" to get or check exception
		//NoSuchelementexception     exception i found   this exception is for single element.

//		List<WebElement> linkList = driver.findElements(By.xpath("//div[@class='list-group11']/a"));     //puting wrong xpath to know about exception
//		System.out.println("total links : " +linkList.size());
		//hear i found no exception and get empty or 0 size.... so the size is 0 and it gives empty list
	
		List<WebElement> linkList = driver.findElements(By.xpath("//div[@@@class===='list-group11']/////a"));     //puting wrong xpath to know about exception
		System.out.println("total links : " +linkList.size());
		//this time we get the exception InvalidSelectorException bcz we write invalid xpath syntax completely
	
	
	
	
	}

}
