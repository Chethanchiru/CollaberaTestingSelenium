package actionsClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToAnElementWithOffset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.skillrary.com/user/login");
		
		WebElement passwordTF = driver.findElement(By.name("password"));
		passwordTF.sendKeys("Chethan");
		
		Actions action=new Actions(driver);
		action.moveToElement(passwordTF, 140, 0).click().perform();//to click on show icon without using locator by using moveToElement offset
		
		//action.moveToElement(passwordTF, 463, -74).click().perform();
	}

}
