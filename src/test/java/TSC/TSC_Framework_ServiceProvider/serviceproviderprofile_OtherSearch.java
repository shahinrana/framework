package TSC.TSC_Framework_ServiceProvider;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;


public class serviceproviderprofile_OtherSearch extends TestBase
{
	@BeforeMethod
	public void browser() throws Exception {
		init();
	}

	@Test(priority = 1)
	public void ServiceProviderOtherSearch() throws Exception {
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
		System.out.println("click on serach");
		dr.findElement(By.cssSelector("#other_search")).click();
		Thread.sleep(500);
		dr.findElement(By.cssSelector(".submenu1 > li:nth-child(2) > a:nth-child(1)")).click();
		System.out.println("click on search by service provider");
		dr.findElement(By.xpath("//*[@id='3']")).isSelected();
		dr.findElement(By.xpath("//*[@id='kr_tag']")).sendKeys("Rangam");
		dr.findElement(By.xpath("//*[@id='ZipCode']")).sendKeys("12345");
		dr.findElement(By.xpath("//*[@id='drpWithInMiles']")).sendKeys("5");
		dr.findElement(By.xpath("//*[@id='searchButton']")).click();
	Thread.sleep(5000);

     }
	@Test(priority=2)
	 public void ServiceProviderProfileUpdate() throws Exception
	 {System.out.println("This is login");
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
    dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[1]/ul/li[6]/a")).click();
     Thread.sleep(500);
     System.out.println("my account");
     dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[1]/ul/li[6]/ul/li[1]/a")).click();
     Thread.sleep(300);
     System.out.println("click on update");
     dr.findElement(By.xpath("//input[@value='Update']")).click();
//     Thread.sleep(5000);
	 }
	 
}