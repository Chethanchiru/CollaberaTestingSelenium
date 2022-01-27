package wedDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheTitleOfTheWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		String gettingTitle = driver.getTitle();
		System.out.println(gettingTitle);
	}

}
