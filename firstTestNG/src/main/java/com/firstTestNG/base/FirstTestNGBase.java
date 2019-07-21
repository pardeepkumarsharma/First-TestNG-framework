package com.firstTestNG.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.firstTestNG.util.Util;

/**
 * This is the base class to all the Test classes
 *
 * @author Pardeep
 */
public class FirstTestNGBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	
	public Logger log;
	
	
	public FirstTestNGBase(){
		
		try {
			prop = new Properties();
			FileInputStream ips = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/firstTestNG/configurations/config.properties");
		prop.load(ips);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		 log = Logger.getLogger(FirstTestNGBase.class);
	}
	
	
	/**
	 * This method is used to initialize the property file and driver, and launch the driver with required URL
	 *
	 */
	public static void initilize() {
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		
		}
				
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Util.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
	}
	
	/**
	 * This method is used to wait till the element is visible on the screen
	 *
	 * 
	 */
	public void waitForElementToBeVisible(By locator, int timeOut) {

		try{			
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			WebElement element = wait.until(ExpectedConditions
					.visibilityOfElementLocated(locator));

		}catch(Exception e){
			log.info(("Element is not visible after waiting for "+timeOut+" seconds"));
		}
	}

	/**
	 * This method is used to check the visibility of the element
	 *
	 * @return a true if element is present else returns false
	 */
	public boolean isElementVisible(By locator,int timeout) {
		try{
			waitForElementToBeVisible(locator,timeout);
			return driver.findElement(locator).isDisplayed() ? true : false;
		}catch(Exception e){
			return false;
		}
	}
	
	
	/**
	 * This method is used to take screenshot 
	 *
	 * 
	 */
	public void takeScreenshot() {
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("./target/screenshots/"+"failure_"+System.currentTimeMillis()+"_"+".jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to switch to a frame using the id
	 *
	 * 
	 */
	public void switchFrame(String frame) {
		
		driver.switchTo().frame(frame);
		
	}

	/**
	 * This method is used to switch to a frame using the index
	 *
	 * 
	 */
	public void switchFrame(int frame) {
		
		driver.switchTo().frame(frame);
		
	}
}
