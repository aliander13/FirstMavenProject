package day10_ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dragAndDropDemo {

	public static void main(String[] args) {
		dragAndDromDemo();

	}
	public static void dragAndDromDemo() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://demoqa.com/droppable");
		
		Actions act = new Actions(driver); 
		
		WebElement dragMeBox = driver.findElement(By.id("draggable"));
		WebElement dropHereBox = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(dragMeBox, dropHereBox).build().perform();
		
		
	}

}
