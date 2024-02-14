package day8_Select_alerts_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ebay {

	public static void main(String[] args) {
		webDriverWaitDemo();

	}
	
	public static void webDriverWaitDemo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// go to ebay.com
		driver.get("https://ebay.com");
		
		//click on motors
		driver.findElement(By.linkText("Motors")).click();
		
		
		//wait until the ADD vehicle text is visible
		
		// create an object of WebDriverWait
		WebDriverWait letswait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		// webdriver wait waits the element until the expected condition is true, if the condition is true anytime
		//webdriverwait doesn'y wait for a full 5 seconds as defined above, it just moved once the condition is true
		
		WebElement addVehicleLink = driver.findElement(By.xpath("//div[text()='Add a vehicle']"));  // used the most
		letswait.until(ExpectedConditions.visibilityOf(addVehicleLink));
		
		letswait.until(ExpectedConditions.visibilityOf(addVehicleLink));
		
		// once its, then print it's visible 
		System.out.println("Element is Visible");
		
		// EXPLICIT WAIT IS MORE DYNAMIC
		
	}
	

}
