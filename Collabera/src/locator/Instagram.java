package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);// if we dont give thread.sleep we will get  org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element:
		driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']")).sendKeys("7760856849");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Chethan");
	}

}
