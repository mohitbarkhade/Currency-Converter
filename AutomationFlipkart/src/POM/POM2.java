package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class POM2 {

	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement uname;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement pwd;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
	WebElement btn;

	public POM2(WebDriver driver) {
		this.driver = driver;
	}

	public void Flipkart_login(String uid, String pass) {
		uname.sendKeys(uid);
		pwd.sendKeys(pass);
		btn.click();
	}

}
