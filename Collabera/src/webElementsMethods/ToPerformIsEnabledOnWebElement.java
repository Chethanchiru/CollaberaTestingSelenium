package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformIsEnabledOnWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup");
		Thread.sleep(2000);
		
		WebElement EmailTF = driver.findElement(By.id("email"));
		 
		 WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='button' and @data-continue-to=\"password-container\"]"));
		
		 System.out.println(ContinueButton.isEnabled());
		 
		 EmailTF.sendKeys("Chethan.v@gmail.com");
		 
		 Thread.sleep(2000);
		 
		 System.out.println(ContinueButton.isEnabled());
	}

}
