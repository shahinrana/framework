package TSC_Framework_Listener;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.codec.binary.Base64;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;
import TSC.TSC_Framework_TestBase.TestBase;
import TSC.TSC_Framework_config.EmailConfiguration;
import TSC.TSC_Framework_config.MonitoringMail;
import TSC.TSC_Framework_config.ZipFiles;

public class ListenerDemo extends TestBase implements ITestListener {
	String errorImagepath = null;
	public String messageBody;

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Test started running:" + result.getMethod().getMethodName() + " at:" + result.STARTED);
	}

	public void onTestSuccess(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			try {
				System.out.println("success ma avyu....");
				String methodName = result.getName();
				errorImagepath = getScreenShot(dr, "test Success");
				System.out.println("Image path:" + errorImagepath);
				File file = new File(errorImagepath);
				test.log(LogStatus.PASS, result.getTestName());
				String path = "file://" + errorImagepath.toString();
				System.out.println("Original path:" + path);
				log.info(path);
				test.log(LogStatus.PASS, result.getTestName());
				test.log(LogStatus.PASS, path);
				String encodstring = encodeFileToBase64Binary(file);
				String base = "data:image/png;base64," + encodstring;
				System.out.println("Base64Code:" + base);
				System.out.println("attachment before....");
				test.log(LogStatus.PASS, "PASS method screenshot below" + test.addBase64ScreenShot(base));
				System.out.println("attachment successed....");
//				Reporter.log("<a href='" + base + "'> <img src='" + base + "' height='100' width='100'/> </a>");

			}

			catch (Exception e)

			{
				log.info("Failed Method onTestFailure:" + e.getMessage());

			}
			extent.endTest(test);
			extent.flush();
		}
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("success ma avyu....");
		String methodName = result.getName();
		errorImagepath = getScreenShot(dr, "test failure");
		System.out.println("Image path:" + errorImagepath);
		File file = new File(errorImagepath);
		test.log(LogStatus.FAIL, result.getTestName());
		String path = "file://" + errorImagepath.toString();
		System.out.println("Original path:" + path);
		log.info(path);
		test.log(LogStatus.FAIL, result.getTestName());
		test.log(LogStatus.FAIL, path);
		String encodstring = encodeFileToBase64Binary(file);
		String base = "data:image/png;base64," + encodstring;
		System.out.println("Base64Code:" + base);
		System.out.println("attachment before....");
		test.log(LogStatus.FAIL, "FAIL method screenshot below" + test.addBase64ScreenShot(base));
		System.out.println("attachment successed....");
		Reporter.log("<a href='" + base + "'> <img src='" + base + "' height='100' width='100'/> </a>");

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		try {
			String outputFolderPath = System.getProperty("user.dir") + "\\Output";
			log.info("outputFolderPath:" + outputFolderPath);
			System.out.println("outputFolderPath:" + outputFolderPath);
			ZipFiles.zip(outputFolderPath, EmailConfiguration.attachmentName);
			MonitoringMail.sendmail(EmailConfiguration.server, EmailConfiguration.port, EmailConfiguration.from,
					EmailConfiguration.Emailpassword, EmailConfiguration.to, EmailConfiguration.cc,
					EmailConfiguration.Emailusername, EmailConfiguration.subject, EmailConfiguration.messageBody,
					EmailConfiguration.attachmentPath, EmailConfiguration.attachmentName);
			log.info("mail moniter method called");
		} catch (Exception e) {
			log.info("Failed Method onFinish:" + e.getMessage());
			System.out.println(e.getMessage());
			log.info("mail moniter method error message" + e.getMessage());
			e.printStackTrace();
		}

	}

	private static String encodeFileToBase64Binary(File file) {
		String encodedfile = null;
		try {
			@SuppressWarnings("resource")
			FileInputStream fileInputStreamReader = new FileInputStream(file);
			byte[] bytes = new byte[(int) file.length()];
			fileInputStreamReader.read(bytes);
			encodedfile = new String(Base64.encodeBase64(bytes), "UTF-8");
		} catch (Exception e) {
			log.info(e.getMessage());
			e.printStackTrace();
		}

		return encodedfile;
	}

}
