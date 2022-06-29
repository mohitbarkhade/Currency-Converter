package BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	static WebDriver driver;

	public static WebDriver startBrowser(String browsername, String url) {
		if (browsername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\mohit.barkhade\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.get(url);
			driver.manage().window().maximize();
			
		} else if (browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\mohit.barkhade\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();

			driver.get(url);
			driver.manage().window().maximize();
			
		} else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			
		}
		return driver;

	}

}