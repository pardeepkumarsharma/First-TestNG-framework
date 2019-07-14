package com.firstTestNG.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.firstTestNG.base.FirstTestNGBase;

public class SampleLogin extends FirstTestNGBase {
	
	//Page Factory 
	
	@FindBy(xpath ="")
	WebElement username;
	
	//Constructor userd to initilize the webelements using page factory method
	public SampleLogin() {
		PageFactory.initElements(driver, this);
	
	}
	
	public boolean returnTrue() {
		return true;
	}
	
	public boolean returnFalse() {
		return false;
	}
}
