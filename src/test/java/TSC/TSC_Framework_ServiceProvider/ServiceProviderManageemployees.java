package TSC.TSC_Framework_ServiceProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;


public class ServiceProviderManageemployees extends TestBase
{
//	WebDriver dr;
	 @BeforeMethod
	 public void browser() throws Exception
	 { 
		 init();
		 /*System.out.println("Browser is ready to launching..");
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\shahinrana\\workspace\\TSC\\resource\\geckodriver.exe");
		dr=new FirefoxDriver();
		dr.get("http://192.168.1.29/TSCNew");*/
   }
	 @Test
	 public void ServiceProviderManageEmployees() throws Exception
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
		 Thread.sleep(500);
		 System.out.println("welcome profile");
		 dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[1]/ul/li[6]/a")).click();
		 Thread.sleep(500);
		 dr.findElement(By.linkText("Manage Employees")).click();
	
	     System.out.println("Name");
	     dr.findElement(By.cssSelector("#txtCoachName")).sendKeys("shah himani k");
	     System.out.println("Phone No");
	     dr.findElement(By.id("JSContactNumber")).sendKeys("9409205611");
	     System.out.println("Occupation");
	     dr.findElement(By.id("txtOccupation")).sendKeys("Automation Engineer");
	     System.out.println("Email");
	     dr.findElement(By.id("Email")).sendKeys("shahinrana@rangam.com");
	     System.out.println("Branch");
	     dr.findElement(By.id("BranchServingArea")).click();
	     dr.findElement(By.xpath("//*[@id='BranchServingArea']/option[4]")).click();
	     System.out.println("Submit");  
//	   Thread.sleep(7000);
	 }
	 
}
