package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
		driver.findElement(By.name("proceed")).click();

		//we can't go direct to inspect alert msg we have to switch over there with switchto() method
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
	    //alert.sendKeys("1234");   //if any alert need msg 
		alert.accept();
		//alert.dismiss();
	
	
	
	
	}

}
