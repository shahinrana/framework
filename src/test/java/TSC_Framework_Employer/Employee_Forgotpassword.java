package TSC_Framework_Employer;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class Employee_Forgotpassword extends TestBase
{
	 @BeforeTest
     public void browser() throws Exception
	{
   	 init();
	}
	
	 @Test
		public void Empforgotpassword() throws Exception
		{
		dr.get("http://192.168.1.29/TSCNew/LandingPage/EmployersView"); 
	    Thread.sleep(500);
	    dr.get("http://192.168.1.29/TSCNew/EmployerOrServiceProv/Login");
	    System.out.println("Again Click on Login Button && clear emailid & Password field ");
	    dr.findElement(By.xpath(OR.getProperty("username"))).clear();
		dr.findElement(By.cssSelector(OR.getProperty("password"))).clear();
		System.out.println("Email");
		dr.findElement(By.xpath(OR.getProperty("username"))).sendKeys("shahinrana@ranagam.com");

	    System.out.println("Click on forgot Password link.");
		dr.findElement(By.xpath("//*[@id='frmLogin']/div/div/div[5]/a[3]")).click();
		System.out.println("now Enter Email ID to Recover Password is :");
		dr.findElement(By.xpath(OR.getProperty("username"))).sendKeys("shahinrana@ranagam.com");
		System.out.println("reset password");
	    System.out.println("click Back");
	  //  dr.findElement(By.cssSelector(OR.getProperty("BackButton"))).click();
	    dr.findElement(By.linkText("Back")).click();
	    dr.close();
//	    Thread.sleep(7000);
		}	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
}
