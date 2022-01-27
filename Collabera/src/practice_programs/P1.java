package practice_programs;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.manage().window().fullscreen();
		Thread.sleep(6000);
		Dimension dimension = driver.manage().window().getSize();
		System.out.println(dimension.getHeight());
		System.out.println(dimension.getWidth());
		Thread.sleep(6000);
		driver.manage().window().setSize(new Dimension(600,600));
		Thread.sleep(6000);
		Point point = driver.manage().window().getPosition();
		System.out.println(point.getX());
		System.out.println(point.getY());
		
	}

}
