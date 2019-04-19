package TSC.TSC_Framework_ServiceProvider;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;


public class serviceproviderlogin  extends TestBase
{
//	WebDriver dr; //sameer@yahoo.com  //1234@RANA
	 @BeforeTest
	 public void browser() throws Exception
	 { 
		init();
     }
	@Test(priority=1)
    public void LoginWithValidEmailIdAndPassword() throws Exception
{   
		 System.out.println("This is login");
	     dr.get("http://192.168.1.29/TSCNew/LandingPage/EmployersView"); 
	     Thread.sleep(500);
	     dr.get("http://192.168.1.29/TSCNew/EmployerOrServiceProv/Login");
		 System.out.println("Again Click on Login Button && clear emailid & Password field ");
		 dr.findElement(By.xpath("//input[@value='Log in']")).click();
		 Thread.sleep(300);
		 dr.findElement(By.cssSelector("#UserEmail")).clear();
		 dr.findElement(By.cssSelector("#UserPassword")).clear();
		 System.out.println("Email");
		 dr.findElement(By.cssSelector("#UserEmail")).sendKeys("sameer@yahoo.com");
		 System.out.println("Password");
		 dr.findElement(By.cssSelector("#UserPassword")).sendKeys("123@Rana");
		 System.out.println("click on Login");
		 dr.findElement(By.xpath("//input[@value='Log in']")).click();
}
	 @Test(priority=2)
	public void LoginWithEmailFieldBlank() throws Exception
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
		 dr.findElement(By.cssSelector("#UserEmail")).sendKeys("");
		 System.out.println("Password");
		 dr.findElement(By.cssSelector("#UserPassword")).sendKeys("1234@RANA");
		 System.out.println("click on Login");
		 dr.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	 
	@Test(priority=3)
	public void LoginWithPasswordFieldBlank() throws Exception
	{
		 System.out.println("This is login");
	     dr.get("http://192.168.1.29/TSCNew/LandingPage/EmployersView"); 
	     Thread.sleep(500);
	     dr.get("http://192.168.1.29/TSCNew/EmployerOrServiceProv/Login");
		 System.out.println("Again Click on Login Button && clear emailid & Password field ");
		 dr.findElement(By.xpath("//input[@value='Log in']")).click();
		 dr.findElement(By.cssSelector("#UserEmail")).clear();
		 dr.findElement(By.cssSelector("#UserPassword")).clear();
		 System.out.println("Email");
		 dr.findElement(By.cssSelector("#UserEmail")).sendKeys("sameer@yahoo.com");
		 System.out.println("Password");
		 dr.findElement(By.cssSelector("#UserPassword")).sendKeys("");
		 System.out.println("click on Login");
		 dr.findElement(By.xpath("//input[@value='Log in']")).click();

      }
	@Test(priority=4)
	public void LoginWithInvalidIdAndPassword() throws Exception
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
		 dr.findElement(By.cssSelector("#UserEmail")).sendKeys("samexfer@yahfoo.com");
		 System.out.println("Password");
		 dr.findElement(By.cssSelector("#UserPassword")).sendKeys("12dasf34@RANA");
		 System.out.println("click on Login");
       	 dr.findElement(By.xpath("//input[@value='Log in']")).click();	 
	}	
}
	
	
	

