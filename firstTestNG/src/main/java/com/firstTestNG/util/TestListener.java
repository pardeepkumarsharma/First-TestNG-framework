package com.firstTestNG.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.firstTestNG.base.FirstTestNGBase;

public class TestListener extends FirstTestNGBase implements ITestListener {

	public void onFinish(ITestContext result) {
		log.info("Test case finished : "+ result.getName());
		
	}

	public void onStart(ITestContext result) {
		log.info("Test case Started : "+ result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		log.info("");
		
	}

	public void onTestFailure(ITestResult result) {
		log.info("Test case Failed : "+ result.getName());
		takeScreenshot();
		
	}

	public void onTestSkipped(ITestResult result) {
		log.info("Test case Skipped : "+ result.getName());
		
	}

	public void onTestStart(ITestResult result) {
		log.info("Test case started : "+ result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		log.info("Test case finised successfully : "+ result.getName());
		
	}

}
