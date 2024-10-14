package Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListner implements ITestListener {

	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	
	public void ConfigureReport()
	{
		
		htmlReporter = new ExtentSparkReporter("Extent Report.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		// add system information
		
		reports.setSystemInfo("Machine","Testpc1");
		reports.setSystemInfo("OS","Linux");
		reports.setSystemInfo("Name","Aman");
		
		// change the look and filed
		
		htmlReporter.config().setDocumentTitle("Extent Reports");
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setReportName("Automation");


	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test Start method executed");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Name of method passed:"+result.getName());
		test = reports.createTest(result.getName());
		test.log(Status.PASS,MarkupHelper.createLabel("Name of the method pass:"+ result.getName(), ExtentColor.GREEN));
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Name of the method failed"+result.getName());
		test = reports.createTest(result.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel("Name of the method fail:"+ result.getName(), ExtentColor.RED));
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
		test = reports.createTest(result.getName());
		test.log(Status.SKIP,MarkupHelper.createLabel("Name of the method skip:"+ result.getName(), ExtentColor.YELLOW));
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ConfigureReport();
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("On Completed");
		reports.flush();
	}

}
