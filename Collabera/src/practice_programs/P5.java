package practice_programs;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parentWindowId = driver.getWindowHandle();
		Set<String> AllWindowId = driver.getWindowHandles();
		AllWindowId.remove(parentWindowId);

		//String expectedUrl="https://company.naukri.com/popups/techmahindra/9dec2021/index.html";
		//String expectedUrl="https://company.naukri.com/popups/icici/23072021/index.html";
		String expectedUrl="https://company.naukri.com/popups/techmahindra/13dec2021/index.html";	
		
		for(String WindowID : AllWindowId ) {
			driver.switchTo().window(WindowID);
			String actualUrl = driver.getCurrentUrl();
			if(expectedUrl.equals(actualUrl)) {	// in this program i am closing particular child browser with the help of url.
				driver.close();
			}

		}
	}

}
//https://company.naukri.com/popups/icici/23072021/index.html
//https://company.naukri.com/popups/techmahindra/9dec2021/index.html--->Techmahindra 1st child browser
//https://company.naukri.com/popups/techmahindra/13dec2021/index.html--->Techmahindra 2st child browser
