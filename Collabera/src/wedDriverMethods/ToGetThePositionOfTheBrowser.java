package wedDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetThePositionOfTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Point BrowserCordinate = driver.manage().window().getPosition();
		int Xposition = BrowserCordinate.getX();
		int Yposition = BrowserCordinate.getY();
		System.out.println("X Cordinate:" +Xposition+ "\n Y Cordinate:" +Yposition);
	}

}
