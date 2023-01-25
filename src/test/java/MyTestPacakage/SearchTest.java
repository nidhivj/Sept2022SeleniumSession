package MyTestPacakage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest{
	
	@DataProvider
	public Object[][] getSearchData() {
		return new Object[][] {                      //the no. of rows you define here same number of time it will run
 			{"macbook"},
			{"ipad"},
			{"samsung"},
			{""}
		};
		
	}
	
	@Test(dataProvider = "getSearchData")                      //so this getSearchData provide the data to the this string
	public void searchTest(String productName) {               //and this String store all data from getSearchData in productName
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.cssSelector("#search button")).click();
		String results = driver.findElement(By.tagName("h1")).getText();
		Assert.assertTrue(results.contains(productName));
		
		
	}
	
	
	

}
