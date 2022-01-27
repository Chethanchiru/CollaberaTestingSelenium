package javascriptExxecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformScrollByInNaukri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		 
		WebElement scrollEle = driver.findElement(By.xpath("(//a[@class='view-all-comp'])[1]"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false);", scrollEle);
	}

}
