package TSC_Framework_Employer;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class Employeeothersearch extends TestBase {

	// WebDriver dr;
	@BeforeMethod
	public void browser() throws Exception {
		init();

	}

	@Test(priority = 1)
	public void EmpLoginandOtherSearch() throws Exception {
		System.out.println("This is login");
		dr.get("http://192.168.1.29/TSCNew/LandingPage/EmployersView");
		Thread.sleep(500);
		dr.get("http://192.168.1.29/TSCNew/EmployerOrServiceProv/Login");
		System.out.println("Again Click on Login Button && clear emailid & Password field ");
		Thread.sleep(3000);
		dr.findElement(By.cssSelector("#UserEmail")).clear();
		dr.findElement(By.cssSelector("#UserPassword")).clear();
		System.out.println("Email");
		dr.findElement(By.cssSelector("#UserEmail")).sendKeys("shahinrana@ranagam.com");
		System.out.println("Password");
		dr.findElement(By.cssSelector("#UserPassword")).sendKeys("123@Rana");
		System.out.println("click on Login");
		dr.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(500);
		dr.findElement(By.cssSelector("#search")).click();
		Thread.sleep(500);
		dr.findElement(By.cssSelector(".submenu1 > li:nth-child(2) > a:nth-child(1)")).click();
		dr.findElement(By.xpath("//*[@id='2']")).click();
		dr.findElement(By.xpath("//*[@id='kr_tag']")).sendKeys("");
		dr.findElement(By.xpath("//*[@id='ZipCode']")).sendKeys("12345");
		dr.findElement(By.xpath("//*[@id='drpWithInMiles']")).sendKeys("");
		dr.findElement(By.xpath("//*[@id='searchButton']")).click();

	}

}
