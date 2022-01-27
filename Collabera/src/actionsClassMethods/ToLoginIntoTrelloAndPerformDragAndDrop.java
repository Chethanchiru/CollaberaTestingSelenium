package actionsClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLoginIntoTrelloAndPerformDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait explicitWait=new WebDriverWait(driver, 10);
		driver.get("https://trello.com/login");
		
		driver.findElement(By.id("user")).sendKeys("applemelb96@gmail.com");
		
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys("Chethan@25");
		
		driver.findElement(By.id("login-submit")).click();
		
		driver.findElement(By.xpath("//div[@class='board-tile-details is-badged']")).click();
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		//*******************dragAndDropBy(WebElement srcEle, int Xo, int Yo)***********************************//
		/*WebElement srcElement = driver.findElement(By.xpath("//h2[text()='Manual']/../..//span[text()='Agile']"));
		WebElement dstElement = driver.findElement(By.xpath("//span[text()='Agile']"));
		action.dragAndDropBy(srcElement, 535,0).perform();*/
		
		//*******************dragAndDropBy(WebElement srcEle, WebElement dstEle)***********************************//
		/*WebElement srcElement = driver.findElement(By.xpath("//h2[text()='Manual']/../..//span[text()='Agile']"));
		WebElement dstElement = driver.findElement(By.xpath("//h2[text()='Java']/../..//span[text()='Collections']"));
		action.dragAndDrop(srcElement, dstElement).perform();*/
		
		
		//*******************clickAndHold and release without accepting arguments***********************************//
		WebElement srcElement = driver.findElement(By.xpath("//h2[text()='Manual']/../..//span[text()='Agile']"));
		WebElement dstElement = driver.findElement(By.xpath("//h2[text()='Selenium']/../..//span[text()='Takescreenshot']"));
			action.clickAndHold(srcElement).moveByOffset(600, 300).perform();
			Thread.sleep(3000);
			action.release().perform();// in release method we cannot pass the dstElement bcz clickandHold method will hold that particular webelement and release method wont have the access to release the webelement
	}

}
