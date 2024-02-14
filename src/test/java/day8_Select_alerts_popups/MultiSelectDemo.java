package day8_Select_alerts_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo {

	public static void main(String[] args) throws InterruptedException {
	//	deselectDemo();
		
		selectMultiDeselectDemo();
		
	}
	
	public static void selectMultiDeselectDemo() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// go to https://demoqa.com/select-menu
		driver.get("https://demoqa.com/select-menu");
		
		// select all the options one by one
		WebElement multiCarSelect = driver.findElement(By.id("cars"));
		
		Select select = new Select(multiCarSelect);
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Saab");
		select.selectByVisibleText("Opel");
		select.selectByVisibleText("Audi");
		
		// deselect Opel from it
		select.deselectByVisibleText("Saab");
		
		Thread.sleep(3000);
		
		//select.deselectAll();
		
		
		
		
		
	}
	
	public static void deselectDemo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		// go to https://demoqa.com/select-menu
		driver.get("https://demoqa.com/select-menu");
		
		// find the green and click
		driver.findElement(By.xpath("div[text()='Green']")).click();
	}

}
