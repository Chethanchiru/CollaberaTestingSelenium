package webElementsMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).click();
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//li[@role='presentation' and not(@id)]"));
		
		System.out.println("List of auto Suggestions = " +autoSuggestions.size());
		
		for(WebElement ele:autoSuggestions) {
			System.out.println(ele.getText());
		}
	}

}
