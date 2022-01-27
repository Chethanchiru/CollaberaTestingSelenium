package popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAuthenticationPopUp {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//************** Authentication pop up cannot be inspected and cannot be handled with the help of findElement **************//

		//************* I am handling the Authentication popup ************//
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		//Thread.sleep(1000);
		//Runtime.getRuntime().exec("./autoIt/AuthenticationPopUp.exe");

		//************ I am avoiding the Authentication popup permanently without even touching that popup *************//
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		// i am directly passing the username and password directly into the URL. so that it will directly enter into the popup.
	}

}
