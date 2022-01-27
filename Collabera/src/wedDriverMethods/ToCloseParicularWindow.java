package wedDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseParicularWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		//String parentWindowId = driver.getWindowHandle();
		Set<String> AllWindowIds = driver.getWindowHandles();
		
		for(String WindowId:AllWindowIds) {
			driver.switchTo().window(WindowId);
			if(WindowId.equals(AllWindowIds)) {
				AllWindowIds.remove(WindowId);
			}
			
		}
			
	}// some problem for this i haved solved the problem in practice package p5
	

}
