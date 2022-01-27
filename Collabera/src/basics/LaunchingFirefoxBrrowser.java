package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFirefoxBrrowser {

		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			FirefoxDriver driver=new FirefoxDriver ();
			
			Thread.sleep(2000);
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver1=new ChromeDriver();
		}

	}


