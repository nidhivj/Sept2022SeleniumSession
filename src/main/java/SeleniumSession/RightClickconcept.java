package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickconcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rytClick = driver.findElement(By.xpath("//span[text()= 'right click me']"));
		
		Actions act = new Actions(driver);
		act.contextClick(rytClick).build().perform();
		
		List<WebElement> menuItems  = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));

		System.out.println(menuItems.size());
		
		for(WebElement e : menuItems) {
			String text = e.getText();
			System.out.println(text);
			   if(text.equalsIgnoreCase("copy")) {
				   e.click();
				   break;
			   }
		}
		
		
		
	}

}
