package day12_page_object_modelFeb5;

import Pages.SauceDemoLoginPage;
import utils.DataReader;
import utils.Driver;

public class SaucePageObjectDemo {

	public static void main(String[] args) {
		sauceLoginDemo();

	}
	
	public static void sauceLoginDemo() {
		SauceDemoLoginPage loginPage = new SauceDemoLoginPage();
		
		// go to website
		Driver.getDriver().get(DataReader.getProperty("sauce_url"));
		//type username
		loginPage.loginUsername.sendKeys(DataReader.getProperty("sauce_username"));
		//type password
		loginPage.loginPassword.sendKeys(DataReader.getProperty("sauce_password"));
		// click sign in 
		loginPage.loginButton.click();
		
		
		Driver.quitDriver();
		
		
		
		
		
	}

}
