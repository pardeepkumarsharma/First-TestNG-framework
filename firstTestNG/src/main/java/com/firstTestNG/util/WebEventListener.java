package com.firstTestNG.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.firstTestNG.base.FirstTestNGBase;

public class WebEventListener extends FirstTestNGBase implements WebDriverEventListener {

	public void afterAlertAccept(WebDriver driver) {
		System.out.println("Accepted the alert");
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		System.out.println("Dismissed the alert");
		
	}

	public void afterChangeValueOf(WebElement arg0, WebDriver driver, CharSequence[] arg2) {
		System.out.println("");
		
	}

	public void afterClickOn(WebElement arg0, WebDriver driver) {
		System.out.println("Clicked on web-element: " + arg0.toString());
		
	}

	public void afterFindBy(By arg0, WebElement arg1, WebDriver driver) {
		System.out.println("");
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		System.out.println("Got the screenshot");
		
	}

	public void afterGetText(WebElement arg0, WebDriver driver, String arg2) {
		System.out.println("");
		
	}

	public void afterNavigateBack(WebDriver driver) {
		System.out.println("Navigated back");
		
	}

	public void afterNavigateForward(WebDriver driver) {
		System.out.println("Navigated forward");
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("Refreshed the page");
		
	}

	public void afterNavigateTo(String arg0, WebDriver driver) {
		System.out.println("Navigated to the URL : " +arg0);
		
	}

	public void afterScript(String arg0, WebDriver driver) {
		System.out.println("");
		
	}

	public void afterSwitchToWindow(String arg0, WebDriver driver) {
		System.out.println("");
		
	}

	public void beforeAlertAccept(WebDriver driver) {
		System.out.println("");
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		System.out.println("");
		
	}

	public void beforeChangeValueOf(WebElement arg0, WebDriver driver, CharSequence[] arg2) {
		System.out.println("");
		
	}

	public void beforeClickOn(WebElement arg0, WebDriver driver) {
		System.out.println("");
		
	}

	public void beforeFindBy(By arg0, WebElement arg1, WebDriver driver) {
		System.out.println("");
		
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		System.out.println("");
		
	}

	public void beforeGetText(WebElement arg0, WebDriver driver) {
		System.out.println("");
		
	}

	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("About to navigate back");
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("About to navigate forward");
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		System.out.println("About to refresh the page");
		
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before Navigating to : "+url);
		
	}

	public void beforeScript(String arg0, WebDriver driver) {
		System.out.println("");
		
	}

	public void beforeSwitchToWindow(String arg0, WebDriver driver) {
		System.out.println("About tp switch to window"+arg0);
		
	}

	public void onException(Throwable error, WebDriver driver) {
		System.out.println("Exception occured : "+error	);
		try {
			Util.takeScreenshotAtFailure();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
