package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class SauceDemoLoginPage {
	
	// how do we create a page class
	
	// 1. we need a class for a page of the application
	// 2. we need to create a constructor with page factory of selenium
	// then collect the webElements
	
	public SauceDemoLoginPage() {    // alice girl, remember this is a constructor  <this is is default constructor... access modifier + name of class>
		PageFactory.initElements(Driver.getDriver(), this);
	}
		
		// what this line telling is: hey pagefactory, initialize all the elements in this class with the driver instance 
		//    whenever an object of this class is created 
	
	
	
	// how do we collect webElements?
	
	@FindBy (id = "user-name")
	public WebElement loginUsername; 
	
	@FindBy (id = "password")
	public WebElement loginPassword; 
	
	@FindBy (xpath = "//input[@id='login-button']")
	public WebElement loginButton; 
	
	@FindBy (xpath = "//input[@id='login-button']")
	public WebElement loginEmptyError; 
	
	
	
	
	
	

}
