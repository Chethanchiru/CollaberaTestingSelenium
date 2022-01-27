package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.freshersworld.com/user/register?src=homeregblock");
		
		Thread.sleep(2000);
		
		//************ I am avoiding the FileUpload popup permanently without even touching that popup *************//
		driver.findElement(By.id("file-upload")).sendKeys("H:\\Test Yantra\\Testyantra Assesment\\1st Mid Assessment.pdf");
		// with the help of sendKeys we can avoid fileUpload popup but the upload button should be created using input tag then only sendkeys will work.
		// And in chrome settings we should go to advanced and in that we should go for download and we activate Ask where to save each file before downloading
 
		//************ I am handling the FileUpload popup with the help of Autoit *************//
		
	}

}
