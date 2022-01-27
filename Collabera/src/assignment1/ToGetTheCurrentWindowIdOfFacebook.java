package assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheCurrentWindowIdOfFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String FBWindowID = driver.getWindowHandle();
		System.out.println("FaceBook Current Window ID = " +FBWindowID);
		
		// in this when ever to click on each time you will get new window id.
	}

}
