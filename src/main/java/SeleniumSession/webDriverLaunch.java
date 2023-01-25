package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverLaunch {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//1.open browser
		WebDriver driver = new ChromeDriver();            //open browser
		
		//driver = null;
		
		driver = new ChromeDriver();
	    //either write it like above or below both give the new browser
		WebDriver driver1 = new ChromeDriver();
	    
	    // in the above 3 browser launch and in all the three above third one pic the url method
	    // also after apply quit method only third one close
		
		//2.launch url
		driver.get("https://www.google.com");
		
		//driver1 = driver2
		
		driver1.get("https://www.amazon.com");
		
		//driver.quit();
		
		//driver1 = driver2
		//driver2 = driver3  do assignment
		
		
		
		
	}

}
