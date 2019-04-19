package TSC_Framework_JobSeeker;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class JobSeekerForgotPassword extends TestBase
{
	 @BeforeTest
     public void browser() throws Exception
	{
   	 init();
	}
	 @Test
		public void forgotpassword() throws Exception
		{
		dr.get("http://192.168.1.29/TSCNew/LandingPage/JobSeekerView"); 
	    Thread.sleep(500);
	    dr.get("http://192.168.1.29/TSCNew/JobSeeker/Login");
	    System.out.println("Again Click on Login Button && clear emailid & Password field ");
	    dr.findElement(By.xpath(OR.getProperty("username"))).clear();
		dr.findElement(By.cssSelector(OR.getProperty("password"))).clear();
		System.out.println("Email");
		dr.findElement(By.xpath(OR.getProperty("username"))).sendKeys("emailfarhin@gmail.com");
		System.out.println("Password");
		
	    System.out.println("Click on forgot Password link.");
		dr.findElement(By.xpath(OR.getProperty("Forgotpassword"))).click();
		Thread.sleep(2000);
		System.out.println("now Enter Email ID to Recover Password is :");
		dr.findElement(By.xpath(OR.getProperty("username"))).sendKeys("emailfarhin@gmail.com");
		System.out.println("reset password");
	    System.out.println("click Back");
	    dr.findElement(By.cssSelector(OR.getProperty("BackButton"))).click();	
	    dr.close();
//	    Thread.sleep(7000);
		}	
}
