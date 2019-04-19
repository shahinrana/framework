package TSC_Framework_AllTestCase;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class Employee_TestCase extends TestBase {
	@BeforeClass
	public void browser() throws Exception {
		init();
		EmployerLogin();	
	}
	@Test(priority = 1)
	public void EmpLoginandOtherSearch() throws Exception {
		Thread.sleep(3000);
		dr.findElement(By.cssSelector(OR.getProperty("Search"))).click();
		Thread.sleep(500);
		dr.findElement(By.xpath(OR.getProperty("OtherSerach"))).click();
		Thread.sleep(500);
		dr.findElement(By.xpath(OR.getProperty("SearchByEmployer"))).click();
		Thread.sleep(500);
		dr.findElement(By.xpath(OR.getProperty("Keyword"))).sendKeys("");
		Thread.sleep(500);
		dr.findElement(By.xpath(OR.getProperty("zipcode"))).sendKeys("12345");
		Thread.sleep(500);
		dr.findElement(By.xpath(OR.getProperty("WithinMiles"))).sendKeys("");
		dr.findElement(By.xpath(OR.getProperty("SearchEmployers"))).click();
		Thread.sleep(5000);
	}

	@Test(priority = 2)
	public void EmpLoginJobsupportingfileupload() throws Exception {
		Thread.sleep(5000);
		dr.findElement(By.xpath(OR.getProperty("PostJob"))).click();
		Thread.sleep(5000);
		System.out.println("-----------------------------------------");

	}

	@Test(priority = 3)
	public void EmpLoginandsearchforJobseeker() throws Exception {
		Thread.sleep(5000);
		dr.findElement(By.cssSelector(OR.getProperty("Search"))).click();
		Thread.sleep(500);
		dr.findElement(By.linkText(OR.getProperty("serchForJobseekerlink"))).click();
		Thread.sleep(500);
		dr.findElement(By.xpath(OR.getProperty("zipcode"))).sendKeys("12345");
		Thread.sleep(500);
		dr.findElement(By.xpath(OR.getProperty("searchJobSeekersButton"))).click();
	}
	@Test(priority = 4)
	public void EmpprofileviewJobs() throws Exception {

		System.out.println("now click on dashboard");
		dr.findElement(By.id(OR.getProperty("DashBoard"))).click();
		Thread.sleep(5000);
		dr.findElement(By.xpath(OR.getProperty("JobPosted"))).click();
		Thread.sleep(7000);
		dr.findElement(By.xpath(OR.getProperty("OpenJobs"))).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath(OR.getProperty("ClosedJobs"))).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath(OR.getProperty("AppliedJobs"))).click();
		Thread.sleep(3000);

	}
	@Test(priority = 5)
	public void ViewOpenJob_Remove() throws Exception {
		dr.findElement(By.xpath(OR.getProperty("JobPosted"))).click();
		Thread.sleep(3000); // when change job edit div[8]
		dr.findElement(By.xpath(OR.getProperty("View"))).click();
		Thread.sleep(3000);
		// dr.findElement(By.linkText(OR.getProperty("RemoveBtn"))).click();
		System.out.println("Now press enter button to remove Job");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	@Test(priority = 0)
	public void View_UploadJob_Edit_close() throws Exception {
		dr.findElement(By.xpath(OR.getProperty("JobPosted"))).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id='Grid']/div[1]/div/div/div[1]/div/a[1]")).click();
		Thread.sleep(3000);
		dr.findElement(By.linkText("Edit")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath(OR.getProperty("JobTitle"))).click();
		System.out.println("select Job type");
		dr.findElement(By.xpath(OR.getProperty("Jobtype"))).click();
		Thread.sleep(3000);
		dr.findElement(By.id(OR.getProperty("Status"))).click();
		dr.findElement(By.id(OR.getProperty("AvailablePosition"))).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@id='submitreq']")).click();
		Thread.sleep(5000);
	}

