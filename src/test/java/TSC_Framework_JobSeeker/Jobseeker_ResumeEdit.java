package TSC_Framework_JobSeeker;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class Jobseeker_ResumeEdit extends TestBase {
	@BeforeTest
	public void browser() throws Exception {
		init();
		JobseekerLogin();
	}
	/*@Test(priority=1)
	public void ResumeEdit() throws Exception {
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id='menu']/div[3]/div/a/span[1]/strong")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//a[@class='loginBtn marTop5 boxRipple ripple-effect']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@id='btnFirst' and @value='Next']")).click();
		Thread.sleep(5000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		// dr.findElement(By.xpath("//*[@id='InstitutionName']")).sendKeys("Test");
		dr.findElement(By.id("HighDegree")).clear();
		Thread.sleep(2000);
		 dr.findElement(By.xpath("//input[@class='loginBtn addExp marTop5 boxRipple ripple-effect' and @id='btnSecond']")).click();

		 Actions action=new Actions(dr);
		 action.sendKeys(Keys.ENTER).build().perform();
		 
		 dr.findElement(By.id("btnSecond")).click();
		 
	}*/
	
	@Test(priority=2)
	public void Resumeshare() throws Exception
	{
		dr.findElement(By.xpath("//*[@id='menu']/div[3]/div/a/span[1]/strong")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@id='viewDetails']/div/div/div/div[4]/div/a[2]")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@id='shareResume']/div/div/div[1]/div[2]/ul/li/input")).sendKeys("abc@yahoo.com");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id='FirstName']")).clear();
		dr.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("shahin rana");
		
		
	}
}
