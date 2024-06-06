package extentreports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreport {
	@Test
	public void report() {
		
		String TIME = LocalDateTime.now().toString().replace(":", "-");
		
		//step1 : Create ExtentSparkReporter object
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_Report/extentreport"+TIME+".html");
		
		//Step2 : Create ExtentReports object
		ExtentReports extReport = new ExtentReports();
		
		//Step3 : attach spark reporter to Extent report
		extReport.attachReporter(spark);
		
		//Step3 : Create ExtentTest object
		ExtentTest test = extReport.createTest("report");
		
		//Step5 : Call log() to provide status and message
		test.log(Status.PASS, "Log message is added to the extent report");
		
		//Step6 : Call flush() to write report in to destination
		extReport.flush();
	}

}
