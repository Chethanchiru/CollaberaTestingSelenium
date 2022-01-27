package synchronization;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		FluentWait fwait=new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(300, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("chethan");
	}

}
