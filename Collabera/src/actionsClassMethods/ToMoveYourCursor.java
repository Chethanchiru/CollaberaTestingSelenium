package actionsClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveYourCursor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.purplle.com/");
		
		WebElement Categories = driver.findElement(By.xpath("//a[text()='SHOP CATEGORIES ']"));
		
		Actions action=new Actions(driver);
		//******************moveToElement(WebElement ele)************************//
		action.moveToElement(Categories).perform();
		driver.findElement(By.linkText("Dark")).click();
		
	}

}
