package TSC_Framework_AllTestCase;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class University_TestCase extends TestBase {

	@BeforeClass
	public void browser() throws Exception {
		init();
		UniversityLogin();
	}

	@Test(priority = 1)
	public void university_jobSearch() throws Exception {

		Thread.sleep(5000);
		dr.findElement(By.xpath("//*[@id='jobsearch']")).click();
		Thread.sleep(1000);
		dr.findElement(By.cssSelector("#txtKeywords_tagsinput")).sendKeys("Account Representative");
		Thread.sleep(1000);
		dr.findElement(By.id("txtZip")).sendKeys("10001");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id='drpWithInMiles']/option[7]")).click();
		Thread.sleep(1000);
		dr.findElement(By.id("searchButton")).click();

	}

	@Test(priority = 2)
	public void university_OtherSearch() throws Exception {

		Thread.sleep(5000);
		// dr.findElement(By.xpath("//*[@id='jobsearch']")).click();
		dr.findElement(By.linkText("Other Search")).click();
		Thread.sleep(1000);
		// dr.findElement(By.id("ZipCode")).sendKeys("12345");
		Thread.sleep(1000);
		// dr.findElement(By.xpath("//*[@id='drpWithInMiles']/option[7]")).click();
		Thread.sleep(1000);
		dr.findElement(By.id("searchButton")).click();

	}

	@Test(priority = 3)
	public void ManageBranches() throws Exception {
		Thread.sleep(3000);
		System.out.println("welcome profile");
		dr.findElement(By.xpath("//i[@class='fa fa-chevron-down']")).click();
		Thread.sleep(500);
		// dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[1]/ul/li[4]/ul/li[3]/a")).click();
		dr.findElement(By.linkText("Manage Branches")).click();
		System.out.println("Name");
		dr.findElement(By.xpath("//*[@id='txtbranchname']")).sendKeys("rangam ");
		System.out.println("Address");
		dr.findElement(By.xpath("//*[@id='txtbranchaddress']")).sendKeys("vaodara");
		System.out.println("Country");
		dr.findElement(By.xpath("//*[@id='drpcountry']/option[3]")).click();

		System.out.println("City");
		dr.findElement(By.xpath("//*[@id='txtbranchcityname']")).sendKeys("baroda");
		dr.findElement(By.xpath("//*[@id='txtbranchstate']")).sendKeys("gujarat");
		System.out.println("ZipCode");
		dr.findElement(By.xpath("//*[@id='txtnonusazipcode']")).sendKeys("390018");
		System.out.println("Email Address");
		dr.findElement(By.xpath("//*[@id='txtbranchemail']")).sendKeys("abs@a.com");
		System.out.println("Phone No");
		dr.findElement(By.xpath("//*[@id='txtphoneno']")).sendKeys("896131983164");
		System.out.println("Serving Area");
		dr.findElement(By.xpath("//*[@id='branchservi']")).sendKeys("r");

		dr.findElement(By.xpath("//*[@id='btnAddContact']")).click();
		Thread.sleep(7000);
	}

	@Test(priority = 4)
	public void ManageEmployee() throws Exception {

		System.out.println("welcome profile");
		dr.findElement(By.xpath("//i[@class='fa fa-chevron-down']")).click();
		Thread.sleep(500);
		dr.findElement(By.linkText("Manage Employees")).click();
		// dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[1]/ul/li[4]/ul/li[2]/a")).click();
		System.out.println("Name");
		dr.findElement(By.cssSelector("#txtCoachName")).sendKeys("h testing");
		System.out.println("Phone No");
		dr.findElement(By.id("txtPhoneNumber")).sendKeys("9487878");
		System.out.println("Occupation");
		dr.findElement(By.id("txtOccupation")).sendKeys("Software Engineer");
		System.out.println("Email");
		dr.findElement(By.id("Email")).sendKeys("soft@rangam.com");
		System.out.println("Branch");
		// dr.findElement(By.id("locationId")).click();
		dr.findElement(By.xpath("//*[@id='locationId']/option[2]")).click();
		System.out.println("Submit");
		dr.findElement(By.xpath("//*[@id='btnAddContact']")).click();
		Thread.sleep(5000);

	}

	@Test(priority = 5)
	public void universityAddMyStudnt() throws Exception {

		dr.findElement(By.xpath("//i[@class='fa fa-chevron-down']")).click();
		Thread.sleep(500);
		dr.findElement(By.linkText("Add My Student")).click();
		// dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[1]/ul/li[4]/ul/li[4]/a")).click();
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
		dr.findElement(By.xpath("//*[@id='drpcountry']/option[43]")).click();
		;
		System.out.println("City");
		dr.findElement(By.id("txtbranchcityname")).sendKeys("vanchuer");
		System.out.println("State");
		dr.findElement(By.cssSelector("#txtbranchstate")).sendKeys("canada");
		System.out.println("Zipcode");
		dr.findElement(By.cssSelector("#txtnonusazipcode")).sendKeys("34313");
		System.out.println("Phone No");
		dr.findElement(By.cssSelector("#JobSeekerContactNum")).sendKeys("9624082988");
		dr.findElement(By.xpath("//*[@id='drpContactType']/option[4]")).click();
		// dr.findElement(By.id("btnRegister")).click();
		dr.findElement(By.xpath("//input[@value='Clear']")).click();
		Thread.sleep(5000);
	}

	@Test(priority = 6)
	public void Logout() throws Exception {
		Thread.sleep(5000);
		dr.findElement(By.xpath("//i[@class='fa fa-chevron-down']")).click();
		Thread.sleep(3000);
		dr.findElement(By.linkText("Logout")).click();
		dr.close();

	}
}
