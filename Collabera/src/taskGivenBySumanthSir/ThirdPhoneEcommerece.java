package taskGivenBySumanthSir;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdPhoneEcommerece {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(1000);
		WebElement Phonenum = driver.findElement(By.xpath("//div[contains(@class,'IiD88i _351hSN')]/..//input[contains(@class,'_2IX_2- VJZDxU')]"));
		Phonenum.clear();
		Phonenum.sendKeys("9731049345");
		WebElement Password = driver.findElement(By.xpath("//div[contains(@class,'IiD88i _351hSN')]/..//input[contains(@class,'_2IX_2- _3mctLh VJZDxU')]"));
		Password.clear();
		Password.sendKeys("Hemanth@2000");	
		driver.findElement(By.xpath("//span[text()='Login']/../../..//button[contains(@type,'submit')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[title=\"Search for products, brands and more\"]")).sendKeys("OPPO Reno 4 pro",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-id])[3]")).click();
		WebElement aPrice = driver.findElement(By.xpath("(//div[@data-id])[3] //div[text()]/../..//div[@class='_30jeq3 _1_WHN1']"));
		String actualPrice = aPrice.getText();
		String a = actualPrice.toString();
		String targets = a.replace("₹", "");
		String targets1 = targets.replace(",", "");
		int currentPrice =Integer.parseInt(targets1);	    
		if(currentPrice<6000)
		{
			addtocart(driver);
		}
		else
		{
			System.out.println("SORRY IT'S TOO COSTLY");
		}
	}
	public static void addtocart(ChromeDriver  driver) {
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		for(String WID : allWindowIds)
		{
			driver.switchTo().window(WID);
		}
		driver.findElement(By.cssSelector("button[class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();

	}			


}


