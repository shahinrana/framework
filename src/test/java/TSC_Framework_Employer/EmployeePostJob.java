package TSC_Framework_Employer;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class EmployeePostJob extends TestBase {
	// WebDriver dr;

	@BeforeMethod
	public void browser() throws Exception {
		init();
	}

	// employee profile edit update
	@Test(priority = 1)
	public void EmpprofilePostjob() throws Exception {

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
		System.out.println("now click on post job");
		dr.findElement(By.xpath("//*[@id='post']")).click();
		Thread.sleep(500);
		System.out.println("Job Title");
		Thread.sleep(500);
		dr.findElement(By.id("btnCustomJobTitle")).click();
		dr.findElement(By.id("txtJobTitle")).sendKeys("abcjj");
		System.out.println("Job Type");
		dr.findElement(By.cssSelector("#drpJobType > option:nth-child(2)")).click();
		System.out.println("Status");
		dr.findElement(By.cssSelector("#drpStatus > option:nth-child(3)")).click();
		System.out.println("Available Position(s)");
		dr.findElement(By.cssSelector("#AvailablePositions")).sendKeys("7");
		System.out.println("Duration");
		dr.findElement(By.cssSelector("#txtduration")).sendKeys("1");
		System.out.println("Job Announced on");
		dr.findElement(By.xpath(".//*[@id='txtJobAnnounced']")).click();
		Thread.sleep(5000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER); // Press Enter
		robot.keyRelease(KeyEvent.VK_ENTER); // Release Enter
		
		/*  Select years=new Select(dr.findElement(By.xpath(
		  ".//*[@id='ui-datepicker-div']/div/div/select[2]")));
		  years.selectByVisibleText("2019"); Thread.sleep(200);
		  
		  Select months=new Select(dr.findElement(By.xpath(
		  ".//*[@id='ui-datepicker-div']/div/div/select[1]")));
		  months.selectByVisibleText("Apr"); Thread.sleep(200);
		  
		  List<WebElement> dates = dr.findElements(By.xpath(
		  ".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a")); for(WebElement
		  date:dates) { 
			 // System.out.println(date.getText());
		  if(date.getText().equals("27")) 
		  { date.click(); 
		  
		  }*/
		  
		  
		 
		System.out.println("-------------------------------------------");
		System.out.println("Job Closed by");
		dr.findElement(By.cssSelector("#txtJobClosed")).click();
		robot.keyPress(KeyEvent.VK_ENTER); // Press Enter
		robot.keyRelease(KeyEvent.VK_ENTER); // Release Enter
		/*
		 * Select years1=new Select(dr.findElement(By.xpath(
		 * ".//*[@id='ui-datepicker-div']/div/div/select[2]")));
		 * years1.selectByVisibleText("2021"); Thread.sleep(2000);
		 * 
		 * Select months1=new Select(dr.findElement(By.xpath(
		 * ".//*[@id='ui-datepicker-div']/div/div/select[1]")));
		 * months1.selectByVisibleText("Apr"); Thread.sleep(2000);
		 * 
		 * List<WebElement> datesss = dr.findElements(By.xpath(
		 * ".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a")); for(WebElement
		 * date1:datesss) { WebElement date;
		 * System.out.println(date1.getText()); if(date1.getText().equals("27"))
		 * { date1.click(); }
		 * 
		 * }
		 */
		System.out.println("-------------------------------------");
		System.out.println("Address");
		dr.findElement(By.cssSelector("#txtAddress1")).sendKeys("abc building");
		System.out.println("Country");
		dr.findElement(By.cssSelector("#drpcountry > option:nth-child(2)")).click();
		/*
		 * System.out.println("City");
		 * dr.findElement(By.cssSelector("")).sendKeys("");
		 * System.out.println("State");
		 * dr.findElement(By.cssSelector("")).sendKeys(""); System.out.println(
		 * "Zip Code");
		 */
		dr.findElement(By.cssSelector("#ZipCode")).sendKeys("12345");
		System.out.println("-----------------------------------");
		System.out.println("Negotiable:");
		dr.findElement(By.cssSelector("#chkNegotiable")).click();
		System.out.println("Bill Rate:");
		dr.findElement(By.cssSelector("#txtBillRate")).sendKeys("1500");
		System.out.println("Pay Rate:");
		// dr.findElement(By.cssSelector("")).sendKeys("");
		System.out.println("----------------------------------");
		System.out.println("Job Timing FROM");
		dr.findElement(By.cssSelector("#txtRequirementShiftTimingFrom > option:nth-child(7)")).click();
		System.out.println("Job Timing To");
		dr.findElement(By.cssSelector("#txtRequirementShiftTimingTo > option:nth-child(24)")).click();
		System.out.println("Hours per week");
		dr.findElement(By.cssSelector("#txtRequirementHoursPerWeek")).sendKeys("38");

		System.out.println(" Start Date");
		dr.findElement(By.id("txtInterviewStartDate")).sendKeys("07/31/2017");
		/*
		 * try{ List<WebElement> calenders=
		 * dr.findElements(By.xpath("//*[@id='txtJobAnnounced']"));
		 * for(WebElement e: calenders) {
		 * System.out.println("calender"+calenders.size()); System.out.println(
		 * "element name"+e.getTagName()); }} catch(Exception e) {
		 * System.out.println(e.getMessage()); }
		 */

		System.out.println("End Date ");
		dr.findElement(By.id("txtInterviewEndDate")).sendKeys("08/07/2017");

		System.out.println("YouTube URL");
		dr.findElement(By.cssSelector("#txtJDYouTubeURL")).sendKeys("https://youtu.be/rEqss9_W4Xs");
		System.out.println("You Tube url");
		dr.findElement(By.cssSelector("#txtMMYouTubeURL")).sendKeys("https://youtu.be/rEqss9_W4Xs");
		System.out.println("Search and Skill Keywords");
		dr.findElement(By.cssSelector("#txtSearchString")).sendKeys("urgent requirement");
		System.out.println("now click on save");
		Thread.sleep(5000);
		 dr.findElement(By.cssSelector("#submitreq")).click();

	}
}
