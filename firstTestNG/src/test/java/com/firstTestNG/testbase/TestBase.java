package com.firstTestNG.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.firstTestNG.base.FirstTestNGBase;
import com.firstTestNG.pages.SampleLogin;
import com.firstTestNG.util.Util;



public  class TestBase extends FirstTestNGBase{
	 protected SampleLogin sampleLogin;
	 protected Util	util;
	 
	public TestBase() {
		super();
		sampleLogin = new SampleLogin();
		util = new Util();
	}
	@BeforeMethod
	public void setUp() {

		initilize();
	}
	

	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
