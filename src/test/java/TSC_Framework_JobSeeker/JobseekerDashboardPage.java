package TSC_Framework_JobSeeker;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class JobseekerDashboardPage  extends TestBase{
	@BeforeClass
	public void browser() throws Exception {
		init();
		JobseekerLogin();
	}
	@Test
	public void DashboardPage() throws Exception
	{
		dr.findElement(By.id(OR.getProperty("DashBoard"))).click();
		System.out.println("Matching Jobs");
		dr.findElement(By.xpath(OR.getProperty("MatchingJobs"))).click();
		System.out.println("My Application");
		dr.findElement(By.xpath(OR.getProperty("MyApplication"))).click();
		System.out.println("My Resume");
		dr.findElement(By.xpath(OR.getProperty("MyResume"))).click();
		dr.navigate().back();
		Thread.sleep(2000);
		System.out.println("My Saved Jobs");
		dr.findElement(By.xpath(OR.getProperty("MySavedJobs"))).click();
	}
}
