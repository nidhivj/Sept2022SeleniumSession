package SeleniumSession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElementConcept {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		//window.getComputedStyle(document.querySelector("lable[for='input-firstname']"),'::before').getPropertyValue('Content')
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String mand_text = js.executeScript("return window.getComputedStyle(document.querySelector(\"lable[for='input-firstname']\"),'::before').getPropertyValue('Content')").toString();
		System.out.println(mand_text);
		
		if(mand_text.contains("*")) {
			System.out.println("this is a mandatory field");
		}
	}

}
