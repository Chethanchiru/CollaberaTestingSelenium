package practice_programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		String facebookWindowId = driver.getWindowHandle();
		driver.switchTo().window(facebookWindowId);
		System.out.println(facebookWindowId);// CDwindow-5A4396BAF4AFAE7A66AADDCA7C308BD8 it will be in string format alphanumeric values
		
	}

}
