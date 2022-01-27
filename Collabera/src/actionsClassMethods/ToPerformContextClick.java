package actionsClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformContextClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://trello.com/login");

		driver.findElement(By.id("user")).sendKeys("applemelb96@gmail.com");

		driver.findElement(By.id("login")).click();

		Thread.sleep(1000);

		driver.findElement(By.name("password")).sendKeys("Chethan@25");

		driver.findElement(By.id("login-submit")).click();

		driver.findElement(By.xpath("//div[@class='board-tile-details is-badged']")).click();
		Thread.sleep(2000);

		Actions action=new Actions(driver);
		WebElement AgileElement = driver.findElement(By.xpath("//h2[text()='Manual']/../..//span[text()='Agile']"));
		action.contextClick(AgileElement).perform();//this is for just showing that we can perform context click by passing webelement
		
		List<WebElement> RightClickElement = driver.findElements(By.xpath("//a[contains(@class,'quick-card-editor-buttons-item')]"));

		for(WebElement ele:RightClickElement) {
			System.out.println(ele.getText());
		}
		
		action.contextClick().perform();//this is for just showing that we can perform context click without passing any webelement
	}

}
