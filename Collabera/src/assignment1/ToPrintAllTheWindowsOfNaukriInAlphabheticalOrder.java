package assignment1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintAllTheWindowsOfNaukriInAlphabheticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");

		Set<String> AllWindowId = driver.getWindowHandles();

		TreeSet <String>titles=new TreeSet<String>();

		for(String Window:AllWindowId) {
			driver.switchTo().window(Window);
			titles.add(driver.getTitle());
		}
		for(String title:titles) {
			System.out.println(title);
		}


	}

}
