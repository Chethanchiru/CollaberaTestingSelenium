package sendkeysVarargsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tryclose {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kalkifashion.com/");
		Thread.sleep(4000);
		driver.findElement(By.linkText("�")).click();
	}

}
