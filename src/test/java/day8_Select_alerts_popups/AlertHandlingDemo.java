package day8_Select_alerts_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandlingDemo {

	public static void main(String[] args) {
        alertDemo();
	
	}
	
	
	public static void alertDemo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//Test case 1
		// go to https://demoqa.com/alerts
		driver.get("https://demoqa.com/alerts");
		
		// click on the first "click me" button and accept the alert
		driver.findElement(By.id("alertButton")).click();
		
		// lets wait the alert to be present first, then interact with it
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		//now its time to handle alert
		Alert handle = driver.switchTo().alert();
		
		//accept is for anything confirmative like yes, okay, confirm, accept etc.
		handle.accept();
		
		//
		
		
		
		
	}
}
