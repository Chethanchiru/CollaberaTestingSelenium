package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformGetRectOnWebElement { //System compatibility check for facebook

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Rectangle rectangle = driver.findElement(By.id("email")).getRect();
		int EmailHeight=rectangle.getHeight();
		int Emailwidth=rectangle.getWidth();
		int XPositionEmail=rectangle.getX();
		int YPositionEmail=rectangle.getY();
		int RightEmailTFAlignment=XPositionEmail+Emailwidth;
		int TopPositionETF=YPositionEmail+EmailHeight;

		System.out.println("EmailHeight = " +EmailHeight);
		System.out.println("Emailwidth = " +Emailwidth);
		System.out.println("XPositionEmail = " +XPositionEmail);
		System.out.println("YPositionEmail = " +YPositionEmail);
	
		Rectangle rectangle1 = driver.findElement(By.id("passContainer")).getRect(); //if we use id="pass" then there will be width difference of 64mm bcz it is not highlighting complete password textfield 
		int PasswordHeight=rectangle1.getHeight();
		int Passwordwidth=rectangle1.getWidth();
		int PasswordXPosition=rectangle1.getX();
		int PasswordYPosition=rectangle1.getY();
		int RightPasswordAlignment=PasswordXPosition+Passwordwidth;
		
		System.out.println();
		System.out.println("PasswordHeight = " +PasswordHeight);
		System.out.println("Passwordwidth = " +Passwordwidth);
		System.out.println("PasswordXPosition = " +PasswordXPosition);
		System.out.println("PasswordYPosition = " +PasswordYPosition);
		
		System.out.println();
		
		if(Emailwidth==Passwordwidth) {
			System.out.println("Left alignment is correct");
		}
		else
			System.out.println("Left alignment is not correct");
		
		System.out.println();
		
		if(RightEmailTFAlignment==RightPasswordAlignment) {
			System.out.println("Right alignment is correct");
		}
		else
			System.out.println("Right alignment is not correct");
		
		System.out.println();
		int space=TopPositionETF-PasswordYPosition;
		System.out.println(space);
	}

}
