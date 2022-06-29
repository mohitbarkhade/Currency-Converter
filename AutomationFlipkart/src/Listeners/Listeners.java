package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listeners implements ITestListener {
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mohit.barkhade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com/account/login?ret=/");
		
//		driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")).click();
		
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[1]/input")).sendKeys("7013253086");
		
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[2]/input")).sendKeys("chandu@123");
		
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[4]/button")).click();
		

		
	}

	@Override
	public void onFinish(ITestContext arg0) {
// TODO Auto-generated method stub
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("Test case started " + arg0.toString());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println();
	}

	@Override
	public void onTestFailure(ITestResult arg0) {

	}

	@Override
	public void onTestSkipped(ITestResult arg0) {

	}

	@Override
	public void onTestStart(ITestResult arg0) {
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Congrats the case has been passed" + arg0.toString());
	}
}