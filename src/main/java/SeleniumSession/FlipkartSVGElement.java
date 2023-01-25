package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//to know SVG element when we inspect the page if html tag start from SVG it means that element is SVG Element
public class FlipkartSVGElement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("sofa design");   //in search bar
		WebElement svg_ele = driver.findElement(By.xpath("//*[local-name()='svg']//*[name()='g' and @fill-rule='evenodd' ]"));  //for search icon
		//  in above xpath local-name() function is used to search svg element
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.click(svg_ele).build().perform(); //we can't click direct with xpath its give error so that we have to call the action cls
		
		
		
		
		
		
	}

}
