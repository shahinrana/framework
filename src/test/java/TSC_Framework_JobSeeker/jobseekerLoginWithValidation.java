package TSC_Framework_JobSeeker;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class jobseekerLoginWithValidation extends TestBase {
	@BeforeTest
	public void browser() throws Exception {
		init();
	}

	@Test(priority = 1)
	public void LoginAsValidEmailidAndPassowrd() throws Exception {

		System.out.println("This is login");
		dr.get("http://192.168.1.29/TSCNew/LandingPage/JobSeekerView");
		Thread.sleep(5000);
		dr.get("http://192.168.1.29/TSCNew/JobSeeker/Login");
		System.out.println("Again Click on Login Button && clear emailid & Password field ");
		Thread.sleep(5000);
		dr.findElement(By.xpath("//*[@id='UserEmail']")).clear();
		dr.findElement(By.cssSelector("#UserPassword")).clear();
		System.out.println("Email");
		dr.findElement(By.cssSelector("#UserEmail")).sendKeys("emailfarhin@gmail.com");
		System.out.println("Password");
		dr.findElement(By.cssSelector("#UserPassword")).sendKeys("123@farhin");
		System.out.println("click on Login");
		dr.findElement(By.xpath("//input[@value='Log in']")).click();
//		Thread.sleep(5000);
	}

	@Test(priority=2) public void LoginAsEmailFieldBlank() throws Exception
	{
	  System.out.println("This is login");
	  dr.get("http://192.168.1.29/TSCNew/LandingPage/JobSeekerView");
	  Thread.sleep(5000); 
	  dr.get("http://192.168.1.29/TSCNew/JobSeeker/Login");
	  System.out.println("Again Click on Login Button && clear emailid & Password field ");
	  dr.findElement(By.xpath("//input[@value='Log in']")).click();
	  Thread.sleep(3000);
	  dr.findElement(By.xpath("//*[@id='UserEmail']")).clear();
		dr.findElement(By.cssSelector("#UserPassword")).clear();
	  System.out.println("Email");
	  dr.findElement(By.xpath("//*[@id='UserEmail']")).sendKeys("");
	  System.out.println("Password");
	  dr.findElement(By.cssSelector("#UserPassword")).sendKeys("123@farhin");
	  System.out.println("click on Login"); 
	  dr.findElement(By.xpath("//input[@value='Log in']")).click();
//	  Thread.sleep(5000);
	 }

	@Test(priority = 3)
	public void LoginAsPasswordFieldBlank() throws Exception {

		System.out.println("This is login");
		dr.get("http://192.168.1.29/TSCNew/LandingPage/JobSeekerView");
		Thread.sleep(500);
		dr.get("http://192.168.1.29/TSCNew/JobSeeker/Login");
		System.out.println("Again Click on Login Button && clear emailid & Password field ");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//input[@value='Log in']")).click();
		dr.findElement(By.xpath("//*[@id='UserEmail']")).clear();
		dr.findElement(By.cssSelector("#UserPassword")).clear();
		System.out.println("Email");
		dr.findElement(By.cssSelector("#UserEmail")).sendKeys("emailfarhin@gmail.com");
		System.out.println("Password");
		dr.findElement(By.cssSelector("#UserPassword")).sendKeys("");
		System.out.println("click on Login"); //
		dr.findElement(By.xpath("//input[@value='Log in']")).click();
//		Thread.sleep(7000);
	}

	@Test(priority = 4)
	public void LoginAsWrongEmailAndPassword() throws Exception {
		System.out.println("This is login");
		dr.get("http://192.168.1.29/TSCNew/LandingPage/JobSeekerView");
		Thread.sleep(500);
		dr.get("http://192.168.1.29/TSCNew/JobSeeker/Login");
		System.out.println("Again Click on Login Button && clear emailid & Password field ");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//input[@value='Log in']")).click();
		dr.findElement(By.cssSelector("#UserEmail")).clear();
		dr.findElement(By.cssSelector("#UserPassword")).clear();
		System.out.println("Email");
		dr.findElement(By.cssSelector("#UserEmail")).sendKeys("shahana@ragam.com");
		System.out.println("Password");
		dr.findElement(By.cssSelector("#UserPassword")).sendKeys("sd77fg");
		System.out.println("click on Login");
		dr.findElement(By.xpath("//input[@value='Log in']")).click();
//		Thread.sleep(7000);
	}
	
}
