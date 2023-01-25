package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterationPage {                      //assignment

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		ElementUtil eleUtil = new ElementUtil(driver);         //creating object of elementUtil for do send keys
		
		
//		BrowserUtility brUtil = new BrowserUtility();   //creating object of browserUtility class to call the driver for launch browser
//		WebDriver driver = brUtil.launchBrowser("chrome");
		
//		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		System.out.println(brUtil.getpageTitle());

//		
//		By lastName = By.id("input-lastname");
//		By emailid = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By password = By.id("input-password");
//		By passwordCnfrm = By.id("input-confirm");
//		
//		
		
//		
//		
//		
//		eleUtil.doSendKeys(telephone, "12345667");
//		eleUtil.doSendKeys(password, "nidhi123");
//		eleUtil.doSendKeys(passwordCnfrm, "nidhi123");
		
		
		//1. id locator
		
		By firstName = By.id("input-firstname");
		eleUtil.doSendKeys(firstName, "nidhi");
		
		//2. Name locator
		
		driver.findElement(By.name("lastname")).sendKeys("vijay");
		
		By emailId = By.name("email");
		eleUtil.doSendKeys(emailId,"nidhi123@gmail.com");
		
		//3. className: having duplicate
		//driver.findElement(By.className("form-control")).sendKeys("nidhivj27@gmail.com"); duplicate form so written some where else
		
		//4. xPath :
		driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("123456789");
		
		//5. css Selector:
		
		driver.findElement(By.cssSelector("#input-password")).sendKeys("nidhi123");
		driver.findElement(By.cssSelector("#input-confirm")).sendKeys("nidhi123");
		
		//driver.findElement(By.className("btn btn-primary")).click();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		
		//6. tagName:
		//<h1>Your Account Has Been Created!</h1>
		String header = driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);
		
		
		
		
		
	}

}
