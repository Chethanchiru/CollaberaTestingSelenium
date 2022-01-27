package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformGetAttributeOfTheElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		String expectedTootTipText="Do not select if this computer is shared";

		String ActualTootTipText = driver.findElement(By.id("keepMeLoggedInCaptionContainer")).getAttribute("title");

		if(expectedTootTipText.equals(ActualTootTipText)) {
			System.out.println(ActualTootTipText);
		}
		else {
			System.out.println("Text is not correct");
		}
	}

}
