package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility_Usage_demo {

	public static void main(String[] args) {
		AlertUtilsDemo();
	}
	
	public static void AlertUtilsDemo() {
		// Test case 1 - use only browser utilities
		//go to https://demoqa.com/alerts
		// click on the first 'click me' button and accept the alert
		// lets wait the alert to be present first, then interact with it
		// now its time to handle the alert
		//accept is for anything confirmitive like: yes, okay, confirm, accept, etc...
		
		// what ever CODE we write the most, we want to be able to reuse 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Test case 1
		//go to https://demoqa.com/alerts
		driver.get("https://demoqa.com/alerts");
		
		//Click on the first 'Click me'  button and Accept the alert.
		driver.findElement(By.id("alertButton")).click();
		
		// let's wait the alert to be present first, then interact with it
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		// now it's time to handle the alert
		
		
		// accept is for anything confirmative like: Yes, Okay, Confirm, Accept etc....
	//	BrowserUtils.alert_accept(driver);
		
		driver.quit();
		
	}
		
		
		
	}


