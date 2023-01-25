package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TotalValuesInSelectDropDown {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		Thread.sleep(3000);
		
	//	WebElement county = driver.findElement(By.id("Form_getForm_Country"));
	//	Select select = new Select(county);
		
//		List<WebElement> countryList = select.getOptions();
//		
//		System.out.println(countryList.size());
//		
//		for(WebElement e : countryList) {
//			String text = e.getText();
//			System.out.println(text);
//			  if(text.equals("canada")) {
//				  e.click();
//				  break;
//			  }
//		}
	
	
		By country = By.id("Form_getForm_Country");
		doSelectDropdownValue(country, "canada");
	}

	public static void doSelectDropdownValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		
		List<WebElement> optionList = select.getOptions();
		
		int count = 0;
		for(WebElement e : optionList) {
			String text = e.getText();
			//System.out.println(text);
			System.out.println(count + " " + text);
//			  if(text.equals(value)) {
//				  e.click();
//				  break;
//			  }
		count++;
		}
		
		
	}

	private static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	
	//assignment:  select the value from drop down --- india
	//not allowed to use select class or its methods...
	//select[@id='form_getForm_country']/option--- 233(size)
	//optionList = FEs(xpath("//select[@id='form_getForm_country']/option"));
	//for each(e:optionlist)---> e.getText();--->if(equals india)---e.click(); break;
	
	
	
	
	
	
	
	
	
	
	
}
