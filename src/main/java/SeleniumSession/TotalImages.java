package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));   //tagName generally we use for findElements so that we can interact with multiple images, links, button...
 
		System.out.println("total images = " + imagesList.size());
	
		//inspect on images
	    
		//<img alt="Keyboards" src="https://images-na.ssl-images-amazon.com/images/G/01/AmazonExports/Fuji/2021/June/Fuji_Quad_Keyboard_1x._SY116_CB667159063_.jpg"
		//class="landscape-image" data-a-hires="https://images-na.ssl-images-amazon.com/images/G/01/AmazonExports/Fuji/2021/June/Fuji_Quad_Keyboard_2x._SY232_CB667159063_.jpg">
		
	   //print src, alt, height, data-a-hires of each images:
		
		//for-each loop:
		
		for(WebElement e : imagesList) {
			String srcVal = e.getAttribute("src");
			String altVal = e.getAttribute("alt");
			String heightVal = e.getAttribute("height");
			
			System.out.println(srcVal + "||" + altVal + "||" + heightVal);
			
			//in total links capture the href value of each and every
			
			//List<WebElement> linkList = driver.findElements(By.tagName("a")); 
			//System.out.println("total link = " + linkList.size());
//			for(WebElement e : linkList) {
//				String srcVal = e.getAttribute("href");
//				System.out.println(srcVal);
			
		}
	
	
	
	
	
	}

}
