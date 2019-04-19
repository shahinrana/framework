package TSC_Framework_JobSeeker;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;



public class jobseekerInvitee extends TestBase
{
//	WebDriver driver;
@BeforeMethod
public void browser() throws Exception
{
	init();	  
	JobseekerLogin();
}
@Test
	 public void inviteee() throws InterruptedException
 {
	 System.out.println("click on invitee");
	 Thread.sleep(500);
 	 System.out.println("welcome farheen profile");
     dr.findElement(By.xpath("//*[@id='mainBG']/div[2]/div[1]/ul/li[4]/a")).click();
     Thread.sleep(500);
     dr.findElement(By.linkText("My Invitees")).click();
//     Thread.sleep(7000);
     /*Thread.sleep(3000);
     dr.findElement(By.xpath("//*[@id='mainBG']/div[2]/div[1]/ul/li[4]/a")).click();
     Thread.sleep(3000);
     dr.findElement(By.linkText("Logout")).click();*/
	     }
      
}