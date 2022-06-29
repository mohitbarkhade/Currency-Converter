package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POM1_Testcase {
	@Test
	public void verifyLogin() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mohit.barkhade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		POM.POM1 pageom = new POM.POM1(driver);
		pageom.typeuserame();
		pageom.typepassword();
		pageom.clickbtn();
	}
}
