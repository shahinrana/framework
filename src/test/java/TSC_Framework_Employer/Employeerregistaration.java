package TSC_Framework_Employer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class Employeerregistaration extends TestBase
{
    @BeforeMethod
     public void browser() throws Exception
	{
    	init();
	}
    @Test(priority=1)
    public void EmpRegister() throws Exception
    {
    	  System.out.println("This is login");
          dr.get("http://192.168.1.29/TSCNew/LandingPage/EmployersView");
	      System.out.println("Click on Register");
	      dr.findElement(By.cssSelector("a.bttnEmployeer:nth-child(2)")).click();
	      System.out.println("select field Are You");
	      System.out.println("select Employee");
	      dr.findElement(By.cssSelector("#drpAreYou > option:nth-child(2)")).click();
	      System.out.println("FirstName");
	      dr.findElement(By.cssSelector("#FirstName")).sendKeys("shahin");
	      System.out.println("MiddleName");
	      dr.findElement(By.cssSelector("#MiddleName")).sendKeys("");
	      System.out.println("LastName");
	      dr.findElement(By.cssSelector("#LastName")).sendKeys("rana");
	      System.out.println("BusinessEmailAddress");
	      dr.findElement(By.cssSelector("#Email")).sendKeys("shahinrana@rangam.com");
	      System.out.println("Password");
	      dr.findElement(By.cssSelector("#Password")).sendKeys("123@Rana");;
	   //abc@rangam.com
	      System.out.println("Organization");
	      dr.findElement(By.cssSelector("#ClientName")).sendKeys("ripl");
	      System.out.println("About Organization");
	      dr.findElement(By.cssSelector("#AboutCompany")).sendKeys("this is a best recruting ");
	      System.out.println("Website");
	      dr.findElement(By.cssSelector("#CompanyUrl")).sendKeys("www.rangam.com");
	      System.out.println("Address");
	      dr.findElement(By.cssSelector("#Address1")).sendKeys("us");
	      System.out.println("Country");
	      dr.findElement(By.cssSelector("#drpcountry > option:nth-child(01)")).click(); 
	      System.out.println("Zipcode");
	      dr.findElement(By.cssSelector("#txtnonusazipcode")).sendKeys("12345");
	      System.out.println("Phone No");
	      dr.findElement(By.cssSelector("#ContactNum")).sendKeys("7383154999"); 
	      dr.findElement(By.cssSelector("#drpcountry > option:nth-child(2)")).click(); 
	      System.out.println("checkbox");
	      dr.findElement(By.cssSelector(".marRight12")).isSelected();  //marRight12 designLbl
	  	 Thread.sleep(5000);
	  	  dr.close();
    }
}