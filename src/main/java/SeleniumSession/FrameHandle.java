package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {
	
	//so in this basically we have to capture the code inside the frame that is in a page.. so for this we have to use Frame() method
    //Developer create the frame into frame for the security point of view
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(2000);
		
		//for the count of how many frames are present
		List<WebElement> framesList = driver.findElements(By.tagName("frame"));
		System.out.println(framesList.size());
		
		//driver.switchTo().frame(2);   //this is index method for this we have to count which no frame we have using...
		driver.switchTo().frame("main");  //this method is for direct id or name
		driver.switchTo().frame(driver.findElement(By.name("main")));  //this method is web element 
		
		String header = driver.findElement(By.xpath("/html/body/h2")).getText(); //for xpath using right click copy xpath
		System.out.println(header);
		
		driver.switchTo().defaultContent();  //default content mean come back to main page
		
		//driver.switchTo().parentFrame();
		
		

	}

}
