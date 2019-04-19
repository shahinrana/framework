package TSC_Framework_JobSeeker;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class JobseekerRegistration extends TestBase {
	@BeforeTest
	public void browser() throws Exception {
		init();
	}
	@Test(priority = 1)
	public void Registration() throws Exception {
		System.out.println("This is login");
		dr.get("http://staging.jobs.thespectrumcareers.com/LandingPage/JobSeekerView");
	    Thread.sleep(2000);
	    dr.findElement(By.linkText("Ok")).click();
	    Thread.sleep(2000);
	    dr.findElement(By.id("registerBtn")).click();
	    Thread.sleep(1000);
	    dr.findElement(By.linkText("Continue")).click();
	    Thread.sleep(1000);
	    dr.findElement(By.xpath("//*[@id='selectView']/div/div[2]/a/div")).click();
	 
		System.out.println("First Name");
		dr.findElement(By.id("FirstName")).sendKeys("fareen");
		dr.findElement(By.xpath("//*[@id='LastName']")).sendKeys("rana");
		System.out.println("Email");
		dr.findElement(By.xpath("//*[@id='Email']")).sendKeys("emaillfarhin@gmail.com");
		System.out.println("Password");
		dr.findElement(By.id("Password")).sendKeys("123@Rana");
		System.out.println("Address");
		dr.findElement(By.id("Address1")).sendKeys("street1");
		System.out.println("Country");
		dr.findElement(By.xpath("//*[@id='drpcountry']/option[3]")).click();
		System.out.println("City");
		dr.findElement(By.id("txtbranchcityname")).sendKeys("vadodara");
		System.out.println("State");
		dr.findElement(By.id("txtbranchstate")).sendKeys(" Gujarat");
		System.out.println("Enter Zipcode");
		dr.findElement(By.cssSelector("#txtnonusazipcode")).sendKeys("10000");
		Thread.sleep(3000);
		System.out.println("upload resume");
		dr.findElement(By.id("file")).click();	
		Thread.sleep(2000);
		StringSelection ss = new StringSelection("C://Users//shahinrana//Desktop//TSC.JPG");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER); // Press Enter
		robot.keyRelease(KeyEvent.VK_ENTER); // Release Enter
		robot.keyPress(KeyEvent.VK_CONTROL); // Press CTRL+V
		robot.keyPress(KeyEvent.VK_V); // Press CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL); // Release CTRL+V
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER); // Press Enter button
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Keyword Field");
      
		Thread.sleep(5000);
		dr.findElement(By.id("ResumeKeywords_tag")).sendKeys("framework job");
//		dr.findElement(By.cssSelector("#btnRegister")).click();
	dr.close();
		
	}

}
