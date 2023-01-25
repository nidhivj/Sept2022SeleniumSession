package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

		//so if.... //<input type = 'file'   then this below line work so type equal to file is mandatory
		//we didn't use .click method use sendkeys method bcz only this case we have to use .sendkeys method
		
		driver.findElement(By.name("upfile")).sendKeys("here we to give the path where we want to upload");
		
		
		
	}

}
