package com.firstTestNG.util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.firstTestNG.base.FirstTestNGBase;

public class RetryListener extends FirstTestNGBase implements IRetryAnalyzer {

	int count = 0;
	int retrylimit = 2;

	public boolean retry(ITestResult result) {

		if(count<retrylimit) {
			log.info("Executing the failed test case again : "+count);
			count++;
			return true;
		}
		return false;
	}

}
