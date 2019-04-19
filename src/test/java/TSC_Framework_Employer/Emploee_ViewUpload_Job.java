package TSC_Framework_Employer;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class Emploee_ViewUpload_Job extends TestBase {
	@BeforeClass
	public void login() throws Exception {
		init();
		EmployerLogin();
	}

	@Test
	public void View_UploadJob_Edit_close() throws Exception {
		dr.findElement(By.xpath(OR.getProperty("JobPosted"))).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id='Grid']/div[1]/div/div/div[1]/div/a[1]")).click();
		Thread.sleep(3000);
		dr.findElement(By.linkText("Edit")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath(OR.getProperty("JobTitle"))).click();
		System.out.println("select Job type");
		dr.findElement(By.xpath(OR.getProperty("Jobtype"))).click();
		Thread.sleep(3000);
		dr.findElement(By.id(OR.getProperty("Status"))).click();
		dr.findElement(By.id(OR.getProperty("AvailablePosition"))).click();
		Thread.sleep(2000);
		/*dr.findElement(By.xpath(OR.getProperty("zipcode"))).clear();
	
		dr.findElement(By.xpath(OR.getProperty("zipcode"))).sendKeys("10001");*/
		
		dr.findElement(By.xpath("//*[@id='submitreq']")).click();
		Thread.sleep(5000);
	    dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		
	}

	/*@Test(priority = 1)
	public void ViewOpenJob_Remove() throws Exception {
		dr.findElement(By.xpath("//*[@id='frmDashboard']/div[1]/div[2]/div[2]/div[1]/div/a/span[1]/strong")).click();
		Thread.sleep(3000);
		// when change job edit div[8]
		dr.findElement(By.xpath("//*[@id='Grid']/div[4]/div/div/div[1]/div/a[1]")).click();
		Thread.sleep(3000);
		dr.findElement(By.linkText("Remove")).click();

		
		 * Robot robot=new Robot(); robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 

	}
*/
}
