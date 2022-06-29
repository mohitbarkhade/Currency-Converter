package DDT;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;

public class FlipkartDDT {
	WebDriver driver;
	Workbook wb;
	Sheet sh;
	int numrow;
	String uname;
	String pwd;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mohit.barkhade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "testdata")
	public void verifiy(String uname, String pwd) {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(uname);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(pwd);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
		driver.navigate().refresh();
	}

	@DataProvider(name = "testdata")
	public Object[][] TestDataFeed() {

		try {
			wb = Workbook.getWorkbook(
					new File("C:\\Users\\mohit.barkhade\\OneDrive - HCL Technologies Ltd\\Desktop\\Fipkart.xls"));
			sh = wb.getSheet(0);
			numrow = sh.getRows();
		}

		catch (Exception e) {
			e.printStackTrace();

		}

		Object[][] lmsdata = new Object[numrow][sh.getColumns()];
		for (int i = 0; i < numrow; i++) {
			lmsdata[i][0] = sh.getCell(0, i).getContents();
			lmsdata[i][1] = sh.getCell(1, i).getContents();

		}
		return lmsdata;
	}
}