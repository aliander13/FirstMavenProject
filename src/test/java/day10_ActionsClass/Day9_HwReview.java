package day10_ActionsClass;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day9_HwReview {

	public static void main(String[] args) {
		

	}

	public static void guru99_windowHandle() {
		// test case 1
		// go to http://demo.guru99.com/popup.php
	    // Get title and store it in a variable.
	    // Click on Click Here button and switch over to next window, provide an email click Submit. 
	    // Get text of the user ID and password and store them in variables, print them out. 
	    // Then verify the text "This access is valid only for 20 days."
	    // Close the window.
	    // Go back to main window, and get title then verify it equals to your stored title.
	    // Quit driver.  
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://demo.guru99.com/popup.php");
		
		String title = driver.getTitle();
		
		String mainWindowID = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String>windowIds = driver.getWindowHandles();
		
		Iterator<String> iterate = windowIds.iterator();
		
		String firstWindowID = iterate.next();
		
		String secondWindowID = iterate.next();
		
		driver.switchTo().window(secondWindowID);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email"))); 
		
		driver.findElement(By.name("email")).sendKeys("jon.dow@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Access details to demo site.']")));
		
		
		///// ALICE FINISH THE DAMN CODE, AND THEN RUN IT :D 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
