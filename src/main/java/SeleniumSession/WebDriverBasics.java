package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//top casting : you create the child class object which should be referred by parent interface referance variable

		//new ChromeDriver(); child class object  and ChromeDriver is a class
		// WebDriver is a parent class interface  and driver is a referance of WebDriver interface and driver is just a name you can give anything
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   //1. to open browser
		
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
	    
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    
	    String pageSr = driver.getPageSource();
	    System.out.println(pageSr);             //use of this is not much for the validate or copywrite
	    
	    if(pageSr.contains("copyright the closure library authors")) {
	    	System.out.println("this info is present");
	    }
	    
	    
	    
	    
	    driver.quit(); //close browser
	    
	    
		//practice on linkedin or facebook
		
	}

}
