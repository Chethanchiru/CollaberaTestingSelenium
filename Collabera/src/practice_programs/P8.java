package practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		// i have used this set of code for registration process
		/*driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Chethan");
		driver.findElement(By.id("LastName")).sendKeys("V");
		driver.findElement(By.id("Email")).sendKeys("applemeb96@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Apple@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Apple@123");
		driver.findElement(By.id("register-button")).click();*/
		
		//*********Login*************//
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("applemeb96@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Apple@123");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		 
		
		
	}

}
