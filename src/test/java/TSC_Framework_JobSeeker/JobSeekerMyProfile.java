package TSC_Framework_JobSeeker;

import java.util.concurrent.TimeUnit;

import org.omg.CORBA.OBJ_ADAPTER;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;
public class JobSeekerMyProfile extends TestBase
{
	
//	WebDriver driver;
    @BeforeMethod
     public void browser() throws Exception
	{
    	init();
    	JobseekerLogin();
	} 
    @Test(priority=1)
    public void viewprofile() throws Exception
    {
    	
    	 Thread.sleep(4000);
         System.out.println("login sucessfull");
   	     System.out.println("welcome farheen profile");
  	      dr.findElement(By.xpath(OR.getProperty("WelcomeProfile"))).click();
//   	     Thread.sleep(7000);
// 	     dr.findElement(By.linkText("My Profile")).click();
   	     dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//   	  Thread.sleep(3000);
    /*  dr.findElement(By.xpath("//*[@id='mainBG']/div[2]/div[1]/ul/li[4]/a")).click();
      Thread.sleep(3000);
      dr.findElement(By.linkText("Logout")).click();*/
    }
}
