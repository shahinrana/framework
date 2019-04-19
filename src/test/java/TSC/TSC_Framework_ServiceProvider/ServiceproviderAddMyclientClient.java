package TSC.TSC_Framework_ServiceProvider;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;



public class ServiceproviderAddMyclientClient extends TestBase
{
	 @BeforeMethod
	 public void browser() throws Exception
	 {   
	     System.out.println("Browser is ready to launching..");
	      init();

      }
	 @Test
	 public void ServiceProviderMyClientsAddMyClient() throws Exception
	 {
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
		 Thread.sleep(1000);
	     System.out.println("click on my client");
	     dr.findElement(By.xpath("//*[@id='myclients']")).click();
	     dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[1]/ul/li[6]/a")).click();
	     Thread.sleep(500);
	     dr.findElement(By.linkText("Add My Client")).click();
	     System.out.println("First Name");
	     dr.findElement(By.cssSelector("#FirstName")).sendKeys("sakir");
	     System.out.println("Middle Name");
	     dr.findElement(By.cssSelector("#MiddleName")).sendKeys("s");
	     System.out.println("Last Name");
	     dr.findElement(By.cssSelector("#LastName")).sendKeys("rana");
	     System.out.println("Email");
	     dr.findElement(By.cssSelector("#Email")).sendKeys("emailsakir@gmail.com");
	     System.out.println("Address");
	     dr.findElement(By.cssSelector("#Address1")).sendKeys("vadodara");
	     System.out.println("Select Country");
	     dr.findElement(By.cssSelector("#drpcountry > option:nth-child(3)")).click();;
	     System.out.println("City");
	     dr.findElement(By.cssSelector("#txtbranchcityname")).sendKeys("vadodara");
	     System.out.println("State");
	     dr.findElement(By.cssSelector("#txtbranchstate")).sendKeys("gujarat");
	     System.out.println("Zipcode");
	     dr.findElement(By.cssSelector("#txtnonusazipcode")).sendKeys("390002");
	     System.out.println("Phone No");
	     dr.findElement(By.cssSelector("#JobSeekerContactNum")).sendKeys("9624082988");
	     dr.findElement(By.cssSelector("#drpContactType > option:nth-child(2)")).click();
	     dr.findElement(By.xpath("//input[@value='Clear']")).click();
//	     Thread.sleep(7000);
     
	 }
	 
	
	
	
	
	
	
	
	
	
}
