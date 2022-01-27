package practice_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KalkiFashion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.kalkifashion.com/");
		
		WebElement iframe = driver.findElement(By.id("wiz-iframe-intent"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//span[@class='CT_InterstitialClose']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("wzrk-cancel")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Salwar Kameez ']")).click();
		//driver.findElement(By.linkText("Salwar Kameez ")).click();
		
		driver.findElement(By.partialLinkText("Roshni Chopra In Kalki Sage Green Dhoti Suit With")).click();
		
		driver.findElement(By.id("product-addtocart-button")).click();
	}

}
