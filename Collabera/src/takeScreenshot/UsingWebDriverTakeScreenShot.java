package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWebDriverTakeScreenShot {

	public static void main(String[] args) throws WebDriverException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.foodpanda.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File destFile=new File("./errorshots/FoodPanda.png");
		FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), destFile);
		
		File japan = driver.findElement(By.xpath("//a[@data-original-title='Japan']")).getScreenshotAs(OutputType.FILE);
		File destFile1=new File("./errorshots/JpElement.png");
		FileUtils.copyFile(japan, destFile1);
	} // jpeg format is not supported in selenium

}
