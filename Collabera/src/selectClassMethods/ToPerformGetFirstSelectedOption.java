package selectClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToPerformGetFirstSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("file:///C:/Users/admin/Downloads/dropDown.html");

		WebElement multiListBox = driver.findElement(By.id("m1"));

		Select multiSelect=new Select(multiListBox);
		System.out.println(multiSelect.isMultiple());//true

		multiSelect.selectByVisibleText("Guava");
		Thread.sleep(2000);
		multiSelect.selectByVisibleText("Apple");
		Thread.sleep(2000);
		multiSelect.selectByVisibleText("Orange");

		WebElement FirstSelectOpt = multiSelect.getFirstSelectedOption();// this method will select the first option in the dropdown list.
		System.out.println(FirstSelectOpt.getText());//it will not return or select the option which we have selected first in dropdown list.
		// output=Apple

		List<WebElement> AllSelectedOptions = multiSelect.getAllSelectedOptions();
		for(WebElement ele: AllSelectedOptions) {
			System.out.println(ele.getText());//it will not return or select the option which we have selected first in dropdown list.
		}
		/*output= Apple
				  Orange
				  Guava */
	}

}
