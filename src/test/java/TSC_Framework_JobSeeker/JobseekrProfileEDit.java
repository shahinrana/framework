package TSC_Framework_JobSeeker;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class JobseekrProfileEDit extends TestBase
{
	@BeforeClass
	public void login() throws Exception
	{
		init();
		JobseekerLogin();
	}
	@Test
	public void ProfileEDit() throws Exception
	{
		System.out.println("Profile Edit");
	    dr.findElement(By.xpath("//*[@id='menu']/div[3]")).click();
	    
	    Thread.sleep(3000);
	    dr.findElement(By.xpath("//div[@class='row']/a[1]")).click();

	    dr.findElement(By.xpath("//input[@id='btnFirst' and @value='Next']")).click();
	    Thread.sleep(5000);
	    

	    Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@id='btnSecond' and @value='Next']")).click();
		Thread.sleep(5000);
		
		
		
		
		
		
		
//		dr.findElement(By.xpath("//input[@id='btnAddJSExp']")).click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
