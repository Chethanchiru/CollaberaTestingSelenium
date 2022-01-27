package taskGivenBySumanthSir;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Mini (512GB) - Midnight' and @class='a-truncate-cut']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit' and @class='a-button-input' and @aria-labelledby='attachSiNoCoverage-announce']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("nav-cart-count-container")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/s?k=i+phone&ref=nb_sb_noss");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal' and text()='Apple iPhone 11 (64GB) - Purple']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("submit.add-to-cart")).click();
		//driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='a-button-input' and @aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
		
		}
	}


