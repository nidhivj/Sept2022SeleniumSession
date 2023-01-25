package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateConcept {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//both method are same method  navigate method takes string url and url types get takes only url types but the functionality of both is same
		driver.navigate().to("https://www.google.com");  
		driver.get("https://www.google.com");
		
		
		String title = driver.getTitle();  //title store in string bcz its string type
	    System.out.println("page title:" + title);
	    
	    if(title.equals("Google")) {
	    	System.out.println("correct title");
	    }
	    else {
	    	System.out.println("incorrect title");
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    driver.quit();
	    
	    
	    
		

	}

}
