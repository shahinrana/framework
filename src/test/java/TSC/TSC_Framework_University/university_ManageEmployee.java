package TSC.TSC_Framework_University;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class university_ManageEmployee extends TestBase {
	@BeforeTest
	public void browser() throws Exception {
		init();
	}
	@Test
	public void ManageEmployee() throws Exception {
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
		dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[1]/ul/li[4]/ul/li[2]/a")).click();
		 System.out.println("Name");
		  dr.findElement(By.cssSelector("#txtCoachName")).sendKeys("h testing" );
		  System.out.println("Phone No");
		  dr.findElement(By.id("txtPhoneNumber")).sendKeys("9487878");
		  System.out.println("Occupation");
		  dr.findElement(By.id("txtOccupation")).sendKeys("Software Engineer");
		  System.out.println("Email");
		  dr.findElement(By.id("Email")).sendKeys("soft@rangam.com");
		  System.out.println("Branch");
		  dr.findElement(By.id("locationId")).click();
		 System.out.println("Submit");
		 

	}

}
