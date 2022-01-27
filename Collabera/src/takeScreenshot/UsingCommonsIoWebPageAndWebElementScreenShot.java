package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCommonsIoWebPageAndWebElementScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mvnrepository.com/");
		
		File tempFile = driver.getScreenshotAs(OutputType.FILE);
		System.out.println(tempFile);
		
		File destFile = new File("./errorshots/MVNScreenshot.png");
		FileUtils.copyFile(tempFile, destFile);
		
		//no need of creating an tempfile we can store it in this way directly FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), destFile);
		
		
	}

}
