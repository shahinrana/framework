package TSC.TSC_Framework_University;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class university_ManageBranches extends TestBase
{
	@BeforeTest
	public void browser() throws Exception 
	{
		init();
	}

	@Test
	public void ManageBranches() throws Exception {
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
		System.out.println("welcome profile");
		dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[1]/ul/li[4]/a")).click();
		Thread.sleep(500);
		dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[1]/ul/li[4]/ul/li[3]/a")).click();
		System.out.println("Name");
		dr.findElement(By.xpath("//*[@id='txtbranchname']")).sendKeys("rangam ");
		System.out.println("Address");
		dr.findElement(By.xpath("//*[@id='txtbranchaddress']")).sendKeys("vaodara");
		System.out.println("Country");
		dr.findElement(By.xpath("//*[@id='drpcountry']/option[3]")).click();
	
		System.out.println("City");
		dr.findElement(By.xpath("//*[@id='txtbranchcityname']")).sendKeys("baroda");
		dr.findElement(By.xpath("//*[@id='txtbranchstate']")).sendKeys("gujarat");
		System.out.println("ZipCode");
		dr.findElement(By.xpath("//*[@id='txtnonusazipcode']")).sendKeys("390018");
		System.out.println("Email Address");
		dr.findElement(By.xpath("//*[@id='txtbranchemail']")).sendKeys("abs@a.com");
		System.out.println("Phone No");
		dr.findElement(By.xpath("//*[@id='txtphoneno']")).sendKeys("896131983164");
		System.out.println("Serving Area");
		dr.findElement(By.xpath("//*[@id='branchservi']")).sendKeys("r");
		
//		dr.findElement(By.xpath("//*[@id='btnAddContact']")).click();
		
		
		

	}
}