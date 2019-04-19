package TSC.TSC_Framework_University;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class university_Reg extends TestBase {
	@BeforeTest
	public void browser() throws Exception {
		init();
	}

	@Test
	public void universityRegistration() throws Exception {
		dr.get("http://192.168.1.29/TSCNew/LandingPage/University");
		Thread.sleep(200);
		dr.get("http://192.168.1.29/TSCNew/University/Register");
		System.out.println("FirstName");
		dr.findElement(By.cssSelector("#FirstName")).sendKeys("twinkle");
		System.out.println("MiddleName");
		dr.findElement(By.cssSelector("#MiddleName")).sendKeys("v");
		System.out.println("LastName");
		dr.findElement(By.cssSelector("#LastName")).sendKeys("patel");
		System.out.println("BusinessEmailAddress");
		dr.findElement(By.cssSelector("#Email")).sendKeys("twinkle@patel.edu");
		System.out.println("Password");
		dr.findElement(By.cssSelector("#Password")).sendKeys("123@Rana");
		System.out.println("Organization");
		dr.findElement(By.cssSelector("#ClientName")).sendKeys("rangam");
		System.out.println("About Organization");
		dr.findElement(By.cssSelector("#AboutCompany")).sendKeys("this is a best recruting consultant");
		System.out.println("Website");
		dr.findElement(By.cssSelector("#CompanyUrl")).sendKeys("www.ripl.com");
		System.out.println("Address");
		dr.findElement(By.cssSelector("#Address1")).sendKeys("abc lane");
		System.out.println("Country");
		dr.findElement(By.cssSelector("#drpcountry > option:nth-child(15)")).click();
		System.out.println("City");
		dr.findElement(By.cssSelector("#txtbranchcityname")).sendKeys("xyz");
		System.out.println("State");
		dr.findElement(By.cssSelector("#txtbranchstate")).sendKeys("ABC");
		System.out.println("Zipcode");
		dr.findElement(By.cssSelector("#txtnonusazipcode")).sendKeys("001");
		System.out.println("Phone No");
		dr.findElement(By.cssSelector("#ContactNum")).sendKeys("7383154999");
		System.out.println("select contact type");
		dr.findElement(By.cssSelector("#drpContactType > option:nth-child(2)")).click();

		System.out.println("Authorized Officer");
		dr.findElement(By.cssSelector("#AuthorizedOfficer")).sendKeys("hr admin");
		System.out.println("Daily Contact");
		dr.findElement(By.cssSelector("#DailyContactPerson")).sendKeys("twinkle");
		System.out.println("LinkedIn Profile");
		dr.findElement(By.cssSelector("#LinkedInProfileUrl")).sendKeys("");
		System.out.println("checkbox");
dr.close();
	}

}
