package day8_Select_alerts_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertAfter5Seconds {

	public static void main(String[] args) throws InterruptedException {
		alertAfter5Seconds();
		
	}
	
	
	public static void alertAfter5Seconds() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Test case 2
		// go to https://demoqa.com/alerts
		driver.get("https://demoqa.com/alerts");
		
		
		//click on the second "click me" button and get the text of it.
		driver.findElement(By.id("timerAlertButton")).click();
		
		
		// u took a screen shot of why it threw an exception girl!!! causes it needed the next step
		
		//we wait for the alert to be present before we interact with it
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert handle = driver.switchTo().alert();
		String alertText = handle.getText();
		
		
		// then verify if the text equals to "this alert appeared after 5 seconds"
		if (alertText.equals("Tjis alert appeared after 5 seconds")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		
		
		// then accept the alert
		handle.accept();
	}

}
