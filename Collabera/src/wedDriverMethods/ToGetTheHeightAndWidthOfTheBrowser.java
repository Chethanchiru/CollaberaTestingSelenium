package wedDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheHeightAndWidthOfTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension dimension = driver.manage().window().getSize();
		int Height = dimension.getHeight();
		int Width = dimension.getWidth();
		System.out.println("Height: " +Height+ " and Width :" +Width);
		driver.quit();
	}

}
