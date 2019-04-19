package TSC.TSC_Framework_TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import TSC.TSC_Framework_config.EmailConfiguration;
import TSC_Framework_Listener.Listener;



public class TestBase
{
	public static  WebDriver dr=null;
    String browser="firefox";
    public static ExtentReports extent;
	public static ExtentTest test;
	public static Logger log=Logger.getLogger(TestBase.class.getName());
	public static EmailConfiguration Emailconfig2 = new EmailConfiguration();
	public static Listener lis = new Listener();
	public static WebDriverWait wait;
	public static Properties OR;
	public static File file;
	public static FileInputStream input;
//	public static ListenerDemo lis = new ListenerDemo();	
	static
	{
		Calendar calender=Calendar.getInstance();
		SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
//     	extent=new ExtentReports(System.getProperty("user.dir")+"/src/test/java/report/ExtentReport" + formater.format(calender.getTime()) + ".html", false);
		extent=new ExtentReports(System.getProperty("user.dir")+"/Output/AutomaionReport" + ".html", true);
	}

	public void init() throws Exception
	{
		selectbrowser(browser);	
		
	}
	public void selectbrowser(String browser) throws Exception
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
			dr=new ChromeDriver();
		
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\resources\\geckodriver.exe");
			dr=new FirefoxDriver();
	
		}
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		dr.get("http://staging.jobs.thespectrumcareers.com/");
//     	dr.get("http://192.168.1.29/TSC");
//		dr.get("https://www.thespectrumcareers.com/");
  }
	@BeforeSuite
	public void LoadProperties() throws IOException
	{
		
		 OR = new Properties();
		 file = new File(System.getProperty("user.dir") + "//resources//properties//OR.properties");
		 input = new FileInputStream(file);
		 OR.load(input);	
		
	}
	
	
	
	public static  String getScreenShot(WebDriver dr,String screenshotName)
	{
		Calendar calender=Calendar.getInstance();
		SimpleDateFormat formatter=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		
		File src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try
		{
			String reportdirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"/ScreenShot/";
		
	        String destfile=reportdirectory +screenshotName+"_"+formatter.format(calender.getTime())+".png";
			File finaldestination=new File(destfile);
			FileUtils.copyFile(src, finaldestination);
			return destfile;
//			Reporter.log("< a href='"+destfile.getAbsolutePath()+"'><img src='" +destfile.getAbsolutePath()+"' height='100' width='100'/></a>");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
	    }
		return screenshotName;
	}
	/*public String captureScreen(String fileName) 
	{
		
		if (fileName == "") 
		{
		fileName = "blank";
	    }
       File destFile = null;
       Calendar calender=Calendar.getInstance();
	   SimpleDateFormat formatter=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
//	   extent=new ExtentReports(System.getProperty("user.dir")+"src/mainjava/pagefactory/POMPagefactory/reports/extent.html",false);
		File src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try
		{
			String reportdirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"//ScreenShot/";
		
			File destfile=new File((String)reportdirectory +fileName+"_"+formatter.format(calender.getTime())+".png");
			FileUtils.copyFile(src, destfile);
			Reporter.log("< a href='"+destfile.getAbsolutePath()+"'><img src='" +destfile.getAbsolutePath()+"' height='100' width='100'/></a>");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
	    }
		return destFile.toString();
	
	}*/
	public void getresult(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) 
		{
			test.log(LogStatus.PASS, result.getName() + " test is pass");
			String screenshotPath=TestBase.getScreenShot(dr, result.getName());	
			test.log(LogStatus.PASS, test.addScreenCapture(screenshotPath)); //for image
//		    test.log(LogStatus.PASS,test.addScreencast(screenshotPath));      //for video
		}  
		else if (result.getStatus() == ITestResult.SKIP) 
		{
			test.log(LogStatus.SKIP, result.getName() + " test is skipped and skip reason is:-" + result.getThrowable());
		}
		else if (result.getStatus() == ITestResult.FAILURE)
		{	
		
       	 test.log(LogStatus.ERROR, result.getName() + " test is failed" + result.getThrowable());
		 String screenshotPath=TestBase.getScreenShot(dr, result.getName());
		 test.log(LogStatus.PASS, test.addScreenCapture(screenshotPath));
//		   test.log(LogStatus.FAIL,test.addScreencast(screenshotPath));
		}
		else if (result.getStatus() == ITestResult.STARTED) 
		{
			test.log(LogStatus.INFO, result.getName() + " test is started");
		}
	}

	@AfterMethod()
	public void afterMethod(ITestResult result) {
		getresult(result);
//		testAttachmentMailSending();
	}

	@BeforeMethod()
	public void beforeMethod(Method result) {
		test = extent.startTest(result.getName());
		test.log(LogStatus.INFO, result.getName() + " test Started");
	}
		
	@AfterClass(alwaysRun = true)
	public void endTest() {
		extent.endTest(test);
		extent.flush();
		
	}

	public static void testMailSending() {    
	      // Recipient's email ID needs to be mentioned.
	      String to = "shahinrana@rangam.com";
	      //String cc = "hirendrarajawat@rangam.com";

	      // Sender's email ID needs to be mentioned
	      String from = "shahinrana@rangam.com";

	      // Assuming you are sending email from localhost
	      String host = "mail.rangamgroup.com";

	      // Get system properties
	      Properties properties = System.getProperties();

	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties);

	      try {
	    	  System.out.println("Sending Test Mail...");
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	         
	       //set To field of the cc to send to multiple recipients....
	         message.setRecipients(Message.RecipientType.CC, "hirendrarajawat@rangam.com,shahinrana@rangam.com");

	         // Set Subject: header field
	         message.setSubject("Selenium test mail");

	         // Now set the actual message
	         message.setText("This is the test email from Selenium (Only Text File)");

	         // Send message
	         Transport.send(message);
	         System.out.println("Email Sent successfully to the user....");
	      } catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	}
	

		public void testAttachmentMailSending() {     
		      // Recipient's email ID needs to be mentioned.
		      String to = "shahinrana@rangam.com";

		      // Sender's email ID needs to be mentioned
		      String from = "shahinrana@rangam.com";

		      // Assuming you are sending email from localhost
		      //String host = "mail.rangam.com";
		      String host = "mail.rangamgroup.com";

		      // Get system properties
		      Properties properties = System.getProperties();

		      // Setup mail server
		      properties.setProperty("mail.smtp.host", host);

		      // Get the default Session object.
		      Session session = Session.getDefaultInstance(properties);

		      try {
		    	  System.out.println("Sending Test Mail with Attachment...");
		         // Create a default MimeMessage object.
		         MimeMessage message = new MimeMessage(session);

		         // Set From: header field of the header.
		         message.setFrom(new InternetAddress(from));

		         // Set To: header field of the header.
		         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));

		         // Set Subject: header field
		         message.setSubject("Selenium Attachment test mail");

		         // Create the message part 
		         BodyPart messageBodyPart = new MimeBodyPart();
		         messageBodyPart.setText("This is test selenium (with Attachment) mail");
		         
		         // Create a multipart message
		         Multipart multipart = new MimeMultipart();

		         // Set text message part
		         multipart.addBodyPart(messageBodyPart);

		         // Part two is attachment
		         messageBodyPart = new MimeBodyPart();
		         //String filename = "Z:\\Hirendra Rajawat\\Selenium_Setup\\Selenium Setup2.docx";
