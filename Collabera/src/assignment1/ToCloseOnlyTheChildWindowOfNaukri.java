package assignment1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseOnlyTheChildWindowOfNaukri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");

		String WindowId = driver.getWindowHandle();

		Set<String> AllWindowId = driver.getWindowHandles();
		AllWindowId.remove(WindowId);

		for(String Window:AllWindowId) {
			driver.switchTo().window(Window);
			driver.close();
		}

	}
}
