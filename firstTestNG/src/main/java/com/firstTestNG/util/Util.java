package com.firstTestNG.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.firstTestNG.base.FirstTestNGBase;

public class Util extends FirstTestNGBase {
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	

	public void switchToFrame() {
		driver.switchTo().frame(0);
	}
	
	public static void takeScreenshotAtFailure() throws IOException{
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new File(System.getProperty("User.dir")+"/screenshots/"+System.currentTimeMillis()+".png"));
	}
}
