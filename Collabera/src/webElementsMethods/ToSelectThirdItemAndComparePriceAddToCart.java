package webElementsMethods;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.lang.String;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSelectThirdItemAndComparePriceAddToCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//button[text()='✕']")).click();

		driver.findElement(By.name("q")).sendKeys("iphone 12 mini",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Black, 256 GB)']")).click();

		String parentWindowID = driver.getWindowHandle();
		Set<String> AllWindowId = driver.getWindowHandles();
		AllWindowId.remove(parentWindowID);

		String expectedPageTitle="APPLE iPhone 12 Mini ( 256 GB GB Storage, 0 GB RAM ) Online at Best Price On Flipkart.com";
		
		for(String windowID:AllWindowId) {
			driver.switchTo().window(windowID);
			String actualPageTitle = driver.getTitle();
			if(actualPageTitle.equals(expectedPageTitle)) {
				System.out.println("driver switched the control to the correct page");
			}
			String actualPrice = driver.findElement(By.xpath("(//div[text()='₹64,999'])[1]")).getText();
			System.out.println(actualPrice);
			int price=0;
			for(int i=0;i<actualPrice.length();i++) {
				if((actualPrice.charAt(i)>47) && (actualPrice.charAt(i)<58)) {
					price=price*10+(int)(actualPrice.charAt(i)-48);
				}
			}
			System.out.println(price);
			int expectedPrice=65000;
			if(price<=expectedPrice) {
				System.out.println("Product has been successfully added to cart");
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			}
			//driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		}
	}
}
			
			
			//int price=Integer.parseInt(actualPrice);
			//System.out.println(price);
		
		



