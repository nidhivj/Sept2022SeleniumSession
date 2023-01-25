package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElement {
	
	//Browser
	    //page -- elements
	        //iframe -- element
	              //shadow dom(open) -- element  --- tea -- sendKey

    public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
		
		driver.switchTo().frame("pact");
		
	//	driver.findElement(By.id("tea")).sendKeys("masala tea");
		
		//shadow dom is special html dom ---> under the dom created this shadow dom
		// create for more and more secure reason
		// if shadow-dom(close) is written we can not automate that reason only shadow-dom (open) we can automate
		
		//document.querySelector("#snacktime").shadowRoot.querySelector('#tea')
		
		//this is called java script code for this line we have to copy js path of the the above line of where shadow root has written
		//then paste on console after that put .shadowRoot.querySelector('#id')
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement tea =                                                  
				(WebElement)js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector('#tea')");
		//converting java script to web element      // using return keyword
		
		tea.sendKeys("Masala Tea");
		
		
		
		
		
		
		
		
		
		
	}

}
