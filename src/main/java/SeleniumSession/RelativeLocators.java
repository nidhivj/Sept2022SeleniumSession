package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;  //this import is written by me

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.linkText("Windsor, Canada"));
		
		//now what is the right side of this element
		String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightIndex);
		
		//so with the help of With-locator(Relative locator) we can use directly child/sbiling/parent locator...
		//in above first we give the linktext of the element then on the right of that element we give only tag name with With locator and with this
		//give toRightOf() method
		
		
		//for left side of element
		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftRank);

		//below of ele
		
		String belowtCity = driver.findElement(with(By.tagName("a")).below(ele)).getText();
		System.out.println(belowtCity);
		
		//above of ele
		
		String aboveCity = driver.findElement(with(By.tagName("a")).above(ele)).getText();
		System.out.println(aboveCity);
		
		//near of ele:
		String nearEleText = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearEleText);
		
		
		
		
	}

}
