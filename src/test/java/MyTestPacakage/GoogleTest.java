package MyTestPacakage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
	
	
	
	@Test(priority = 1)
	public void titleTest() {
	//	driver.get("https://www.google.com/");
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	
	@Test(priority = 2)
	public void searchExistTest() {
		Assert.assertEquals(driver.findElement(By.name("q")).isDisplayed(), true);
	}
	
	
}
