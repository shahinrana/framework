package TSC.TSC_Framework_roughwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class rough {
public static void main(String[] args) {
	WebDriver dr;
//	System.out.println(System.getProperty("user.dir"));
	
	System.out.println("chrome browser");
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
	dr=new ChromeDriver();
	
	/*System.out.println("firefox browser");
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\resources\\geckodriver.exe");
	dr=new FirefoxDriver();
	*/

}
}
   