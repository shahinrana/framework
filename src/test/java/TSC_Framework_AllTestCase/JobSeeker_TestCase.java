package TSC_Framework_AllTestCase;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class JobSeeker_TestCase extends TestBase {
	@BeforeClass
	public void browser() throws Exception {
		init();
		JobseekerLogin();
	}
	@Test(priority=1)
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
	@Test(priority=2)
	public void SavesSearch() throws Exception
	{
		Thread.sleep(2000);
		dr.findElement(By.xpath(OR.getProperty("SavedSearch"))).click();
	}
	@Test(priority = 3)
	public void Myprofile() throws Exception {

		Thread.sleep(3000);
		System.out.println("login sucessfull");
		System.out.println("welcome farheen profile");
		dr.findElement(By.xpath(OR.getProperty("WelcomeProfile"))).click();
		// Thread.sleep(7000);
		dr.findElement(By.linkText(OR.getProperty("MyProfile"))).click();
	}
	@Test(priority = 4)
	public void JobSeekerBasicInforamtion() throws Exception {
		Thread.sleep(5000);
		System.out.println("welcome farheen profile");
		dr.findElement(By.xpath(OR.getProperty("WelcomeProfile"))).click();

		dr.findElement(By.linkText(OR.getProperty("MyProfile"))).click();
		System.out.println("My profile Bsic information page is open");
		// dr.findElement(By.cssSelector("#basictab >
		// a:nth-child(1)..")).click();
		Thread.sleep(5000);
		dr.findElement(By.xpath(OR.getProperty("UpdateButton"))).click();
		// dr.findElement(By.xpath("//*[@id='mainBG']/div[2]/div[1]/ul/li[4]/a")).click();
	}
	@Test(priority = 5)
	public void JobSeekerMyServiceProvider() throws Exception {
		Thread.sleep(2000);
		System.out.println("welcome farheen profile");
		dr.findElement(By.xpath(OR.getProperty("WelcomeProfile"))).click();
		Thread.sleep(500);
		dr.findElement(By.linkText(OR.getProperty("MyProfile"))).click();
		System.out.println("My Service Provider");
		dr.findElement(By.cssSelector(OR.getProperty("MyServiceProvider"))).click();
		Thread.sleep(500);
		// dr.findElement(By.cssSelector(".last > div:nth-child(2) >
		// input:nth-child(2)")).click();
		dr.findElement(By.xpath(OR.getProperty("Yes"))).click();
		dr.findElement(By.xpath(OR.getProperty("Yesdropdown"))).click();
		Thread.sleep(500);
		dr.findElement(By.xpath(OR.getProperty("YesSelectOpion"))).click();
		Thread.sleep(500);
		System.out.println("view & edit myResume");
		dr.findElement(By.xpath(OR.getProperty("View&EditMyResumeRadioButton"))).click();
		Thread.sleep(500);
		System.out.println("select NO for prefered contact person");
		dr.findElement(By.cssSelector(OR.getProperty("No"))).click();
		System.out.println(" Click On Update button");
		dr.findElement(By.xpath(OR.getProperty("UpdateButton"))).click();
	}

	@Test(priority=6)
	public void inviteee() throws InterruptedException {

		System.out.println("click on invitee");
		Thread.sleep(500);
		System.out.println("welcome farheen profile");
		dr.findElement(By.xpath(OR.getProperty("WelcomeProfile"))).click();
		Thread.sleep(3000);
		dr.findElement(By.linkText(OR.getProperty("invitee"))).click();
		Thread.sleep(5000);
	}
	
	
	@Test(priority=7)
	  public void Logout() throws Exception
	  {
	  		Thread.sleep(5000);
//	  		dr.findElement(By.xpath("//i[@class='fa fa-chevron-down']")).click();
	  		dr.findElement(By.xpath(OR.getProperty("WelcomeProfile"))).click();
	  	    Thread.sleep(3000);
	  	    dr.findElement(By.linkText(OR.getProperty("logout"))).click();  
	  	    dr.close();
	  }

}




























/*@Test(priority=5)
public void MyProfileEditUpdate() throws Exception
{
	System.out.println("Profile Edit");
    dr.findElement(By.xpath("//*[@id='menu']/div[3]")).click();
    
    Thread.sleep(3000);
    dr.findElement(By.xpath("//div[@class='row']/a[1]")).click();

    dr.findElement(By.xpath("//input[@id='btnFirst' and @value='Next']")).click();
    Thread.sleep(5000);
    

    Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);

	Thread.sleep(2000);
	dr.findElement(By.xpath("//input[@id='btnSecond' and @value='Next']")).click();
	Thread.sleep(5000);	
}*/