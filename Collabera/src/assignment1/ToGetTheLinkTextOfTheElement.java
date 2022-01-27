package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheLinkTextOfTheElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String LinkText = driver.findElement(By.linkText("Amazon Pay")).getText();
		System.out.println("Link Text = " +LinkText);
	}

}
