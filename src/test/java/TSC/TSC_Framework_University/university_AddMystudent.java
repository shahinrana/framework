package TSC.TSC_Framework_University;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class university_AddMystudent extends TestBase
{
	@BeforeTest
	public void browser() throws Exception {
		init();
	}

	@Test(priority = 1)
	public void universityAddMyStudnt() throws Exception {
	
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
		dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[1]/ul/li[4]/a")).click();
		Thread.sleep(500);
		dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[1]/ul/li[4]/ul/li[4]/a")).click();
		System.out.println("First Name");
	     dr.findElement(By.id("FirstName")).sendKeys("siddharth");
	     System.out.println("Middle Name");
	     dr.findElement(By.id("MiddleName")).sendKeys("s");
	     System.out.println("Last Name");
	     dr.findElement(By.id("LastName")).sendKeys("mane");
	     System.out.println("Email");
	     dr.findElement(By.id("Email")).sendKeys("siddarth@gmail.com");
	     System.out.println("Address");
	     dr.findElement(By.id("Address1")).sendKeys("ahcd");
	     System.out.println("Select Country");
	     dr.findElement(By.xpath("//*[@id='drpcountry']/option[43]")).click();;
	     System.out.println("City");
	     dr.findElement(By.id("txtbranchcityname")).sendKeys("vanchuer");
	     System.out.println("State");
	     dr.findElement(By.cssSelector("#txtbranchstate")).sendKeys("canada");
	     System.out.println("Zipcode");
	     dr.findElement(By.cssSelector("#txtnonusazipcode")).sendKeys("34313");
	     System.out.println("Phone No");
	     dr.findElement(By.cssSelector("#JobSeekerContactNum")).sendKeys("9624082988");
	     dr.findElement(By.xpath("//*[@id='drpContactType']/option[4]")).click();
//	     dr.findElement(By.id("btnRegister")).click();
     dr.findElement(By.xpath("//input[@value='Clear']")).click();
		
}
}
