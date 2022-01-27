package assignment1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToResizeTheWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().window().setSize(new Dimension(100, 200));
		
		//************This for verifying the Dimension***************//
		
				Dimension dimension = driver.manage().window().getSize();
				System.out.println("Height = " +dimension.getHeight());
				System.out.println("Width = " +dimension.getWidth());
	}

}
