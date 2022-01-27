package selectClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropDownForMultiSelectAndDeselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("file:///C:/Users/admin/Downloads/dropDown.html");

		WebElement multiListBox = driver.findElement(By.id("m1"));

		Select multiSelect=new Select(multiListBox);
		System.out.println(multiSelect.isMultiple());

		//*******By using Select method i have selected the options********//
		multiSelect.selectByIndex(4);//Pineapple
		multiSelect.selectByValue("4");//Orange
		multiSelect.selectByVisibleText("Mango");//Mango

		Thread.sleep(3000);
		
		//*******By using deSelect method i have deselected the options********//
		//multiSelect.deselectByIndex(4);//Pineapple
		//multiSelect.deselectByValue("4");//Orange
		//multiSelect.deselectByVisibleText("Mango");//Mango

		//*******By using deSelectall method i have deselected all the options********//
		multiSelect.deselectAll();
	}

}
