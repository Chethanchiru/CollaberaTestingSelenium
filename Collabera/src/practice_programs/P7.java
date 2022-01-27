package practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@autocomplete='new-password' and @maxlength='10']")).sendKeys("7760968189");
	}

}
