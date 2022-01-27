package webElementsMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {//in amazon website u will get only the navbar text of that particular page only

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		List<WebElement> navbar = driver.findElements(By.xpath("//a[@class='nav-a  ']"));
		
		System.out.println("List of navbar items : " +navbar.size());
		
		for(WebElement ele:navbar) {
			System.out.println(ele.getText());
		}
		
	}

}
