package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//for import shortcut is ctrl+shift+o

public class TotalLinks {

	public static void main(String[] args) {
		
		//1. total links:
		//2. print the text of each link
		//3. avoid the blank text
		//4. print those links which are having text could be possible that there are having some null value
		
		 WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//1. total links:
		//findElement return web element and findElements return list of web element
		//html tag <a>
		List<WebElement> linkList = driver.findElements(By.tagName("a"));   //list of web element
		//n number of link store in this
		
		//to know how many links are available on the page
		System.out.println("total links: " + linkList.size());    //this is dynamic array bcz size is not fix
		
		//2. print the text of each link
		//we need for loop to print this
		for(int i = 0; i<linkList.size(); i++) {
			String text = linkList.get(i).getText();   //using two method one is .get()for get the value of index and second is .getText() for get the text
			//System.out.println(i + "=" + text);
//			System.out.println(text);                  //to printing this there are so many blank text
			
			//so we put if condition to avoid the blank text
			
		if(!(text.length()==0)) {                         //! is use to reverse the condition
				//System.out.println(text);
				System.out.println(i + "=" + text);	
			}
		}	
			//for each:
//		    int count = 1;              //in above method we put i for counting hear we put count
//			for(WebElement e : linkList) {
//				String text = e.getText();
////				if(!(text.length()==0)) {                         //! is use to reverse the condition
////					//System.out.println(text);
////					System.out.println(count + "=" + text);
////				}
////				count++;
//			}                                               
		             //whenever we have to iterate the driver.findElements will return the list of webElement we have to iterate this
			         // list(linklist), we have to iterate with the help of for-loop
			
		//in total links capture the href value of each and every
		
//		for(WebElement e : linkList) {
//				String srcVal = e.getAttribute("href");
//				System.out.println(srcVal);
//			}
		 
		
		
		
		
		
		
		
		
		
	}

	}
