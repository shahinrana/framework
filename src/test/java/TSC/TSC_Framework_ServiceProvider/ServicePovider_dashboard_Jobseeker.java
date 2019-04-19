package TSC.TSC_Framework_ServiceProvider;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class ServicePovider_dashboard_Jobseeker  extends TestBase
{
	@BeforeClass
	public void login() throws Exception
	{
		init();
		serviceProviderLogin();
	}
	@Test
	public void ServiceProvider_JobSeeker_Share() throws Exception
	{
		
		dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[2]/div[2]/div[1]/div/a")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[2]/div[2]/div[1]/div/a/h4")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[2]/div[2]/div[2]/div/a/span[1]/strong")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@id='search']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@id='Grid']/div/div[1]/div/div/a")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@id='frmCandiddateDEtails']/div[1]/div[2]/div[4]/div/a[1]")).click();
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//*[@id='shareResume']/div/div/div[1]/div[2]/ul/li/input")).sendKeys("abc@yahoo.com");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id='FirstName']")).clear();
		dr.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("shahin rana");
		
		
//		dr.findElement(By.xpath("//input[@id='btnShare']")).click();
	}
	
	
}
