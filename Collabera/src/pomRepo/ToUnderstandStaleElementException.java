package pomRepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandStaleElementException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");

		WebElement userNameTF = driver.findElement(By.id("username"));
		driver.navigate().refresh();// when u refresh the page wherever the data present in username text field will be deleted or erased bcz 
		// the data present in usernameTF will become old(stale) so when u click on login button u will get StaleElementException.
		userNameTF.sendKeys("Chethan");

	}

}
