package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM1 {
	WebDriver driver;
	By username = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	By password = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	By loginbtn = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button");
	By forgotpwd = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/a");

	public POM1(WebDriver driver) {
		this.driver = driver;
	}

	public void typeuserame() {
		driver.findElement(username).sendKeys("7013253086");
	}

	public void typepassword() {
		driver.findElement(password).sendKeys("chandu@123");
	}

	public void clickbtn() {
		driver.findElement(loginbtn).click();
	}
	
	public void forgotpwd() {
		driver.findElement(forgotpwd);
	}
}
