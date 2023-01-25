package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameConcept {

	public static void main(String[] args) {
		
		//WebDriver driver = new ChromeDriver();
		
		//form-control private-form_control login-email
		
		By.xpath("//input[@class='form-control private-form_control login-email']"); //valid
		By.cssSelector(".form-control.private-form_control.login-email");  //valid

		By.className("form-control private-form_control login-email");  //invalid
		By.className("login-email");   //valid
		By.className("private-form_control login-email");//invalid
		By.className("private-form_control"); //valid
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
