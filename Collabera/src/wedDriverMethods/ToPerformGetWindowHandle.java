package wedDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformGetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		String WindowID = driver.getWindowHandle();
		System.out.println(WindowID);

	}

}

