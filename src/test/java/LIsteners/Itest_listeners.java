package LIsteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Itest_listeners implements ITestListener {

	public void OnStart(ITestContext context) {
		//ItestContext is gives information about test run
		System.out.println("On Strat of the Execution :"+context.getName());
	}
	
	public void OnFinish(ITestContext context) {
		System.out.println("on Test Executed Succefully:"+context.getName());
	}
	
	
	public void OnTestStart(ITestResult result) {
		System.out.println("<<<<<<<<<<<< Test Started >>>>>>>>>:"+result.getName());
	}
	
	
	public void OnTestFailure(ITestResult result) {
		System.out.println("<<<<<<<<<<<< Test Fail >>>>>>>>>:"+result.getName());
	}
	
	public void OnTestSuccess(ITestResult result) {
		System.out.println("<<<<<<<<<<<< Test Success >>>>>>>>>:"+result.getName());
	}
	
	public void OnTesSkipped(ITestResult result) {
		System.out.println("<<<<<<<<<<<< Test Skipped >>>>>>>>>:"+result.getName());
	}
		
}
