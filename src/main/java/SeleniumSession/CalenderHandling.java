package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {
	
	static WebDriver driver ;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();

//		String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
//		System.out.println(actMonthYear);//so here when we open the present month appear like dec 2022 it will capture this month
//		
//		while(!actMonthYear.equals("March 2023")) {  //reverse the condition.. // now dec2022 not equal march 2023 going pn next and click the button
//			//click on next icon:
//			driver.findElement(By.xpath("//span[text()='Next']")).click();  //for next month      //now next month is jan 2023
//			actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();   //this line is again repeat bcz now jan 2023 is actual mnth 
//			                                                                                         // so it will capture this and go on while condition....
//		}
		
//		driver.findElement(By.xpath("//a[text()='13']")).click();

		selectfutureDate("March 2023", "15");
//		selectDate("13");
//		selectCalendarDate("14");
		
	}
	
	public static void selectfutureDate(String expMonthYear, String day) {
		
		String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);//so here when we open the present month appear like dec 2022 it will capture this month
		
		while(!actMonthYear.equalsIgnoreCase(expMonthYear)) {  //reverse the condition.. // now dec2022 not equal march 2023 going pn next and click the button
			//click on next icon:
			driver.findElement(By.xpath("//span[text()='Next']")).click();  //for next month      //now next month is jan 2023
			actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();   //this line is again repeat bcz now jan 2023 is actual mnth 
			System.out.println(actMonthYear);                                                                                         // so it will capture this and go on while condition....
		}
		selectDate(day);
	}

	public static void selectCalendarDate(String day) {
		List<WebElement>dayList = driver.findElements(By.cssSelector("table.ui-datepicker-calendar a"));
		System.out.println(dayList.size());
		  for(WebElement e : dayList) {
			  String text = e.getText();
			    if(text.equals(day)) {
			    	e.click();
			    	break;
			    }
		  }
	}
	
	public static void selectDate(String day) {
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
	}
}
