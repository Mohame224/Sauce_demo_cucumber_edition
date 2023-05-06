package base;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	public void onTestFailure(ITestResult arg0) {

		Date currentdate=new Date();
		String screenshotdate=currentdate.toString().replace(" ", "-").replace(":","-");
		TakesScreenshot scrshot = (TakesScreenshot) SetupDriver.driver;
		File scrfile = scrshot.getScreenshotAs(OutputType.FILE);

			try {
				FileUtils.copyFile(scrfile, new File(System.getProperty("user.dir") + File.separator + "FailedScreenShots"
						+ File.separator + arg0.getName()+ screenshotdate+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
