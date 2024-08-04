package javaPackage;

import java.util.List;

// import javax.swing.text.html.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception
{
		System.setProperty("webdriver.edge.driver", "D:\\SoftwareEdge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    
	   // maximize the window
	   Thread.sleep(2000);
	   driver.manage().window().maximize();
	   System.out.println("Window get maximized successfully");
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();  // Clicking Create Account button
       
	   Thread.sleep(2000);
	   Select select = new Select((WebElement) driver.findElement(By.id("day")));
	  
	   List<WebElement> allDays = select.getOptions();
	   
	   for(WebElement Option : allDays) {
           System.out.println("Total list of Days: " + Option.getText());
       }
	   
	   Select select1 = new Select((WebElement) driver.findElement(By.id("month")));
       List<WebElement> allMonths = select1.getOptions();
	   
	   for(WebElement Option : allMonths) {
           System.out.println("Total list of Months: " + Option.getText());
	   }
	   
	   Select select2 = new Select((WebElement)driver.findElement(By.id("year")));
       List<WebElement> allYears = select2.getOptions();
	   
	   for(WebElement Option : allYears) {
           System.out.println("Total list of Years: " + Option.getText());
	   }
	   
	   
}
}
