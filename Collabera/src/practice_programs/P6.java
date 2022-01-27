package practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@autocomplete='off' and @type='text' and @class='_2IX_2- VJZDxU']")).sendKeys("7760958185");
		driver.findElement(By.xpath("//input[@autocomplete='off' and @type='password']")).sendKeys("Apple@25");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL' and @type='submit']")).click();
	}

}// problem org.openqa.selenium.ElementClickInterceptedException: element click intercepted:
