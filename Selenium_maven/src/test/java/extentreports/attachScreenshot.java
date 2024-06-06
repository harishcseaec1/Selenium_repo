package extentreports;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class attachScreenshot {

	@Test
	public void screenshot() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://demowebshop.tricentis.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		String TIME = LocalDateTime.now().toString().replace(":", "-");
		
		//step1 : Create ExtentSparkReporter object
				ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_Report/extentreport"+TIME+".html");
				
				//Step2 : Create ExtentReports object
				ExtentReports extReport = new ExtentReports();
				
				//Step3 : attach spark reporter to Extent report
				extReport.attachReporter(spark);
				
				//Step3 : Create ExtentTest object
				ExtentTest test = extReport.createTest("screenshot");
				
				//Step5 : Call log() to provide status and message
				test.log(Status.PASS, "Log message is added to the extent report");
				
				test.addScreenCaptureFromBase64String(screenshot,"error image");
				
				//Step6 : Call flush() to write report in to destination
				extReport.flush();
	}
}
