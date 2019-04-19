package TSC_Framework_Listener;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer
{
	public  static final Logger log=Logger.getLogger(RetryListener.class.getName());
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) 
	{
		IRetryAnalyzer retry=annotation.getRetryAnalyzer();
				
		if(retry==null)		
		{
			annotation.setRetryAnalyzer(Retry.class);
		}
				
	}

	
}
