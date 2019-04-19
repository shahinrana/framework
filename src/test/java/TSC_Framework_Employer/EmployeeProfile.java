package TSC_Framework_Employer;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class EmployeeProfile extends TestBase {

	// WebDriver dr;
	@BeforeMethod
	public void browser() throws Exception {
		init();
	}

	// employee profile edit update
	@Test(priority = 1)
	public void EmpprofileEditUpdate() throws Exception {
		System.out.println("This is login");
		dr.get("http://192.168.1.29/TSCNew/LandingPage/EmployersView");
		Thread.sleep(500);
		dr.get("http://192.168.1.29/TSCNew/EmployerOrServiceProv/Login");
		System.out.println("Again Click on Login Button && clear emailid & Password field ");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@value='Log in']")).click();
		dr.findElement(By.cssSelector("#UserEmail")).clear();
		dr.findElement(By.cssSelector("#UserPassword")).clear();
		System.out.println("Email");
		dr.findElement(By.cssSelector("#UserEmail")).sendKeys("shahinrana@ranagam.com");
		System.out.println("Password");
		dr.findElement(By.cssSelector("#UserPassword")).sendKeys("123@Rana");
		System.out.println("click on Login");
		dr.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println("now click on dashboard");
		dr.findElement(By.cssSelector("#dashboard")).click();
		Thread.sleep(100);
		dr.findElement(By.xpath("//*[@id='frmDashboard']/div[1]/div[2]/div[2]/div[1]/div/a/span[1]/strong")).click();
		Thread.sleep(100);
		dr.findElement(By.xpath("//*[@id='frmDashboard']/div[1]/div[2]/div[2]/div[2]/div/a/span[1]/strong")).click();
		Thread.sleep(100);
		dr.findElement(By.xpath("//*[@id='frmDashboard']/div[1]/div[2]/div[2]/div[3]/div/a/span[1]/strong")).click();
		Thread.sleep(100);
		dr.findElement(By.xpath("//*[@id='frmDashboard']/div[1]/div[2]/div[2]/div[4]/div/a/span[1]/strong")).click();
		Thread.sleep(5000);
	
	}

}
