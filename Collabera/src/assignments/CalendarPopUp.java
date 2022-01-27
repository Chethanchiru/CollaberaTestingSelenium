package assignments;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now().plusMonths(4);
		String month = ldt.getMonth().name();
		month=month.substring(0, 1).toUpperCase()+month.substring(1, month.length()).toLowerCase();
		int date = ldt.getDayOfMonth();
		int year = ldt.getYear();

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.agoda.com/");

		driver.findElement(By.xpath("//button[text()='Not now']")).click();

		driver.findElement(By.xpath("//li[@data-element-name='flight-tab']")).click();

		driver.findElement(By.xpath("(//div[@class='IconBox__wrapper'])[3]")).click();

		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100);");


		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//span[text()='"+date+"']")).click();
				break;
			} catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}


		}

	}
}
