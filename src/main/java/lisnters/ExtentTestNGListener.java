package lisnters;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;


import java.io.File;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentTestNGListener implements ITestListener {

	private static ExtentReports extent;
	private static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
	
	
	public void onStart(ITestContext context) {
		long l=Calendar.getInstance().getTimeInMillis();
		File file=new File(System.getProperty("user.dir")+"/test-output/ExtentReportNew"+l+".html");
		ExtentSparkReporter spark = new ExtentSparkReporter(file);
		extent = new ExtentReports();
		extent.attachReporter(spark);
	}


	public void onTestStart(ITestResult result) {
		ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName()+"\t"+"test execution started");
		test.set(extentTest);
	}


	public void onTestSuccess(ITestResult result) {
		test.get().pass(result.getMethod().getMethodName()+"Test Passed");
	}


	public void onTestFailure(ITestResult result) {
		test.get().fail(result.getThrowable());
	}


	public void onTestSkipped(ITestResult result) {
		test.get().skip(result.getThrowable()+"\t"+"Test Skipped");
	}


	public void onFinish(ITestContext context) {
		extent.flush();
	}
}