//		         String filepath=System.getProperty("user.dir")+"\\ExtentReport\\AutomaionReport.html";
		         String filename = System.getProperty("user.dir")+"\\ExtentReport\\AutomaionReport.html";
		         //String filename2 = "C:\\HSR\\IEDriverServer_Win32_3.8.0.zip";
		         DataSource source = new FileDataSource(filename);
		         //DataSource source2 = new FileDataSource(filename2);
		         messageBodyPart.setDataHandler(new DataHandler(source));
		         //messageBodyPart.setDataHandler(new DataHandler(source2));
		         messageBodyPart.setFileName(filename);
		         //messageBodyPart.setFileName(filename2);
		         multipart.addBodyPart(messageBodyPart);

		         // Send the complete message parts
		         message.setContent(multipart );

		         // Send message
		         Transport.send(message);
		         System.out.println("Attachment email sent successfully....");
		      } catch (MessagingException mex) {
		         mex.printStackTrace();
		      }
		   }


public void closebrowser() throws Exception
{
    Thread.sleep(2000);
	log.info("browser closed");
	extent.endTest(test);
	extent.flush();
    dr.close();
}





public static void close() throws IOException {
	try {
		log.info("**********AfterSuite Close Browser**********");
		test = extent.startTest("AfterSuite Close Browser");
		test.log(LogStatus.INFO, "Close close successfully:");
		test.log(LogStatus.INFO, "Driver quite successfully:");
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		// close the browser
		if (dr != null) {
			dr.close();
			dr.quit();
			dr=null;
			
		}
		/*Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
		Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");
		Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");*/
	}

}