/*	@Test(priority = 7)
	public void EmpprofilePostjob() throws Exception {
		Thread.sleep(5000);
		System.out.println("now click on post job");
		dr.findElement(By.xpath(OR.getProperty("PostJob"))).click();
		Thread.sleep(500);
		System.out.println("Job Title");
		Thread.sleep(500);

		dr.findElement(By.id("btnCustomJobTitle")).click();
		dr.findElement(By.id("txtJobTitle")).sendKeys("abcjj");
		System.out.println("Job Type");
		dr.findElement(By.cssSelector("#drpJobType > option:nth-child(2)")).click();
		System.out.println("Status");
		dr.findElement(By.cssSelector("#drpStatus > option:nth-child(3)")).click();
		System.out.println("Available Position(s)");
		dr.findElement(By.cssSelector("#AvailablePositions")).sendKeys("7");
		System.out.println("Duration");
		dr.findElement(By.cssSelector("#txtduration")).sendKeys("1");
		System.out.println("Job Announced on");
		dr.findElement(By.xpath(".//*[@id='txtJobAnnounced']")).click();
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER); // Press Enter
		robot.keyRelease(KeyEvent.VK_ENTER); // Release Enter

		System.out.println("-------------------------------------------");
		System.out.println("Job Closed by");
		dr.findElement(By.cssSelector("#txtJobClosed")).click();
		robot.keyPress(KeyEvent.VK_ENTER); // Press Enter
		robot.keyRelease(KeyEvent.VK_ENTER); // Release Enter

		System.out.println("-------------------------------------");
		System.out.println("Address");
		dr.findElement(By.cssSelector("#txtAddress1")).sendKeys("abc building");
		System.out.println("Country");
		dr.findElement(By.cssSelector("#drpcountry > option:nth-child(2)")).click();
		dr.findElement(By.cssSelector("#ZipCode")).sendKeys("12345");
		System.out.println("-----------------------------------");
		System.out.println("Negotiable:");
		dr.findElement(By.cssSelector("#chkNegotiable")).click();
		System.out.println("Bill Rate:");
		dr.findElement(By.cssSelector("#txtBillRate")).sendKeys("1500");
		System.out.println("Pay Rate:");
		// dr.findElement(By.cssSelector("")).sendKeys("");
		System.out.println("----------------------------------");
		System.out.println("Job Timing FROM");
		dr.findElement(By.cssSelector("#txtRequirementShiftTimingFrom > option:nth-child(7)")).click();
		System.out.println("Job Timing To");
		dr.findElement(By.cssSelector("#txtRequirementShiftTimingTo > option:nth-child(24)")).click();
		System.out.println("Hours per week");
		dr.findElement(By.cssSelector("#txtRequirementHoursPerWeek")).sendKeys("38");

		System.out.println(" Start Date");
		dr.findElement(By.id("txtInterviewStartDate")).sendKeys("07/31/2017");
		System.out.println("End Date ");
		dr.findElement(By.id("txtInterviewEndDate")).sendKeys("08/07/2017");

		System.out.println("YouTube URL");
		dr.findElement(By.cssSelector("#txtJDYouTubeURL")).sendKeys("https://youtu.be/rEqss9_W4Xs");
		System.out.println("You Tube url");
		dr.findElement(By.cssSelector("#txtMMYouTubeURL")).sendKeys("https://youtu.be/rEqss9_W4Xs");
		System.out.println("Search and Skill Keywords");
		dr.findElement(By.cssSelector("#txtSearchString")).sendKeys("urgent requirement");
		System.out.println("now click on save");
		Thread.sleep(5000);
		dr.findElement(By.cssSelector("#submitreq")).click();
	}
	*/
	@Test(priority = 8)
	public void Logout() throws Exception {

		Thread.sleep(7000);
		dr.findElement(By.xpath(OR.getProperty("EmpWelcomeProfile"))).click();
		Thread.sleep(4000);
		dr.findElement(By.linkText(OR.getProperty("logout"))).click();
		Thread.sleep(1000);
		dr.close();

	}
	/*public void ForgotPassword()
	{
		
	}*/
	
}

// test 4 & 5 remaing from propery file