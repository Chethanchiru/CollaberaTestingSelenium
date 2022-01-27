package wedDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetTheHeightAndWidthOfTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension dimension = new  Dimension(1212, 500);// height=
		driver.manage().window().setSize(dimension);

	}

}
