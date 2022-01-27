package taskGivenBySumanthSir;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationTestScript {

	public static void main(String[] args) {
		// Test Data
		String testUrl="http://demowebshop.tricentis.com/login";
		String EmailID="applemeb96@gmail.com";
		String Password="Apple@123";
		String ExpectedLoginPageTitle="Demo Web Shop. Login";
		String ExpectedHomePageTitle="Demo Web Shop";

		// Step 1 : Open the browser Enter the URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("1. Browser has been launched successfully");
		driver.manage().window().maximize();
		System.out.println("2. Browser has been maximized successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		driver.get(testUrl);
		String ActualLoginPageTitle = driver.getTitle();
		if(ActualLoginPageTitle.equals(ExpectedLoginPageTitle)) {
			System.out.println("3. Login page is displayed successfully");
		}else {
			System.out.println("3. Login page is not displayed successfully");
		}

		// Step 2 : Enter EmaiID into EmaiID text field
		WebElement EmaiIDTextField = driver.findElement(By.id("Email"));
		EmaiIDTextField.clear();
		EmaiIDTextField.sendKeys(EmailID);
		String ActualEmaildEntered = EmaiIDTextField.getAttribute("value");
		if(ActualEmaildEntered.equals(EmailID)) {
			System.out.println("4. Email ID has been successfully entered into email id text field");
		} else {
			System.out.println("4. Email ID has not been entered into email id text field");
		}

		// Step 3 : Enter password into password text field
		WebElement PasswordTextField = driver.findElement(By.id("Password"));
		PasswordTextField.clear();
		PasswordTextField.sendKeys(Password);
		String ActualPasswordEntered = PasswordTextField.getAttribute("value");
		if(ActualPasswordEntered.equals(Password)) {
			System.out.println("5. Password has been successfully entered into Password text field");
		} else {
			System.out.println("5. Password has not been entered into Password text field");
		}

		// Step 5 : Click on remember me check box
		WebElement RememberMeCheckbox = driver.findElement(By.id("RememberMe"));
		RememberMeCheckbox.click();
		System.out.println("6. Remember me Check box has been successfully clicked");

		//  Step 6 : Click on Login button
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println("7. Login button has been successfully clicked");
		explicitWait.until(ExpectedConditions.titleIs(ExpectedHomePageTitle));
		String ActualHomePageTitle = driver.getTitle();
		if(ActualHomePageTitle.equals(ExpectedHomePageTitle)) {
			System.out.println("8. Home page is displayed successfully");
		}else {
			System.out.println("8. Home page is not displayed successfully");
		}
	}

}
