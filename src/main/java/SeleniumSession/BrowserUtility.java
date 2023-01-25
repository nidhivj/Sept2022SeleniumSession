package SeleniumSession;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtility {
	WebDriver driver;   // to use anywhere
	
	public WebDriver launchBrowser(String browserName) {
		System.out.println("browser name is : " +browserName);
		//WebDriver driver = null;  //hear it write bcz we can't assign individually webdriver driver in every case either we have to write 
		                           //that WebDriver driver= new chromedriver();   , WebDriver driver1 = new firefoxdriver(); .... so to avoid this we have to write like this		
		switch (browserName.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver_win32 (1)\\chromedriver.exe");
			driver = new FirefoxDriver();
			break;

		case"safari":
			driver = new SafariDriver();
			break;
		
		case "edge":
			System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win32 (1)\\chromedriver.exe");
			driver = new EdgeDriver();
			break;	
			
		default:
			System.out.println("plz pass the write browser :" +browserName);
			break;
		}
		return driver;
	}
	
	public void launchUrl(String url) {
		
		if(url==null) {
		  System.out.println("url is null");
		  throw new MyException("URLISNULL");
		}
		if(url.length()==0) {
			  System.out.println("url is Blank");
			  throw new MyException("URLISBLANK");
			}
		
		//http/https is missing .... www.google.com
		if(url.indexOf("http")!=0 && url.indexOf("https")!=0){
			System.out.println("http(s) is missing in the URL");
			throw new MyException("HTTP(S) is missing");
		}
		
		driver.get(url);
	}
	
    public void launchUrl(URL url) {
		
    	String newUrl = String.valueOf(url);
    	
		if(newUrl==null) {
		  System.out.println("url is null");
		  throw new MyException("URLISNULL");
		}
		if(newUrl.length()==0) {
			  System.out.println("url is Blank");
			  throw new MyException("URLISBLANK");
			}
		
		//http/https is missing .... www.google.com
		if(newUrl.indexOf("http")!=0 && newUrl.indexOf("https")!=0){
			System.out.println("http(s) is missing in the URL");
			throw new MyException("HTTP(S) is missing");
		}
		
		driver.navigate().to(url);
	}
	
	
	public String getpageTitle() {
		return driver.getTitle();
		
	}

	public void quitBrowser(){
		driver.quit();
	}
	
	public void closeBrowser(){
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
