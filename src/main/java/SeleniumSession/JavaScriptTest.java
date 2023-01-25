package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://classic.crmpro.com/index.html");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	//	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4d1ohbptwj_e&adgrpid=58490306106&hvpone=&hvptwo=&hvadid=610644599496&hvpos=&hvnetw=g&hvrand=9386889543984609188&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007759&hvtargid=kwd-298187295805&hydadcr=5657_2359491&gclid=CjwKCAiAkfucBhBBEiwAFjbkrzY58mpoXMKMvRSzqHfZq6-7qFEemfY9NHX78r7QZ7ckY8V894wfBBoCPV8QAvD_BwE");
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);
		
		//for refresh the page on console--> history.go(0)--> enter
		// for forward  --> history.go(1)--> enter
		//for backward --> history.go(-1)--> enter
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		System.out.println(jsUtil.getTitleByJS());
//		
//		String pageText = jsUtil.getPageInnerText();
//		System.out.println(pageText);
//		if(pageText.contains("Deal PipeLine")) {
//			System.out.println("pass");
//		}
		
//		jsUtil.refreshBrowserByJS();
		
//		jsUtil.generateAlert("login page is displayed");
		
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		jsUtil.drawBorder(emailId);
		
//		jsUtil.scrollPageDown();
//		Thread.sleep(2000);
//		
//		jsUtil.scrollPageUp();
//		Thread.sleep(2000);
//		
//		jsUtil.scrollPageDown("1000");
//		Thread.sleep(2000);

//		WebElement watch = driver.findElement(By.xpath("//h2[text()='Electronics devices for home office']"));
//		jsUtil.scrollIntoView(watch);

		WebElement help = driver.findElement(By.linkText("Help"));
		jsUtil.clickElementByJS(help);
		
		//js click: avoid this click bcz directly interacting with the dom here not the element
		//normal click method
		//Action Click:
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
