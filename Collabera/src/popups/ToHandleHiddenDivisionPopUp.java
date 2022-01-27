package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//************** Hidden division pop up can be inspected and can be handled with the help of findElement **************//
		/*driver.get("https://in.bookmyshow.com/");

		driver.findElement(By.id("wzrk-cancel")).click();

		driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();*/

		driver.get("https://chercher.tech/practice/hidden-division-popup");

		driver.findElement(By.xpath("//a[text()='View Pop-up']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Close']")).click();


	}

}
