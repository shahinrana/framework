package TSC_Framework_JobSeeker;

import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;

public class Jobseekerlogin extends TestBase {
	// WebDriver dr;

	@BeforeTest
	public void browser() throws Exception {
		init();
	}

	@Test(priority = 1)
	public void LoginAsValidEmailidAndPassowrd() throws Exception {

		System.out.println("This is login");
		dr.get("http://192.168.1.29/TSCNew/LandingPage/JobSeekerView");
		Thread.sleep(500);
		dr.get("http://192.168.1.29/TSCNew/JobSeeker/Login");
		System.out.println("Again Click on Login Button && clear emailid & Password field ");
		// dr.findElement(By.cssSelector(".login-area > div:nth-child(4) >
		// input:nth-child(1)")).click();
		Thread.sleep(5000);
		dr.findElement(By.xpath("//*[@id='UserEmail']")).clear();
		dr.findElement(By.cssSelector("#UserPassword")).clear();
		System.out.println("Email");
		dr.findElement(By.cssSelector("#UserEmail")).sendKeys("emailfarhin@gmail.com");
		System.out.println("Password");
		dr.findElement(By.cssSelector("#UserPassword")).sendKeys("123@Rana");
		System.out.println("click on Login");
		dr.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(5000);
		dr.findElement(By.xpath("//*[@id='menu']/div[1]/div/a/span[1]/strong")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id='menu']/div[2]/div/a/span[1]/strong")).click();
		Thread.sleep(500);
		dr.findElement(By.xpath("//*[@id='menu']/div[3]/div/a/span[1]/strong")).click();
		 
//		 Thread.sleep(7000);
	     /*dr.findElement(By.xpath("//*[@id='mainBG']/div[2]/div[1]/ul/li[4]/a")).click();
	     Thread.sleep(3000);
	     dr.findElement(By.linkText("Logout")).click();*/
		
		
	}
	
}
