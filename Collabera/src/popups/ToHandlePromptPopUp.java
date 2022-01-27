package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePromptPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert promptAlert=driver.switchTo().alert();// note we cannot inspect popup but we can switch control to that popup.
		promptAlert.sendKeys("Chethan");// in entire selenium in alert topic sendkeys accepts string as an argument.
		promptAlert.accept();
		promptAlert.dismiss();// if we write this code means we will get org.openqa.selenium.NoAlertPresentException: no such alert bcz
							// prompt alert pop up is already closed by accept method.
	}

}
