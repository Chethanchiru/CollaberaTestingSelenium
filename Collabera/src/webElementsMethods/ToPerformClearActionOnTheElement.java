package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformClearActionOnTheElement {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.vtiger.com/vtigercrm/");
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys("chethan");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("chethan@25",Keys.ENTER);
			//driver.findElement(By.xpath("//button[@type='submit' and @class='button buttonBlue']")).click();
	}

}
