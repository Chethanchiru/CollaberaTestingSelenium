package wedDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserHistoryNavigation {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://docs.github.com/en/rest");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		URL url = new URL("https://www.w3schools.com/");
		driver.navigate().to(url);
		//or we can directly use like this also.
		//driver.navigate().to("https://www.w3schools.com/");
		
	}

}
