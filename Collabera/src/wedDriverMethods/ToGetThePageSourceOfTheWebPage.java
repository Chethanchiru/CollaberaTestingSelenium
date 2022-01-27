package wedDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetThePageSourceOfTheWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.olacabs.com/");
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);

	}

}

