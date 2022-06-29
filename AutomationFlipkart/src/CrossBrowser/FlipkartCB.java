package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FlipkartCB {
	@Test
	@Parameters("Browser")

	public void test1(String browser) {
		WebDriver driver;
		if (browser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\mohit.barkhade\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.quit();
			
		} else if (browser.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver", 					
					"C:\\Users\\mohit.barkhade\\Downloads\\edgedriver_win64\\msedgedriver.exe");

			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.quit();
		}
	}
}