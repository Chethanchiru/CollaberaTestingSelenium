package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformGetTextOfTheElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		String expectedTitle="Please identify yourself";
		String expectedAdmin="Administrator:";
		//String expectedUserName="Username: ";
		String expectedUN="admin";
		
		String ActualTitle = driver.findElement(By.id("headerContainer")).getText();
		String ActualAdmin = driver.findElement(By.id("adminCredentialsHeader")).getText();
		String ActualUN=driver.findElement(By.xpath("//b[text()='admin']")).getText();
		
		if((expectedAdmin.equals(ActualAdmin)) && (expectedAdmin.equals(ActualAdmin)) && (expectedUN.equals(ActualUN)) ){
			System.out.println(ActualTitle);
			System.out.println(ActualAdmin);
			System.out.println(ActualUN);
			
		}
		else {
			System.out.println("Text is not correct");
		}
	}

}
