package TSC_Framework_Employer;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class EmployeeJobsupportingFileUpload extends TestBase {
	public static Logger log = Logger.getLogger(EmployeeJobsupportingFileUpload.class.getName());

	@BeforeTest
	public void browser() throws Exception {
		init();
	}
	@Test(priority = 1)
	public void EmpLoginJobsupportingfileupload() throws Exception {
		System.out.println("This is login");
		dr.get("http://192.168.1.29/TSCNew/LandingPage/EmployersView");
		Thread.sleep(500);
		dr.get("http://192.168.1.29/TSCNew/EmployerOrServiceProv/Login");
		System.out.println("Again Click on Login Button && clear emailid & Password field ");
		dr.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(300);
		dr.findElement(By.cssSelector("#UserEmail")).clear();
		dr.findElement(By.cssSelector("#UserPassword")).clear();
		System.out.println("Email");
		dr.findElement(By.cssSelector("#UserEmail")).sendKeys("shahinrana@ranagam.com");
		System.out.println("Password");
		dr.findElement(By.cssSelector("#UserPassword")).sendKeys("123@Rana");
		System.out.println("click on Login");
		dr.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(500);
		dr.findElement(By.xpath("//*[@id='postJob']")).click();
		Thread.sleep(5000);
		System.out.println("-----------------------------------------");

	}
}

/*
 * robot class code Robot robot=new Robot(); robot.keyPress(KeyEvent.VK_ENTER);
 * // Press Enter robot.keyRelease(KeyEvent.VK_ENTER); // Release Enter
 * robot.keyPress(KeyEvent.VK_CONTROL); // Press CTRL+V
 * robot.keyPress(KeyEvent.VK_V); // Press CTRL+V
 * robot.keyRelease(KeyEvent.VK_CONTROL); // Release CTRL+V
 * robot.keyRelease(KeyEvent.VK_V); Thread.sleep(500);
 * robot.keyPress(KeyEvent.VK_ENTER); // Press Enter button
 * robot.keyRelease(KeyEvent.VK_ENTER);
 */
