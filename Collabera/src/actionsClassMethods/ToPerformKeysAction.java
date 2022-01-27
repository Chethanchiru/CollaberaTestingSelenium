package actionsClassMethods;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformKeysAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.myntra.com/");

		List<WebElement> navBarElements = driver.findElements(By.xpath("//a[@data-type='navElements']"));

		Actions action=new Actions(driver);

		for(WebElement ele:navBarElements) {
			action.keyDown(Keys.CONTROL).click(ele).perform();//Keys.CONTROL means open the navbar element in new tab
			action.keyUp(Keys.CONTROL).perform();// after pressing the key it is mandatory to release the key or your computer will be hang and will not work properly. 
				
		}

	}
}


