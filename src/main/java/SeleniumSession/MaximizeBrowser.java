package SeleniumSession;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();            //open browser
		
		driver.get("https://www.google.com");                    //google open
		System.out.println(driver.getTitle());
		
		driver.manage().deleteAllCookies();      //it is best to delete all cookies after launching the url
		
		driver.manage().window().maximize();             
		driver.manage().window().fullscreen();          //for fit to the screen.. maximum limit the of the screen 

		driver.manage().window().minimize();
	
		driver.manage().window().setSize(new Dimension(500,400));
	
	}

}
