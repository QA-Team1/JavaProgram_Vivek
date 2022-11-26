package listenerPractice;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("OnTestStart " + result.getName());
	}

	public void onTestSucess(ITestResult result) {
		System.out.println("OnTestSucess " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure " + result.getName());
		failed();
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("onTestSkipped ");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	public void onStart(ITestContext arg0) {
		System.out.println("onStart");
	}

	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
	}

	public void onStart(ISuite arg0) {
		System.out.println("onStart");
	}

	public void onFinish(ISuite context) {
		System.out.println("onFinish");
	}
}
