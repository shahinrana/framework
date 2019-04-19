package TSC_Framework_Employer;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class employeeLoginwithvaldn {

	public class EmployeeLogin extends TestBase {

		// WebDriver dr;
		@BeforeTest
		public void browser() throws Exception {
			init();
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * "C:\\Users\\shahinrana\\workspace\\TSC\\resource\\chromedriver.exe"
			 * ); dr=new ChromeDriver(); dr.get("http://192.168.1.29/TSCNew");
			 */

		}

		@Test(priority = 1)
		public void EmpLoginWithValidIdAndPassword() throws Exception {
			System.out.println("This is login");
			dr.get("http://192.168.1.29/TSCNew/LandingPage/EmployersView");
			Thread.sleep(500);
			dr.get("http://192.168.1.29/TSCNew/EmployerOrServiceProv/Login");
			System.out.println("Again Click on Login Button && clear emailid & Password field ");
			dr.findElement(By.xpath("//input[@value='Log in']")).click();
			Thread.sleep(1000);
			dr.findElement(By.cssSelector("#UserEmail")).clear();
			dr.findElement(By.cssSelector("#UserPassword")).clear();
			System.out.println("Email");
			dr.findElement(By.cssSelector("#UserEmail")).sendKeys("shahinrana@ranagam.com");
			System.out.println("Password");
			dr.findElement(By.cssSelector("#UserPassword")).sendKeys("123@Rana");
			
			Thread.sleep(5000);
			System.out.println("click on Login");
			dr.findElement(By.xpath("//input[@value='Log in']")).click();
		}

		@Test(priority = 2)
		public void EmpLoginWithEmailFieldBlank() throws Exception {
			System.out.println("This is login");
			dr.get("http://192.168.1.29/TSCNew/LandingPage/EmployersView");
			Thread.sleep(500);
			dr.get("http://192.168.1.29/TSCNew/EmployerOrServiceProv/Login");
			System.out.println("Again Click on Login Button && clear emailid & Password field ");
			dr.findElement(By.xpath("//input[@value='Log in']")).click();
			Thread.sleep(1000);
			dr.findElement(By.cssSelector("#UserEmail")).clear();
			dr.findElement(By.cssSelector("#UserPassword")).clear();
			System.out.println("Email");
			dr.findElement(By.cssSelector("#UserEmail")).sendKeys("");
			System.out.println("Password");
			dr.findElement(By.cssSelector("#UserPassword")).sendKeys("123@Rana");
			System.out.println("click on Login");
			dr.findElement(By.xpath("//input[@value='Log in']")).click();
			Thread.sleep(5000);

		}

		@Test(priority = 3)
		public void EmpLoginWithPasswordFieldBlank() throws Exception {
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
			dr.findElement(By.cssSelector("#UserEmail")).sendKeys("shahinrana@ranagam.com");
			System.out.println("Password");
			dr.findElement(By.cssSelector("#UserPassword")).sendKeys("");
			System.out.println("click on Login");
			dr.findElement(By.xpath("//input[@value='Log in']")).click();

		}

		@Test(priority = 4)
		public void EmpLoginWithInvalidIdAndPassword() throws Exception {
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
			dr.findElement(By.cssSelector("#UserEmail")).sendKeys("shahina@ranam.com");
			System.out.println("Password");
			dr.findElement(By.cssSelector("#UserPassword")).sendKeys("13@Rna");
			System.out.println("click on Login");
			dr.findElement(By.xpath("//input[@value='Log in']")).click();
		}

	}

}
