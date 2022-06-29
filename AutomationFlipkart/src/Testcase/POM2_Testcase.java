package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BrowserFactory.BrowserFactory;
import POM.POM2;


public class POM2_Testcase {
@Test	
	public void checkvalidUser() {
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.flipkart.com/");
		
		POM2 Login = PageFactory.initElements(driver, POM2.class);
		
		Login.Flipkart_login("7013253086" , "chandu@123");
	}
}