package locator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateAnElementUsingPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kalkifashion.com/");
		//Thread.sleep(2000);
		Set<String> AllWindowIds = driver.getWindowHandles();
		System.out.println(AllWindowIds);
		
		driver.switchTo().frame("wiz-iframe-intent");
		
		//Thread.sleep(2000);
		//driver.findElement(By.id("wzrk-cancel")).click();
		//driver.findElement(By.cssSelector("span[class='CT_InterstitialClose']")).click();
		//driver.findElement(By.cssSelector("span[onclick=\"parent.$WZRK_WR.closeIframe('1639562521','intentPreview');\"]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.tagName("a")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("Hot Pink Anarkali Suit In Silk")).click();
	}

}
// some problem


