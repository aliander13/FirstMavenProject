package Day11_frameword_driver_utilities;

import org.openqa.selenium.WebElement;

public class Java_Concepts {

	public static void main(String[] args) {
		System.out.println(concatinatedStrings("Hello ", "world"));
	}
	
	// create a method that accepts a webElement and returns the text of the WebElement as a String
	
	public static String TheStrokes(WebElement element) {
		return element.getText();
	}
	
	
	
		
	// create a method that accepts a WebLement and an input String, that sendKeys the String to the  WebElement 
	
	public static void typeTheString(WebElement element, String input) {
		element.sendKeys(input);
	}
	
	
		
		// create a function that accepts a WebElement and clicks on the WebElement 
		
		public static void clickOnit(WebElement element) {
			element.click();
			
		}
		
	
		
		
		
		
		/*
		 *  create a function that accepts two strings and returns a concatenated string of those two
		 */

	
	
	public static String concatinatedStrings(String x, String y) {
		return x.concat(y); 
		
	}
	
	
	
}


