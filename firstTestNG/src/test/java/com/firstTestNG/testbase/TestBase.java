package com.firstTestNG.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.firstTestNG.base.FirstTestNGBase;
import com.firstTestNG.pages.HomePage;
import com.firstTestNG.util.Util;



public  class TestBase extends FirstTestNGBase{
	 protected HomePage sampleLogin;
	 protected Util	util;
	 protected SoftAssert soft;
	public TestBase() {
		super();
		sampleLogin = new HomePage();
		util = new Util();
	}
	@BeforeMethod
	public void setUp() {
		log.info("************************Begining of test case************************");
		initilize();
		soft = new SoftAssert();
	}
	

	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		log.info("************************Ending of test case************************");
	}
}
