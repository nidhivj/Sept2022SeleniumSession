package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//after writing selenium on search bar inspect that and get this now we took name="q"
		
		//<input class="gLFyf" jsaction="paste:puy29d;" maxlength="2048" name="q" type="text" aria-autocomplete="both" 
		//aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox" 
		//spellcheck="false" title="Search" value="" aria-label="Search" data-ved="0ahUKEwjK1qHJ2bT7AhWvSmwGHUUsBVQQ39UDCAQ">

		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);  //3000 milisecond means 3 sec/// to sleep the action.. thread is a class in java and it throws InterruptedException
		
		//on google page in inspection <b> is show bold 
		
		List<WebElement> suggList =  driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		System.out.println(suggList.size());    //for size of the list
		
		for(WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);    //for list in text
		      if(text.equals("selenium testing")) {
		    	  e.click();
		    	  break;
		      }
		
		}
	
	                            //whenever you need to get the suggestion list follow exact same method for any search site... 
	                             //capture the list and then iterate the list
//		By suggList = By.xpath("//div[@class='wM6W7d']/span");
//		doGetElementText(suggList);
//		System.out.println(suggList);
	}

//	 public static String doGetElementText(By locator) {
//		 return getElement(locator).getText();
//	 }
//	 
//	 public static  WebElement getElement(By locator) {       //getElement asking for By locators
//    	 return driver.findElement(locator);
//     }
	 
}
