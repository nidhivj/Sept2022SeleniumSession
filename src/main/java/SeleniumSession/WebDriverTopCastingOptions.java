package SeleniumSession;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverTopCastingOptions {
	
	static WebDriver driver;   //to use through out in the program webdriver directly we mention it hear 

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver(); //without web driver calling chrome driver by his own that mean chrome class object has been created directly
		
		//A. creating the object of browser driver class
				//valid top casting and we use it for local specific browser execution
		//System.setProperty("webdriver.geco.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		
		// whatever driver you write your below script remain same
		//the problem is that we have to set property for driver so web driver is best to use 
		
		// so we can do top casting with every browser 
		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//	WebDriver driver = new ChromeDriver(); 
		
		
		//B. do top casting cross browser testing:
		//valid top casting and we use it for local execution
//		String browser = "chrome";
//		
//		if(browser.equals("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//			ChromeDriver driver = new ChromeDriver();
//		}
//		
//		else if(browser.equals("firefox")) {
//			System.setProperty("webdriver.geco.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\geckodriver.exe");
//			FirefoxDriver driver = new FirefoxDriver();
//		}
//		// for firefox we need to download geco driver
//		
//		//else if written for edge and safari driver also for edge driver we have to download edge driver
//		//for safari driver we don't need to set path for this selenim will take care of internally in apple
//		else {
//			System.out.println("please pass the write browser...");
//		}
		
		//C. top casting between web driver(interface) or remote web driver(class)
		//valid top casting and we use it for remote execution
		//below combination is use to run test cases at the remote machine/cloud/grid... 
		//driver = new RemoteWebDriver(remoteAddress, capabilities);    //server address
		
		//D. top casting bewtween search context and chrome driver/FD/SD/ID
//		valid but we don't use it practically
//		SearchContext sc = new ChromeDriver();
//		sc.findElement(null);         // search context having only these two methods
//		sc.findElements(null);
		
		//E.Remote wed driver and CD/SD/FD/ID
		//valid and can be use for local execution
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		
		//F. SC and RD
		//valid but we don't use it
		//SearchContext sc = new RemoteWebDriver(remoteAddress, capabilities);
		
		
		//WD = CD
		//RD = CD
		//if in future their is another browser launch that totally different for remote wed driver so we use 
		// use web driver every time instead of remote web driver
		
		
		
		//2.to launch url:
	            driver.get("https://www.google.com");  //we can't remove https/http without these we can't open
				
				//3. get the title:
				String title = driver.getTitle();  //title store in string bcz its string type
			    System.out.println("page title:" + title);
			    
			    //after having google title.. what if the title is different and it print google so for check or validation
			    //validation point/checkpoint/actual result vs expected result:
			    
			   //for this use if-else 
			    if(title.equals("Google")) {
			    	System.out.println("correct title");
			    }
			    else {
			    	System.out.println("incorrect title");
			    }
			    
			    //automation steps(from 1 to 3 ) + validation(if-else part) ==> Automation testing
			    
			    
			    driver.quit(); //close browser
		
		
		

	}

}
