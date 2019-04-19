package TSC.TSC_Framework_ServiceProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class serviceproviderMyInvitee extends TestBase {
	// WebDriver dr;
	@BeforeMethod
	public void browser() throws Exception {
		init();
	}

	@Test
	public void ServiceProviderMyInvitee() throws InterruptedException {
		System.out.println("This is login");
		dr.get("http://192.168.1.29/TSCNew/LandingPage/EmployersView");
		Thread.sleep(500);
		dr.get("http://192.168.1.29/TSCNew/EmployerOrServiceProv/Login");
		System.out.println("Again Click on Login Button && clear emailid & Password field ");
		dr.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(3000);
		dr.findElement(By.cssSelector("#UserEmail")).clear();
		dr.findElement(By.cssSelector("#UserPassword")).clear();
		System.out.println("Email");
		dr.findElement(By.cssSelector("#UserEmail")).sendKeys("sameer@yahoo.com");
		System.out.println("Password");
		dr.findElement(By.cssSelector("#UserPassword")).sendKeys("123@Rana");
		System.out.println("click on Login");
		dr.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(200);
		System.out.println("welcome profile");
		dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[1]/ul/li[6]/a")).click();
		Thread.sleep(500);
		dr.findElement(By.linkText("My Invitees")).click();
//		Thread.sleep(5000);
	}

}