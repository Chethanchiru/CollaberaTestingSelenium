package assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheTitleUrlPageSourceOfFilpkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String FlipkartTitle = driver.getTitle();
		String FilpkartUrl = driver.getCurrentUrl();
		String FilpkartPageSource = driver.getPageSource();
		System.out.println("Flipkart Title = " +FlipkartTitle);
		System.out.println();
		System.out.println("Filpkart Url = " +FilpkartUrl);
		System.out.println();
		System.out.println("Filpkart Page Source = " +FilpkartPageSource);
		
		// we want to change window console size or it will not display Flipkart Title and Filpkart Url
	}

}
