package takeScreenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/");
		
		File tempFile = driver.getScreenshotAs(OutputType.FILE);
		System.out.println(tempFile);
		
		File destFile=new File("./errorshots/ScreenShot.png");
		tempFile.renameTo(destFile);
		
		File WebElementScreen = driver.findElement(By.xpath("//a[.='FIND FOOD']")).getScreenshotAs(OutputType.FILE);
		
		File WebDestFile=new File("./errorshots/WebEleScreenShot.png");
		WebElementScreen.renameTo(WebDestFile);
		
	}

}
