package dataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pomRepo.HomePage;
import pomRepo.LoginPage;

/**
 * 
 * @author chethan
 *
 */
public class AutomationTestScript {

	public static void main(String[] args) {
		// Test Data
		String testUrl=ExcelLib.readStringData("Sheet4", 0, 0);
		String EmailID=ExcelLib.readStringData("Sheet4", 0, 1);
		String Password=ExcelLib.readStringData("Sheet4", 0, 2);
		String ExpectedLoginPageTitle=ExcelLib.readStringData("Sheet4", 1, 0);
		String ExpectedHomePageTitle=ExcelLib.readStringData("Sheet4", 1, 1);

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(testUrl);
		String ActualLoginPageTitle = driver.getTitle();
		if(ActualLoginPageTitle.equals(ExpectedLoginPageTitle)) {
			System.out.println("Login page is displayed successfully");
		}else {
			System.out.println("Login page is not displayed successfully");
		}

			LoginPage loginPage =new LoginPage(driver);
			loginPage.LoginToApp(EmailID, Password);
			
		String ActualHomePageTitle = driver.getTitle();
		if(ActualHomePageTitle.equals(ExpectedHomePageTitle)) {
			System.out.println("Home page is displayed successfully");
		}else {
			System.out.println("Home page is not displayed successfully");
		}
		
		HomePage homePage = new HomePage(driver);
		homePage.homePageApp();
	
		
	}

}
