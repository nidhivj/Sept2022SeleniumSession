package SeleniumSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleWithList {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		WebElement lnkdEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		lnkdEle.click();
		
		Set<String> handles = driver.getWindowHandles();
		//Iterator<String> it = handles.iterator();

		//convert set to list:
		List<String> handlesList = new ArrayList<String>(handles); //now this is order base collection bcz we converted set to list
		String PWID = handlesList.get(0);
		String CWID = handlesList.get(1);
		
		driver.switchTo().window(CWID);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(PWID);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	}

}
