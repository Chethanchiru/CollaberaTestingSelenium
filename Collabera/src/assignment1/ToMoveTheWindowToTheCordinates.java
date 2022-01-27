package assignment1;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMoveTheWindowToTheCordinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().window().setPosition(new Point(100 , 50));
		
		//************This for verifying the position of X and Y axis***************//
		
		Point Position = driver.manage().window().getPosition();
		System.out.println("X axis position = " +Position.getX());
		System.out.println("Y axis position = " +Position.getY());
	}

}
