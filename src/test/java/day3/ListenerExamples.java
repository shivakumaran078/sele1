package day3;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExamples implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("test started: "+result.getName());
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test success:"+result.getName());
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("test failure:"+result.getName());
		// TODO Auto-generated method stub

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped:"+result.getName());
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("failed within success percentage:"+result.getName());
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		System.out.println("on start:"+context.getName());
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		System.out.println("on finish:"+context.getName()); 
		// TODO Auto-generated method stub

	}


}
