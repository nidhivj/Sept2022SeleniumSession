package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopHandle {    //that type of pop-up who have user name and password

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();

		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//now in this we have to enter username or password within the url and how..?? see below
		
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//limitation is... if your user name and password having @ somthing that it wouldn't work
		
		// like this type of....  driver.get("https://admin:admin@123the-internet.herokuapp.com/basic_auth");
		
		if(doLogin("admin", "admin", "the-internet.herokuapp.com/basic_auth")) {
			System.out.println("logged in successfully");
			
		}
			
	}

	public static boolean doLogin(String username, String password, String url) {
		
		driver.get("https://" + username + ":" + password + "@" + url);
		String msg = driver.findElement(By.xpath("//div[@id='content']//p")).getText();
		if(msg.contains("Congratulations! You must have the proper credentials.")) {
			return true;
		}
		return false;
		
		
	}
	
	
}
