package selectClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropDownForMultiSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/signup");

		WebElement dayListBox = driver.findElement(By.id("day"));
		WebElement monthListBox = driver.findElement(By.id("month"));
		WebElement yearListBox = driver.findElement(By.id("year"));

		//***************i have used selectByIndex() ,selectByValue(), selectByVisibleText()****************//
		Select daySelect=new Select(dayListBox);
		//daySelect.selectByIndex(4);// remember this that always index will start from 0
		//daySelect.selectByValue("5");
		daySelect.selectByVisibleText("5");
		
		Select monthSelect=new Select(monthListBox);
		//monthSelect.selectByIndex(7);
		//monthSelect.selectByValue("8");
		monthSelect.selectByVisibleText("Aug");
		

		Select yearSelect=new Select(yearListBox);
		//yearSelect.selectByIndex(1996);//org.openqa.selenium.NoSuchElementException: Cannot locate option with index: 1996 bcz index can be only one value not multiple values
		//yearSelect.selectByValue("1996");
		yearSelect.selectByVisibleText("1996");
		
	}
}
