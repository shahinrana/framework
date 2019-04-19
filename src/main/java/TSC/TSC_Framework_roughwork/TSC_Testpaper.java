package TSC.TSC_Framework_roughwork;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TSC_Testpaper {
	public WebDriver dr;

	@BeforeTest
	public void init() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\resources\\geckodriver.exe");
		dr = new FirefoxDriver();
		dr.manage().window().maximize();
	}

	@Test
	public void ResumeEdit() throws Exception {
		System.out.println("This is login");
		dr.get("http://192.168.1.29/TSCNew/LandingPage/JobSeekerView");
		Thread.sleep(500);
		dr.get("http://192.168.1.29/TSCNew/JobSeeker/Login");
		System.out.println("Again Click on Login Button && clear emailid & Password field ");
		// dr.findElement(By.cssSelector(".login-area > div:nth-child(4) >
		// input:nth-child(1)")).click();
		Thread.sleep(5000);
		dr.findElement(By.xpath("//*[@id='UserEmail']")).clear();
		dr.findElement(By.cssSelector("#UserPassword")).clear();
		System.out.println("Email");
		dr.findElement(By.cssSelector("#UserEmail")).sendKeys("emailfarhin@gmail.com");
		System.out.println("Password");
		dr.findElement(By.cssSelector("#UserPassword")).sendKeys("123@Rana");
		System.out.println("click on Login");
		dr.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(5000);
		dr.findElement(By.xpath("//*[@id='menu']/div[3]/div/a/span[1]/strong")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//a[@class='loginBtn marTop5 boxRipple ripple-effect']")).click();
		Thread.sleep(2000);
	


		dr.findElement(By.xpath("//input[@id='btnFirst' and @value='Next']")).click();
		Thread.sleep(5000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	    Thread.sleep(5000);
//		dr.findElement(By.xpath("//*[@id='InstitutionName']")).sendKeys("Test");
	
	
	    dr.findElement(By.id("HighDegree")).clear();
		Thread.sleep(2000);
//		dr.findElement(By.xpath("//input[@class='loginBtn addExp marTop5 boxRipple ripple-effect' and @id='btnSecond']")).click();
		
		/*Actions action=new Actions(dr);
		action.sendKeys(Keys.ENTER).build().perform();*/
			
	}
	

}
