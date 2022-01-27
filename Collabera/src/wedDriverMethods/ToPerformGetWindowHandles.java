package wedDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformGetWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> AllWindowIDs = driver.getWindowHandles();
		//System.out.println(AllWindowID);
		String expectedTitle="Tech Mahindra";

		for(String WindowID:AllWindowIDs)
		{
			driver.switchTo().window(WindowID);
			String actualTitle=driver.getTitle();
			if (expectedTitle.equals(actualTitle)) {
				driver.manage().window().maximize();
			}
		}

	}

}
