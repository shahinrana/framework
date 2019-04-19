package TSC_Framework_JobSeeker;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class JobseekerReg1 extends TestBase {
	@BeforeTest
	public void browser() throws Exception {
		init();
	}
	// this is sample view registration
	@Test
	public void jobseekerReg() throws Exception {
		System.out.println("click on register now");
		dr.get("http://192.168.1.29/TSCNew/JobSeeker/ViewSelection");
		System.out.println("select simpleview for registration");
//		dr.findElement(By.xpath("//*[@id='selectView']/div/div[1]/a")).click();
//		dr.findElement(By.xpath("//*[@id='FormControlReg']"));
		System.out.println("Basic information form");
		System.out.println("firstname");
		dr.findElement(By.xpath("//*[@id='txtFirstName']")).sendKeys("shahin");
		System.out.println("Middlename");
		dr.findElement(By.xpath("//*[@id='txtMiddleName']")).sendKeys("");
		dr.findElement(By.xpath("//*[@id='txtLastName']")).sendKeys("Rana");
		dr.findElement(By.xpath("//*[@id='btnFirst']")).click();
	    System.out.println("Login information");
		Thread.sleep(3000);
		System.out.println("Email");
		dr.findElement(By.id("txtEmailID")).sendKeys("abcn@gmail.com");
		System.out.println("Password");
		dr.findElement(By.xpath("//*[@id='Password']")).sendKeys("sh@9409205611");
		// dr.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("sh@9409205611");
		System.out.println("Confirm Password");
		// dr.findElement(By.xpath("//*[@id='txtConfPassword']")).sendKeys("sh@9409205611");
		dr.findElement(By.xpath("//*[@id='btnSecond']")).click();
		Thread.sleep(100);
        System.out.println("----------------");
		System.out.println("Contact information");
		dr.findElement(By.xpath("//*[@id='btnThird']")).click();
		System.out.println("enter Address");
		dr.findElement(By.xpath("//*[@id='txtAddress1']")).sendKeys("abc1");
		System.out.println("enter Country");
		dr.findElement(By.id("drpcountry")).click();
		Thread.sleep(100);
		dr.findElement(By.xpath("//*[@id='drpcountry']/option[3]")).click();
		System.out.println("enter City");
		dr.findElement(By.xpath("//*[@id='txtbranchcityname']")).sendKeys("siddney");
		System.out.println("enter State");
		dr.findElement(By.xpath("//*[@id='txtbranchstate']")).sendKeys("New South Wales");

		System.out.println("enter Zipcode");
		dr.findElement(By.xpath("//input[@id='txtnonusazipcode']")).sendKeys("202655");

		System.out.println("enter phone number");
		dr.findElement(By.xpath("//*[@id='txtContactNum']")).sendKeys("1000455662");
		Thread.sleep(500);
		dr.findElement(By.xpath("//*[@id='btnThird']")).click();

		System.out.println("support service");
		dr.findElement(By.cssSelector("#supporttab > a:nth-child(1)")).click();
		System.out.println("upload resume");
		dr.findElement(By.xpath("//*[@id='support-info']/div[2]/div"));
		Thread.sleep(500);
		dr.findElement(By.id("file")).click();
		
		StringSelection ss = new StringSelection("C:\\Users\\shahinrana\\Desktop\\ressmb\\resume.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
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

		System.out.println("keyword");
		dr.findElement(By.id("ResumeKeywords_tag")).sendKeys("selenium");

		System.out.println("linkedin profile");
		dr.findElement(By.id("LinkedInProfileUrl")).sendKeys("https://www.linkedin.com/feed/?trk=");
	}
}

