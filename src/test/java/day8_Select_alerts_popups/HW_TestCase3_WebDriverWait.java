package day8_Select_alerts_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HW_TestCase3_WebDriverWait {

	public static void main(String[] args) {
		// go to https://demoqa.com/alerts 
		// Click on the third 'Click me' button and get the text of it, Then verify if the text equals to 
		// "Do you confirm action?",  if true, dismiss the Alert, then verify 
		// "You selected Cancel" text displayed.

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com/alerts");
		
		// Click on the -->third<-- 'Click me' button and get the text of it, 
		
		driver.findElement(By.id("confirmButton")).click();  // Yes Helil... i got the unique thingy
		
		// we wait for the alert to present before magic starts to happen
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert handle = driver.switchTo().alert();		
		String alertText = handle.getText();
		
		// Then verify if the text equals to 
		//         "Do you conform action?", if true, dismiss the alert,
		if (alertText.equals("Do you confirm action?")) {  // hehe I HAD FORGOTTEN THE "?" MARK :D 
			System.out.println("Mega Pass");
		}else {
			System.out.println("Mega Super Fail");
		}
		 if (alertText.equals(alertText));
		
	}

}
