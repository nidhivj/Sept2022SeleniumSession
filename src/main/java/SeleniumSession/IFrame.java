package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//page
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title = 'vehicle-registration-forms-and-templates']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame-one748593425");
		
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("2022");
//		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("ford");
//		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("f-150");
//		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("black");
//		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("15");
//		driver.findElement(By.id("RESULT_TextField-7")).sendKeys("25656");
//		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("nidhi");
//		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("a32");
//		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("fgdgfgg");
//		driver.findElement(By.id("RESULT_TextField-11")).sendKeys("jaipur");
//		WebElement state = driver.findElement(By.xpath("//select[@class='drop_down']"));
//		Select select = new Select(state);
//		select.selectByVisibleText("Alaska");
//		//
//		
//		driver.findElement(By.id("FSsubmit")).click();
//		
		driver.switchTo().defaultContent();
		driver.findElement(By.partialLinkText("Log in")).click();  //noSuchElementException
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
