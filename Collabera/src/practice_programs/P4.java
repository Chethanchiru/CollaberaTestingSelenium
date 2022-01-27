package practice_programs;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parentWindowId = driver.getWindowHandle();
		Set<String> AllWindowId = driver.getWindowHandles();
		AllWindowId.remove(parentWindowId);// if we don't write line also the program will work
		
		for(String WindowID : AllWindowId ) {	// in this program i am maximizing all the child browser
			driver.switchTo().window(WindowID);
			driver.manage().window().maximize();
			System.out.println(WindowID);
		}
	}

}
