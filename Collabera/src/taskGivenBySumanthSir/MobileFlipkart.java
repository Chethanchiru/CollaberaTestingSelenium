package taskGivenBySumanthSir;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobileFlipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();

		//Adding 1st product
		driver.findElement(By.name("q")).sendKeys("i phone mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Black, 64 GB)']")).click();
		addToCart(driver, "Buy Apple iPhone 12 Mini ( 64 GB Storage ) Online at Best Price On Flipkart.com");

		//Adding 2nd product
		Thread.sleep(2000);
		driver.findElement(By.name("q")).clear();
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("oppo mobile");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='OPPO A12 (Blue, 64 GB)']")).click();
		addToCart(driver, "OPPO A12 ( 32 GB Storage, 3 GB RAM ) Online | A12 Reviews");

		//Adding 3rd product
		Thread.sleep(2000);
		driver.findElement(By.name("q")).clear();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("SAMSUNG S20 FE 5G (Cloud Navy, 128 GB)");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='SAMSUNG S20 FE 5G (Cloud Navy, 128 GB)']")).click();
		addToCart(driver, "Samsung- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Cart")).click();
		//driver.navigate().refresh();
	}

	public static void addToCart(WebDriver driver, String expectedPageTitle) {
		String parentWindowID = driver.getWindowHandle();
		Set<String> AllWindowId = driver.getWindowHandles();
		AllWindowId.remove(parentWindowID);

		for(String windowID:AllWindowId) {
			driver.switchTo().window(windowID);
			String actualPageTitle = driver.getTitle();
			if(actualPageTitle.equals(expectedPageTitle)) {
				System.out.println("driver switched the control to the correct page");
			}
			
		}
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		//driver.switchTo().window(parentWindowID);
		//driver.switchTo().window(windowID);
	}
}



