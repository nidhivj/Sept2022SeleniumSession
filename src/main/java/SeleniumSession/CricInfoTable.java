package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/abu-dhabi-t10-2022-23-1344972/bangla-tigers-vs-delhi-bulls-19th-match-1345003/full-scorecard");
		Thread.sleep(4000);
		
		System.out.println(getWicketTakerName("Joe Clarke"));
		System.out.println(getPlayerRun("Joe Clarke"));
		System.out.println(getPlayerBalls("Joe Clarke"));
		System.out.println(getPlayersFour("Joe Clarke"));
		System.out.println(getPlayersSix("Joe Clarke"));
		System.out.println(getPlayerSR("Joe Clarke"));
		
		
	}

	
	public static String getWicketTakerName(String playerName) {
		return driver.findElement(By.xpath("(//span[contains(text(),'"+playerName+"')]/ancestor::td/following-sibling::td)[1]")).getText();
		  
		//ancestor is for grand parent and for parent to child if direct use / and having indirect thn use //
		// //input/../../../.. is for going upword or go on  top html dom
	}
	
	public static String getPlayerRun(String playerName) {
		return driver.findElement(By.xpath("(//span[contains(text(),'"+playerName+"')]/ancestor::td/following-sibling::td)[2]")).getText();
		
    }

	public static String getPlayerBalls(String playerName) {
		return driver.findElement(By.xpath("(//span[contains(text(),'"+playerName+"')]/ancestor::td/following-sibling::td)[3]")).getText();
	
	}

	public static String getPlayersFour(String playerName) {
		return driver.findElement(By.xpath("(//span[contains(text(),'"+playerName+"')]/ancestor::td/following-sibling::td)[5]")).getText();
	}	
	
	public static String getPlayersSix(String playerName) {
		return driver.findElement(By.xpath("(//span[contains(text(),'"+playerName+"')]/ancestor::td/following-sibling::td)[6]")).getText();
	}	
	
	public static String getPlayerSR(String playerName) {
		return driver.findElement(By.xpath("(//span[contains(text(),'"+playerName+"')]/ancestor::td/following-sibling::td)[7]")).getText();
	}	
}	