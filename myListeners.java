package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import generics.Basetest;

public class myListeners implements ITestListener{

	public void onTestFailure(ITestResult result)
	{
		String scriptName=result.getMethod().getMethodName();
		Basetest.actionUtil.captureScreenShot(scriptName);
	}

}
