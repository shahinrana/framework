package TSC.TSC_Framework_ServiceProvider;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;


public class ServiceproviderJobSeeker extends TestBase
{
	 @BeforeTest
	 public void browser() throws Exception
	 { 
		 init(); 
     }
	 @Test
	 public void DashboardAndSearchJobSeeker() throws InterruptedException
	 {
		 System.out.println("This is login");
	     dr.get("http://192.168.1.29/TSCNew/LandingPage/EmployersView"); 
	     Thread.sleep(500);
	     dr.get("http://192.168.1.29/TSCNew/EmployerOrServiceProv/Login");
		 System.out.println("Again Click on Login Button && clear emailid & Password field ");
		 dr.findElement(By.xpath("//input[@value='Log in']")).click();
		 Thread.sleep(3000);
		 dr.findElement(By.cssSelector("#UserEmail")).clear();
		 dr.findElement(By.cssSelector("#UserPassword")).clear();
		 System.out.println("Email");
		 dr.findElement(By.cssSelector("#UserEmail")).sendKeys("sameer@yahoo.com");
		 System.out.println("Password");
		 dr.findElement(By.cssSelector("#UserPassword")).sendKeys("123@Rana");
		 System.out.println("click on Login"); 
		 dr.findElement(By.xpath("//input[@value='Log in']")).click();
		 Thread.sleep(200);
		 dr.manage().window().maximize();	 
		 dr.findElement(By.id("dashboard")).click();
		 Thread.sleep(500);
		 System.out.println("search for jobseeker");
		 dr.findElement(By.xpath("//*[@id='search']")).click();	 
		 System.out.println("keyword");
		 dr.findElement(By.xpath("//*[@id='txtKeywords_tag']")).sendKeys("  computer operator");
		 System.out.println("city");
		 dr.findElement(By.xpath("//*[@id='City']")).sendKeys("New York");
		 System.out.println("state");
		 dr.findElement(By.xpath("//*[@id='State']")).sendKeys("Empire State");
		 dr.findElement(By.xpath("//*[@id='chkWithResume']")).click();
		 Thread.sleep(1000);
		 System.out.println("click on serchjobseeker submit");
		 dr.findElement(By.cssSelector(".homeSearch")).click();	 
		 System.out.println("invite");
		 dr.findElement(By.cssSelector(".invitee")).click();
		 System.out.println("Name");
		 dr.findElement(By.cssSelector("#name")).sendKeys("shahin");
		 System.out.println("EmailAddress");
		 dr.findElement(By.cssSelector("#to")).sendKeys("shahinrana@rangam.com");
//	Thread.sleep(7000);
	 }
	 
	 

}
