package locator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();

		String parentWindowId = driver.getWindowHandle();
		Set<String> AllWindowIds = driver.getWindowHandles();
		AllWindowIds.remove(parentWindowId);

		for(String WindowID:AllWindowIds) {
			driver.switchTo().window(WindowID);
			driver.close();
		}
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.id("qsb-keyword-sugg")).sendKeys("Computer Science");

	}
}
