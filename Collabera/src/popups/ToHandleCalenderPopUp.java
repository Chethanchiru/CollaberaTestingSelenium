package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleCalenderPopUp { // i have hard coded the values in this program

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.makemytrip.com/");

		Actions action=new Actions(driver);

		action.click().perform();

		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();

		driver.findElement(By.cssSelector("label[for='departure']")).click();

		//driver.findElement(By.xpath("//div[text()='January 2022']/../..//p[text()='19']")).click();// i am selecting current todays date

		//driver.findElement(By.xpath("//div[text()='February 2022']/../..//p[text()='28']")).click();// i am selecting next month date

		
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='August 2022']/../..//p[text()='5']")).click();// i am selecting next month date
				break;
			} catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}

}
