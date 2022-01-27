package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		Thread.sleep(2000);
		driver.findElement(By.linkText("X")).click();
		 WebElement UsernameTextfield = driver.findElement(By.id("email"));
		 UsernameTextfield.clear();
		 UsernameTextfield.sendKeys("Chethan",Keys.CONTROL+"a");
		 Thread.sleep(2000);
		 UsernameTextfield.sendKeys(Keys.CONTROL+"c");
		 Thread.sleep(2000);
		 driver.findElement(By.name("password")).sendKeys(Keys.CONTROL+"v");
		 Thread.sleep(2000);
		// driver.findElement(By.xpath("//i[@title='Show']")).sendKeys(Keys.ENTER); they have used i tag look like a button so sometimes it wont work by using sendKeys(Keys.ENTER) 
		 driver.findElement(By.xpath("//i[@title='Show']")).click();
	}

}
