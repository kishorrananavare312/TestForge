package Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ActualListenerDemo implements ITestListener
{
	
	public void Onstart(ITestContext context)
	{
		System.out.println("Execution start successfully");
	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test case start ");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case Success ");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case Fail ");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test case Skip ");
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("Execution finish");
 }

}
