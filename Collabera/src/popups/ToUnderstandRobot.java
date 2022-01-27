package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class ToUnderstandRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

}
