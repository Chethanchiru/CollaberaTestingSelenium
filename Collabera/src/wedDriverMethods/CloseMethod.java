package wedDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		driver.close();// in close method it closes only parent window bcz the driver control is present in parent window.& it will not stop the server.
	}

}
