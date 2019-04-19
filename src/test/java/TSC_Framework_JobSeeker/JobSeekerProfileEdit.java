package TSC_Framework_JobSeeker;

import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;

public class JobSeekerProfileEdit extends TestBase {

	// WebDriver driver;
	@BeforeMethod
	public void browser() throws Exception {
		init();
		JobseekerLogin();
	}

	@Test(priority = 1)
	public void JobSeekerBasicInforamtion() throws Exception {
		
		Thread.sleep(5000);
		System.out.println("welcome farheen profile");
		dr.findElement(By.xpath("//*[@id='mainBG']/div[2]/div[1]/ul/li[4]/a")).click();
		Thread.sleep(5000);
		dr.findElement(By.linkText("My Profile")).click();
		System.out.println("My profile Bsic information page is open");
		dr.findElement(By.cssSelector("#basictab > a:nth-child(1)..")).click();
		Thread.sleep(5000);
		System.out.println(" Click On Update button");
//		 Thread.sleep(3000);
//	     dr.findElement(By.xpath("//*[@id='mainBG']/div[2]/div[1]/ul/li[4]/a")).click();
	    
	   
	}

	@Test(priority = 2)
	public void JobSeekerMyServiceProvider() throws Exception {

		Thread.sleep(500);
		System.out.println("welcome farheen profile");
		dr.findElement(By.xpath("//*[@id='mainBG']/div[2]/div[1]/ul/li[4]/a")).click();
		Thread.sleep(500);
		dr.findElement(By.linkText("My Profile")).click();
		System.out.println("My Service Provider");
		dr.findElement(By.cssSelector("#logintab > a:nth-child(1)")).click();
		Thread.sleep(500);
//		dr.findElement(By.cssSelector(".last > div:nth-child(2) > input:nth-child(2)")).click();
		dr.findElement(By.xpath("//*[@id='1']")).click();
		dr.findElement(By.cssSelector("#drpSpList")).click();
		Thread.sleep(500);
		dr.findElement(By.cssSelector("#drpSpList > option:nth-child(12)")).click();
		Thread.sleep(500);
		System.out.println("view & edit myResume");
		dr.findElement(By.cssSelector("#resumeaccess > input:nth-child(5)")).click();
		Thread.sleep(500);
		System.out.println("select NO for prefered contact person");
		dr.findElement(By.cssSelector("div.col-md-12:nth-child(3) > div:nth-child(2) > input:nth-child(4)")).click();
		System.out.println(" Click On Update button");
		dr.findElement(By.xpath("//input[@value='Update']")).click();
	}

}