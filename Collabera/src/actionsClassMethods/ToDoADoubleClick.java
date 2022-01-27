package actionsClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDoADoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		
		WebElement plusIcon = driver.findElement(By.id("add"));
		
		Actions action=new Actions(driver);
		action.doubleClick(plusIcon).perform();//this is for just showing that we can perform double Click by passing an webelement
		action.moveToElement(plusIcon).doubleClick().perform();//this is for just showing that we can perform double Click without passing any webelement

	}

}
