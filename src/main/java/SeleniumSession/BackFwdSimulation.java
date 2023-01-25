package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackFwdSimulation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();                   //first chrome is open
		
		driver.get("https://www.google.com");                    //google open
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.com");         //amazon open
		System.out.println(driver.getTitle());
		
		driver.navigate().back();                               //click on back went on google

		driver.navigate().forward();                            //click on forward went to amazon again
		System.out.println(driver.getTitle());
		
		driver.navigate().back();                            //click on forward went to amazon again
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		
	}

}
