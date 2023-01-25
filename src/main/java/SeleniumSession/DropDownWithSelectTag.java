package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithSelectTag {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		Thread.sleep(3000);
		
		//dropdown html type is <select>
		
	//	WebElement county = driver.findElement(By.id("Form_getForm_Country"));

		//<option value="Bahrain">Bahrain
		
		
	//	Select select = new Select(county);
	//	select.selectByIndex(5);                    //selecting by index it works when the things are fixed like jan(1) to dec(12) etc.. 
	//	select.selectByVisibleText("Bahrain");  //selecting by seeing text  //best way is also this bcz indax sometimes might chang 
	//	select.selectByValue("Combodia");       
		
		
		//for state
		//Select --- state
		//select.text("Delhi")
		
		//1 to 10 ----select
		
		By country = By.id("Form_getForm_Country");
		doSelectDropDownByIndex(country, 7);
		doSelectDropDownByValue(country, "Brazil");
		doSelectDropDownByVisibleText(country, "India");
		
	}
	
	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
}
