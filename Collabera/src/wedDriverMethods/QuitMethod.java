package wedDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		driver.quit();// in quit method it closes both parent window & child Window or it will close all the pages opened in web browser. & it will stop the server.	
	}
}
