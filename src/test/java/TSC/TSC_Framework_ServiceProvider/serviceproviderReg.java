package TSC.TSC_Framework_ServiceProvider;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class serviceproviderReg extends TestBase
{
	 @BeforeTest
	 public void browser() throws Exception
	 { 
		 init();
     }
	@Test
	  public void ServiceProviderRegistration() throws Exception
	  {
		  System.out.println("Click on ServiceProvider");
		  dr.get("http://192.168.1.29/TSCNew/LandingPage/EmployersView");
	      System.out.println("Click on Register");
		  dr.findElement(By.cssSelector("a.bttnEmployeer:nth-child(2)")).click();
		  System.out.println("select field Are You");
	      System.out.println("select service provider");
	      dr.findElement(By.cssSelector("#drpAreYou > option:nth-child(3)")).click();
	      System.out.println("FirstName");
	      dr.findElement(By.cssSelector("#FirstName")).sendKeys("sameer");
	      System.out.println("MiddleName");
	      dr.findElement(By.cssSelector("#MiddleName")).sendKeys("m");
	      System.out.println("LastName");
	      dr.findElement(By.cssSelector("#LastName")).sendKeys("Rana");
	      System.out.println("BusinessEmailAddress");
	      dr.findElement(By.cssSelector("#Email")).sendKeys("same5er@yahoo.com");
	      System.out.println("Password");
	      dr.findElement(By.cssSelector("#Password")).sendKeys("123@Rana");
	      System.out.println("Organization");
	      dr.findElement(By.cssSelector("#ClientName")).sendKeys("rangam");
	      System.out.println("About Organization");
	      dr.findElement(By.cssSelector("#AboutCompany")).sendKeys("this is a best recruting consultant");
	      System.out.println("Website");
	      dr.findElement(By.cssSelector("#CompanyUrl")).sendKeys("www.ripl.com");
	      System.out.println("Address");
	      dr.findElement(By.cssSelector("#Address1")).sendKeys("vasna road");
	      System.out.println("Country");
	      dr.findElement(By.cssSelector("#drpcountry > option:nth-child(3)")).click(); 
	      System.out.println("City");
	      dr.findElement(By.cssSelector("#txtbranchcityname")).sendKeys("vadodara");
	      System.out.println("State");
	      dr.findElement(By.cssSelector("#txtbranchstate")).sendKeys("gujarat"); 
	      System.out.println("Zipcode");
	      dr.findElement(By.cssSelector("#txtnonusazipcode")).sendKeys("001");
	      System.out.println("Phone No");
	      dr.findElement(By.cssSelector("#ContactNum")).sendKeys("7383154999");
	      System.out.println("select contact type");
	      dr.findElement(By.cssSelector("#drpContactType > option:nth-child(2)")).click();
	      
	      System.out.println("Authorized Officer");
	      dr.findElement(By.cssSelector("#AuthorizedOfficer")).sendKeys("hr department"); 
	      System.out.println("Daily Contact");
	      dr.findElement(By.cssSelector("#DailyContactPerson")).sendKeys("dipali");
	      System.out.println("LinkedIn Profile");
	      dr.findElement(By.cssSelector("#LinkedInProfileUrl")).sendKeys("dipali"); 
	      System.out.println("checkbox");     
//	      Thread.sleep(5000);
	      dr.close();
	    }
	
	
}
