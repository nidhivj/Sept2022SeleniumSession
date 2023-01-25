package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableCheckBoxConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//a[text()='John.Smith']/parent::td/preceding-sibling::td/input")).click();
		
		selectorUserCheckbox("John.Smith");
		selectorUserCheckbox("Joe.Root");
		

	}

	
	public static void selectorUserCheckbox(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input")).click();
	}
	
	
}






















