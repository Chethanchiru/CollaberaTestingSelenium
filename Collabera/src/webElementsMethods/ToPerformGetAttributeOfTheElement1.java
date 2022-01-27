package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformGetAttributeOfTheElement1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		String expectedImgAlt="SkillRary";

		String ActualImgAlt = driver.findElement(By.xpath("//img[@class='img-responsive' and @alt='SkillRary']")).getAttribute("alt");

		if(expectedImgAlt.equals(ActualImgAlt)) {
			System.out.println(ActualImgAlt);
		}
		else {
			System.out.println("Text is not correct");
		}

		Thread.sleep(2000);
		
		String EmailTextField="chethanchiru777@gmail.com";

		WebElement EmailTF = driver.findElement(By.id("email"));
		EmailTF.clear();
		EmailTF.sendKeys(EmailTextField);
		
		//Thread.sleep(2000);
		String actualDataEntered= EmailTF.getAttribute("value");
		System.out.println(actualDataEntered);

		if(actualDataEntered.equals(EmailTextField)) {
			System.out.println("Entered proper emailId");
		}
		else {
			System.out.println("Enter proper emailId is not correct");
		}

	}

}
