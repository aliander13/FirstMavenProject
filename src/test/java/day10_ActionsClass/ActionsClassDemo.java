package day10_ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClassDemo {
	
	// if regular Driver functions like click and sendKeys dont work on certain elements, actions class can 

	public static void main(String[] args) {
		actionsHoverOver();

	}
	
	public static void actionsHoverOver() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		
		
		// go to https://demoqa.com/menu
		driver.get("https://demoqa.com/menu");
		
		//mouse hover over the menu item 2
		
		Actions act = new Actions(driver);
		WebElement menuItem2 = driver.findElement(By.linkText("Main Item 2"));
		act.moveToElement(menuItem2).build().perform();
		
		
		//then hover over the sub sub list
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("SUB SUB LIST »")));
		WebElement subSubList = driver.findElement(By.linkText("SUB SUB LIST »"));
		act.moveToElement(subSubList).build().perform();
		
	
		
		// then hover over the sub sub item 1
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sub Sub Item 1")));
		WebElement subSubItem1 = driver.findElement(By.linkText("Sub Sub Item 1"));
		act.moveToElement(subSubItem1).build().perform();
		
		
		
		
	}

}
