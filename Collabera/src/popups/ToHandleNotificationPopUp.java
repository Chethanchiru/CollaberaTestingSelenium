package popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHandleNotificationPopUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//************** Notification  pop up cannot be inspected and cannot be handled with the help of findElement **************//
		
		//************ I am avoiding the notification popup permanently without even touching that popup *************//
		ChromeOptions coptions = new ChromeOptions();
		//coptions.addArguments("--incognito");
		coptions.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(coptions);// in the ChromeDriver constructor we should pass the reference of the ChromeOptions or else the popup wont be canceled
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//************* I am handling the notification popup ************//
		driver.get("https://www.easemytrip.com/");
		//Thread.sleep(2000);
		//Runtime.getRuntime().exec("./autoIt/NotificationPopUp.exe");
		
	}

}
