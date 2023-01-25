package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class QuitVsClose {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//just put the curser on driver the session id is " ChromeDriver: chrome on WINDOWS (44750b0f3d4acd5317d324c3514a4900)"
		//it is same on every driver where we written before quit but after quit the session id is " ChromeDriver: chrome on WINDOWS (null) "
		//all this come after when we do debugging from below line
		WebDriver driver = new ChromeDriver();   //1. to open browser   //for debug click on 17's left come a dot there then write click on page
		                                         // instead of run as wr click on debug as... and debug goes line to line from it start
		//2.to launch url:
		driver.get("https://www.google.com");    //hear debug is stop then we click again on f6 or in menu bar click on down arrow
		
		//3. get the title:
		String title = driver.getTitle();  
	    System.out.println("page title:" + title); //Google
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    
	    
	    
	    driver.close();    // when writing this we check that session id will remain same or what ? so we start debugging on all steps an then put the curser on driver the session 
	                                        //id is different from before and after driver.close it give the same session id and give the Exception : NoSuchSessionException
	                                           //and give invalid session id
	   // driver.quit(); //close the browser

	   System.out.println(driver.getTitle());  //Exception : NoSuchSessionException
	    //session id is null using web driver after calling quit()
	
	    //now doing this we get a different session id and chrome too
//	    driver = new ChromeDriver();
//	    driver.get("https://www.google.com"); 
//	    System.out.println(driver.getTitle()); 
	
	
	
	
	
	}

}
