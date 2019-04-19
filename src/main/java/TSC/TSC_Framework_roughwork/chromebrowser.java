package TSC.TSC_Framework_roughwork;

import org.testng.annotations.Test;

import TSC.TSC_Framework_TestBase.TestBase;

public class chromebrowser extends TestBase
{
	
	/*public WebDriver dr;
   String browser="chrome";*/
@Test
   public void openbrowser() throws Exception
   {
    
	   System.out.println("inside chromebrowser...........");
       init();
   /* System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
	dr=new ChromeDriver();
	
	dr.get("https://www.google.com/");
    getScreenShot("image");*/
	
	
	
   }

  /*public void getScreenShot(String name)
	{
		Calendar calender=Calendar.getInstance();
		SimpleDateFormat formatter=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		
		File src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try
		{
			String reportdirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"//ScreenShot/";
		
			File destfile=new File((String)reportdirectory +name+"_"+formatter.format(calender.getTime())+".png");
			FileUtils.copyFile(src, destfile);
//			Reporter.log("< a href='"+destfile.getAbsolutePath()+"'><img src='" +destfile.getAbsolutePath()+"' height='100' width='100'/></a>");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
	    }
		
		
	}
  */
  /* public static void main(String[] args) throws Exception {
   chromebrowser  obj=new chromebrowser();
	   obj.openbrowser();
}*/
}
