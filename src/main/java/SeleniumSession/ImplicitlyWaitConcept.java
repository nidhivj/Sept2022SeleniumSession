package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		
		//so in this we put 10sec and element need only 2 sec thn it will not wait for extra 8sec it'll come out in 2sec
		//its only applied for web element
		// it will be applied for all the web element by default once its declared
		//not applicable for non web element : alerts, title, urls
		//its a global wait : once its declared it will applicable for all the element by default thats why called global wait
		
		WebDriver driver = new ChromeDriver();
		
		//selenium 3.x : we use this conept
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//sel 4.x:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//home page: 10 secs
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		WebElement e1 = driver.findElement(By.linkText("MacBook"));
		System.out.println(e1.getAttribute("href"));
		
		//e2
		//e3
		//e4
		//... implicit wait will remain same until we over ride that
		
		//login page: 20 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//e5 //e6 //e7 //....  20 sec  now for these implicit wait will change new wait is 20 sec 
		
		//homepage : 10secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//e1, //e2 //e3 //e4 //.... : 10 sec
		
		//product page: 0 sec:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		//whatever we write.. for .. registration page, login page, home page.... implicit wait we remain same until it will override by another one
		//that's why we don't use implicit wait in frame work or real time project
		
		
		
		
		
		
		
		
		
		
		
	}

}
