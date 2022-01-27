package taskGivenBySumanthSir;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchControlToIFrameRediffTask { //username=navgire.kartik // password=Rukartik@12


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		/*driver.findElement(By.id("login1")).sendKeys("sumanthELFBatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();*/

		driver.findElement(By.id("login1")).sendKeys("navgire.kartik");
		driver.findElement(By.id("password")).sendKeys("Rukartik@12");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Write mail")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("TO_IDcmp2")).sendKeys("navgire.kartik@rediffmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("Chethan");
		Thread.sleep(2000);
		WebElement FrameElement= driver.findElement(By.xpath("(//iframe[@class='cke_wysiwyg_frame cke_reset'])[1]"));
		driver.switchTo().frame(FrameElement);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Good Afternoon sir!");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Send")).click();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(2000);
		for(;;) {
			try {
				driver.findElement(By.xpath("//span[text()='kartik navgire']/..//cite[@title='Select mail']")).click();
				driver.findElement(By.xpath("(//span[text()='Delete'])[1]")).click();
				driver.findElement(By.xpath("//button[text()='Ok']")).click();
				break;
			}catch(NoSuchElementException e) {
				driver.navigate().refresh();
			}
		}
	}

}
