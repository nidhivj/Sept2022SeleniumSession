package MyTestPacakage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginNegative extends BaseTest {
	
	@DataProvider
	public Object[][] loginNegativeData() {
		return new Object[][] {
			{"asasas@gamil.com", "asas123"},
			{"nvjdnvjs@gmail.com", "cdsdc"},
			{"  ", " "},
		};
	}
	//
	@Test(dataProvider = "loginNegativeData")
	public void loginNegative(String userName, String password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
	
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String errormsg = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();

		Assert.assertTrue(errormsg.contains(" No match for E-Mail Address and/or Password."));
	
	
	
	
	}
	
	
	

}
