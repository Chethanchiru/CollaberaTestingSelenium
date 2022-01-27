package wedDriverMethods;


import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetThePositionOfTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Point point = new Point(50, 100);
		driver.manage().window().setPosition(new Point(100, 100));
	}

}
