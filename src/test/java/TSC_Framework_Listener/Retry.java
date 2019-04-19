package TSC_Framework_Listener;

import java.util.logging.Logger;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer
{
	private int retrycount=0;
	private int maxretrycount=1;
	public  static final Logger log=Logger.getLogger(Retry .class.getName());
	public boolean retry(ITestResult result) 
	{
       if(retrycount<maxretrycount)
  {
      log.info("Retrying Test"+result.getName()+"with status"+getResultstatusName(result.getStatus() + "for me" +(retrycount+1)+ "+(time)s."));
	   retrycount++;
	   return true;	
  }
       return false;
	}


	private String getResultstatusName(String string) {
		// TODO Auto-generated method stub
		String resultname= null;
		if(string=="1")
			resultname="success";
		if(string=="2")
			resultname="failure";
		if(string=="3")
			resultname="skipped";
		
		
		return resultname;
		
	}

}
