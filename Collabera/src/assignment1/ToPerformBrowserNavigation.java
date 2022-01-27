package assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
