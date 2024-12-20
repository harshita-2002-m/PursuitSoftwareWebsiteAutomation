package helper;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	private int retryCount = 0;
	private static final int maxCount = 2;
	
	@Override
	public boolean retry(ITestResult result) {
		System.out.println("Retrying...");
		if(retryCount < maxCount) {
			retryCount++;
			return true;
		}
		
		return false;
	}

}
