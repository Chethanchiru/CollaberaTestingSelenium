package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://licindia.in/Home/Policy-Loan-Options#");
		
		driver.findElement(By.linkText("Pay Direct (Without login)")).click();
		
		Alert ConfirmationAlert = driver.switchTo().alert();
		ConfirmationAlert.accept();// it is used to click on ok button
		//ConfirmationAlert.dismiss();// it is used to click on cancel button
		
		Thread.sleep(2000);
		
		String windowID = driver.getWindowHandle();
		
		Set<String> AllWindowID = driver.getWindowHandles();
		AllWindowID.remove(windowID);
		
		String expectedTitle="Life Insurance Corporation of India";
		for(String winID:AllWindowID) {
			driver.switchTo().window(winID);
			String actualTitle = driver.getTitle();
			if(expectedTitle.equals(actualTitle)) {
				System.out.println("driver control has been successfully switch");
			}
				driver.findElement(By.xpath("//a[@class='x-btn x-unselectable x-box-item x-btn-BluebtnUI-small']")).click();
		}
	}

}
