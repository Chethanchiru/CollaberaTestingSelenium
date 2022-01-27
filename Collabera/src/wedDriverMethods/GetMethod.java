package wedDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");// this line is case sensitive
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		driver.get("https://www.freshercooker.in");
	}

}

// When you cancel the browser by yourself then you will get this exception
// Exception in thread "main" org.openqa.selenium.NoSuchWindowException: no such window: target window already closed
//from unknown error: web view not found