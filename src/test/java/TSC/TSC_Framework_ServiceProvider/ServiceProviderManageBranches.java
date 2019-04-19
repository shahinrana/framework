package TSC.TSC_Framework_ServiceProvider;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class ServiceProviderManageBranches extends TestBase {
	// WebDriver dr;
	@BeforeMethod
	public void browser() throws Exception {
		init();
	}

	@Test
	public void ManageBranches() throws Exception {
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
		Thread.sleep(500);
		System.out.println("welcome profile");
		dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[1]/ul/li[6]/a")).click();
		Thread.sleep(500);
		dr.findElement(By.linkText("Manage Branches")).click();
		System.out.println("Name");
		dr.findElement(By.xpath("//*[@id='txtbranchname']")).sendKeys("software testing");
		System.out.println("Address");
		dr.findElement(By.id("txtbranchaddress")).sendKeys("vadodara");
		System.out.println("Country");
		dr.findElement(By.xpath("//*[@id='BranchCountryId']/option[251]")).click();
		System.out.println("City");
		dr.findElement(By.xpath("//*[@id='txtbranchcityname']")).sendKeys("vadodara");
		System.out.println("State");
		dr.findElement(By.cssSelector("#txtbranchstate")).sendKeys("gujarat");
		System.out.println("ZipCode");
		dr.findElement(By.cssSelector("#txtnonusazipcode")).sendKeys("391005");
		System.out.println("Email Address");
		dr.findElement(By.cssSelector("#txtbranchemail")).sendKeys("sameer@rangam.com");
		System.out.println("Phone No");
		dr.findElement(By.cssSelector("#txtphoneno")).sendKeys("36496463");
		System.out.println("Serving Area");
		dr.findElement(By.cssSelector("#branchservi > option:nth-child(2)")).click();
//	    Thread.sleep(5000);
	}

}
