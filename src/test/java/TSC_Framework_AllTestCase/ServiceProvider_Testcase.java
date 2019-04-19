package TSC_Framework_AllTestCase;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class ServiceProvider_Testcase extends TestBase
{

	 @BeforeClass
	 public void browser() throws Exception
	 {   
	     System.out.println("Browser is ready to launching..");
	      init();
          serviceProviderLogin();
     }
	 @Test(priority=1)
	 public void ServiceProviderMyClientsAddMyClient() throws Exception
	 {

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
	 @Test(priority=2)
	 public void DashboardAndSearchJobSeeker() throws InterruptedException
	 {
	
		 Thread.sleep(5000); 
		 dr.findElement(By.id("dashboard")).click();
		 Thread.sleep(500);
		 System.out.println("search for jobseeker");
		 dr.findElement(By.xpath("//*[@id='search']")).click();	 
		 System.out.println("keyword");
		 dr.findElement(By.xpath("//*[@id='txtKeywords_tag']")).sendKeys("  computer operator");
		 System.out.println("city");
		 dr.findElement(By.xpath("//*[@id='City']")).sendKeys("New York");
		 System.out.println("state");
		 dr.findElement(By.xpath("//*[@id='State']")).sendKeys("Empire State");
		 dr.findElement(By.xpath("//*[@id='chkWithResume']")).click();
		 Thread.sleep(1000);
		 System.out.println("click on serchjobseeker submit");
		 dr.findElement(By.cssSelector(".homeSearch")).click();	
		 Thread.sleep(7000);
		 System.out.println("invite");
		 dr.findElement(By.cssSelector(".invitee")).click();
		 System.out.println("Name");
		 dr.findElement(By.cssSelector("#name")).sendKeys("shahin");
		 System.out.println("EmailAddress");
		 dr.findElement(By.cssSelector("#to")).sendKeys("shahinrana@rangam.com");
		 Thread.sleep(2000);
		 dr.navigate().back();

	 }
	 @Test(priority=3)
		public void ManageBranches() throws Exception {
			
		    Thread.sleep(3000);
			System.out.println("welcome profile");
			//dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[1]/ul/li[6]/a")).click();
			dr.findElement(By.xpath("//i[@class='fa fa-chevron-down']")).click();
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
			
		    Thread.sleep(10000);
		}
	 @Test(priority=4)
	 public void ServiceProviderManageEmployees() throws Exception
	 {
		
		 Thread.sleep(5000);
		 System.out.println("welcome profile");
		 dr.findElement(By.xpath("//i[@class='fa fa-chevron-down']")).click();
		 Thread.sleep(500);
		 dr.findElement(By.linkText("Manage Employees")).click();
	
	     System.out.println("Name");
	     dr.findElement(By.cssSelector("#txtCoachName")).sendKeys("shah himani k");
	     System.out.println("Phone No");
	     dr.findElement(By.id("JSContactNumber")).sendKeys("9409205611");
	     System.out.println("Occupation");
	     dr.findElement(By.id("txtOccupation")).sendKeys("Automation Engineer");
	     System.out.println("Email");
	     dr.findElement(By.id("Email")).sendKeys("shahinrana@rangam.com");
	     System.out.println("Branch");
	     dr.findElement(By.id("BranchServingArea")).click();
	     dr.findElement(By.xpath("//*[@id='BranchServingArea']/option[4]")).click();
	     System.out.println("Submit");  
	    Thread.sleep(10000);
	 }
	

		@Test(priority=5)
		public void ServiceProviderMyInvitee() throws InterruptedException {
		
			Thread.sleep(5000);
			System.out.println("welcome profile");
			dr.findElement(By.xpath("//i[@class='fa fa-chevron-down']")).click();
			Thread.sleep(500);
			dr.findElement(By.linkText("My Invitees")).click();
			Thread.sleep(9000);
		}
		@Test(priority=6)
		public void ServiceProviderOtherSearch() throws Exception {
			
			Thread.sleep(5000);
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
		    Thread.sleep(10000);

	     }
		@Test(priority=7)
		 public void ServiceProviderProfileUpdate() throws Exception
		 {
		
	     Thread.sleep(3000);
	     dr.findElement(By.xpath("//i[@class='fa fa-chevron-down']")).click();
	     Thread.sleep(500);
	     System.out.println("my account");
//	     dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[1]/ul/li[6]/ul/li[1]/a")).click();
	     dr.findElement(By.linkText("My Account")).click();
	     Thread.sleep(300);
	     System.out.println("click on update");
	     dr.findElement(By.xpath("//input[@value='Update']")).click();
	     Thread.sleep(5000);
		 }
		 
		@Test(priority=8)
		 public void Logout() throws Exception
		  {
		  	Thread.sleep(5000);
		  	dr.findElement(By.xpath("//i[@class='fa fa-chevron-down']")).click();
		  	Thread.sleep(3000);
		  	dr.findElement(By.linkText("Logout")).click();
		    dr.close();
	  		
		  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
