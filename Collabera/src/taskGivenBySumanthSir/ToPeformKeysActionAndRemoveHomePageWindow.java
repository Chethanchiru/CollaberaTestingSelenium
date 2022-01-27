package taskGivenBySumanthSir;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPeformKeysActionAndRemoveHomePageWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.myntra.com/");

		List<WebElement> navBarElements = driver.findElements(By.xpath("//a[@data-type='navElements']"));

		String expectedTitle="Home and Living - Buy Interior Decoration Products and Accessories Online in India";

		Actions action=new Actions(driver);

		/*for(WebElement ele:navBarElements) {
			action.keyDown(Keys.CONTROL).click(ele).perform();
			action.keyUp(Keys.CONTROL).perform();
				
		}*/
		
		for(WebElement ele:navBarElements) {
			action.keyDown(Keys.SHIFT).click(ele).perform();
			action.keyUp(Keys.SHIFT).perform();
				
		}
		
		String parentWindowId = driver.getWindowHandle();
		
		Set<String> AllWindowId = driver.getWindowHandles();
		AllWindowId.remove(parentWindowId);
		
		for(String windowID:AllWindowId) {
			driver.switchTo().window(windowID);
			String ActualTitle = driver.getTitle();
			if(ActualTitle.equals(expectedTitle)) {
				driver.close();
				break;

			}
		}

	}

}
