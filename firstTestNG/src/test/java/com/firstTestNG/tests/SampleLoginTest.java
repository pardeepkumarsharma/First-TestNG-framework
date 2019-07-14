package com.firstTestNG.tests;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.firstTestNG.testbase.TestBase;

public class SampleLoginTest extends TestBase {
	
	public SampleLoginTest() {
		super();
		
	}

	@Test
	public void launchTest() {
		SoftAssert softy = new SoftAssert(); 
		
		softy.assertTrue(sampleLogin.returnTrue(), "Test case is not working fine");
		softy.assertAll();
	}
}
