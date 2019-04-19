package TSC.TSC_Framework_University;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class university_Login extends TestBase {
	@BeforeTest
	public void browser() throws Exception {
		init();
	    UniversityLogin();
		
	}

	@Test(priority = 1)
	public void universityLogin_MyAccount() throws Exception {

		Thread.sleep(500);
		dr.findElement(By.xpath(OR.getProperty("WelcomeProfile"))).click();
		Thread.sleep(1000);
		System.out.println("my account");
		dr.findElement(By.xpath("//*[@id='mainDiv']/div/div[1]/ul/li[4]/ul/li[1]/a")).click();
		Thread.sleep(5000);
		System.out.println("click on update");
		dr.findElement(By.xpath(OR.getProperty("UpdateButton"))).click();
//		dr.findElement(By.name("Back ")).click();
	}
}