public void JobseekerLogin() throws Exception
{
	System.out.println("This is login");
	dr.get("http://192.168.1.29/TSCNew/LandingPage/JobSeekerView");
	Thread.sleep(500);
	dr.get("http://192.168.1.29/TSCNew/JobSeeker/Login");
	System.out.println("Again Click on Login Button && clear emailid & Password field ");
	// dr.findElement(By.cssSelector(".login-area > div:nth-child(4) >
	// input:nth-child(1)")).click();
	Thread.sleep(5000);
	dr.findElement(By.xpath(OR.getProperty("username"))).clear();
	dr.findElement(By.cssSelector(OR.getProperty("password"))).clear();
	System.out.println("Email");
	dr.findElement(By.xpath(OR.getProperty("username"))).sendKeys("emailfarhin@gmail.com");
	System.out.println("Password");
	dr.findElement(By.cssSelector(OR.getProperty("password"))).sendKeys("123@Rana");
	System.out.println("click on Login");
	dr.findElement(By.xpath(OR.getProperty("Login"))).click();
	Thread.sleep(5000);
}
public void EmployerLogin() throws Exception
{
	System.out.println("This is login");
	dr.get("http://192.168.1.29/TSCNew/LandingPage/EmployersView");
	Thread.sleep(500);
	dr.get("http://192.168.1.29/TSCNew/EmployerOrServiceProv/Login");
	System.out.println("Again Click on Login Button && clear emailid & Password field ");
	Thread.sleep(3000);
	dr.findElement(By.xpath(OR.getProperty("username"))).clear();
	dr.findElement(By.cssSelector(OR.getProperty("password"))).clear();
	System.out.println("Email");
	dr.findElement(By.xpath(OR.getProperty("username"))).sendKeys("shahinrana@ranagam.com");
	System.out.println("Password");
	dr.findElement(By.cssSelector(OR.getProperty("password"))).sendKeys("123@Rana");
	System.out.println("click on Login");
	dr.findElement(By.xpath(OR.getProperty("Login"))).click();
	Thread.sleep(2000);
}
public void serviceProviderLogin() throws Exception
{
	 System.out.println("This is login");
     dr.get("http://192.168.1.29/TSCNew/LandingPage/EmployersView"); 
     
     
     Thread.sleep(500);
     dr.get("http://192.168.1.29/TSCNew/EmployerOrServiceProv/Login");
	 System.out.println("Again Click on Login Button && clear emailid & Password field ");
	 dr.findElement(By.xpath(OR.getProperty("Login"))).click();
	 Thread.sleep(3000);
	 dr.findElement(By.xpath(OR.getProperty("username"))).clear();
	 dr.findElement(By.cssSelector(OR.getProperty("password"))).clear();
	 System.out.println("Email");
	 dr.findElement(By.xpath(OR.getProperty("username"))).sendKeys("sameer@yahoo.com");
	 System.out.println("Password");
	 dr.findElement(By.cssSelector(OR.getProperty("password"))).sendKeys("123@Rana");
	 System.out.println("click on Login");
	 dr.findElement(By.xpath(OR.getProperty("Login"))).click();
}
public void UniversityLogin() throws InterruptedException
{
	dr.get("http://192.168.1.29/TSCNew/LandingPage/University");
	Thread.sleep(200);
	dr.get("http://192.168.1.29/TSCNew/University/Login");
	System.out.println("Again Click on Login Button && clear emailid & Password field ");
	 dr.findElement(By.xpath(OR.getProperty("Login"))).click();
	Thread.sleep(300);
	dr.findElement(By.xpath(OR.getProperty("username"))).clear();
	dr.findElement(By.cssSelector(OR.getProperty("password"))).clear();
	System.out.println("Email");
	dr.findElement(By.xpath(OR.getProperty("username"))).sendKeys("twinkle@patel.edu");
	System.out.println("Password");
	dr.findElement(By.cssSelector(OR.getProperty("password"))).sendKeys("123@Rana");
	Thread.sleep(2000);
	System.out.println("click on Login");
	dr.findElement(By.xpath(OR.getProperty("Login"))).click();
}
//method
public static void waitForVisitibilty(WebElement element) {
	dr.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	wait = new WebDriverWait(dr, 60);
	// wait.until(ExpectedConditions.visibilityOf(element));
	if (!element.isDisplayed()) {
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.ignoring(NoSuchElementException.class);
	} else {
		log.info("Element not present");
	}
}

public static void click(WebElement element) {
	waitForVisitibilty(element);
	element.click();
}

public static void clear(WebElement element) {
	waitForVisitibilty(element);
	element.clear();
}

public static void sendKeys(WebElement element, String keyword) {
	waitForVisitibilty(element);
	element.clear();
	element.sendKeys(keyword);
}

public static boolean isDisplayed(WebElement element) {
	boolean present = false;
	waitForVisitibilty(element);
	try {
		present = element.isDisplayed();
		log.info(element.getText() + " is dispalyed");
	} catch (Exception e) {
		
	}
	return present;
}

public static boolean isElementPresent(WebElement element) {

	waitForVisitibilty(element);
	log.info("element is present:" + element.toString());
	return element.isDisplayed();

}

public static String getText(WebElement element) {
	waitForVisitibilty(element);
	return element.getText();
}

public static WebElement linkText(WebElement element, String Keyword) {
	waitForVisitibilty(element);
	return element = dr.findElement(By.partialLinkText(Keyword));
}

public static String getAttributeValue(WebElement element, String attribute) {
	waitForVisitibilty(element);
	return element.getAttribute(attribute);
}

public static void SelectByText(String tagname, String text) {
	log.info("Text=" + text + "\t" + "tagname=" + tagname);
	if (tagname != null) {
		dr.findElement(By.xpath(".//'" + tagname + "'[contains(text(),'" + text + "')]"));
	} else {
		dr.findElement(By.xpath(".//*[contains(text(),'" + text + "')]"));
	}
}
}
