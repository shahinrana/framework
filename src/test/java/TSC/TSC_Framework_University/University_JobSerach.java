package TSC.TSC_Framework_University;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class University_JobSerach extends TestBase {
	@BeforeTest
	public void browser() throws Exception {
		init();
	}

	@Test(priority = 1)
	public void university_jobSearch() throws Exception {
		dr.get("http://192.168.1.29/TSCNew/LandingPage/University");
		Thread.sleep(200);
		dr.get("http://192.168.1.29/TSCNew/University/Login");
		System.out.println("Again Click on Login Button && clear emailid & Password field ");
		dr.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(300);
		dr.findElement(By.cssSelector("#UserEmail")).clear();
		dr.findElement(By.cssSelector("#UserPassword")).clear();
		System.out.println("Email");
		dr.findElement(By.cssSelector("#UserEmail")).sendKeys("twinkle@patel.edu");
		System.out.println("Password");
		dr.findElement(By.cssSelector("#UserPassword")).sendKeys("123@Rana");
		Thread.sleep(2000);
		System.out.println("click on Login");
		dr.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(500);
		dr.findElement(By.xpath("//*[@id='jobsearch']")).click();
		Thread.sleep(1000);
		dr.findElement(By.cssSelector("#txtKeywords_tagsinput")).sendKeys("Account Representative");
		Thread.sleep(1000);
		dr.findElement(By.id("txtZip")).sendKeys("10001");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id='drpWithInMiles']/option[7]")).click();
		Thread.sleep(1000);
		dr.findElement(By.id("searchButton")).click();
		
		
}
}