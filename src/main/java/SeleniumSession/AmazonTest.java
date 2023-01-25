package SeleniumSession;

import org.openqa.selenium.WebDriver;

public class AmazonTest {

	public static void main(String[] args) {
		
		String browserName = "chrome";

		BrowserUtility brUtil = new BrowserUtility();
		brUtil.launchBrowser(browserName);
		
		brUtil.launchUrl("https://www.amazon.com");
		
		String actTitle = brUtil.getpageTitle();
		System.out.println(actTitle);
		
		//validation point
		if(actTitle.contains("Amazon")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		
		
	}

}
