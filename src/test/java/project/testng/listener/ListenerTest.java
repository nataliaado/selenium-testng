package project.testng.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("LISTENER TESTS INICIATED");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TEST PASSED");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TEST FAILED");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TEST SKIPPED");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("LISTENER TESTS FINISHED");
	}

}
