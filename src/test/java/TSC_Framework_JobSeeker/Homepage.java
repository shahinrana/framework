package TSC_Framework_JobSeeker;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;



public class Homepage extends TestBase
{
	@Test
	public void homepage() throws Exception
	{
		init();
		dr.get("http://192.168.1.29/TSCNew/");
		dr.findElement(By.cssSelector("#carousel-selector-0")).click();
		Thread.sleep(5000);
		dr.findElement(By.cssSelector("#carousel-selector-3 > p:nth-child(1)")).click();
	}	
	
}
