package org.appiumproject.farmeworkdesign.ExtentReports;

import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.android.AndroidDriver;

public class ExtentReportDemo {

	public static AndroidDriver driver;
	static ExtentReports extent;
	@BeforeTest
	public void config() {
		
		
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Login Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Gayatri");	
		
	}
	
	@Test
	
	public static void OpenGeneralStoreApp() throws Exception {

		
		extent.createTest("Initial Demo");
		
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Gayatri");	
		//cap.setCapability("udid", "192.168.33.100:5555");
		cap.setCapability("udid", "ad228059");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
		cap.setCapability("appPackage", "com.androidsample.generalstore");
    	cap.setCapability("appActivity", "com.androidsample.generalstore.SplashActivity");
    	cap.setCapability("chromedriverExecutable", "C:\\Users\\GAKSHIRS\\Downloads\\New folder\\chromedriver-win64\\chromedriver.exe");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver(url, cap);
		Thread.sleep(2000);
		System.out.println("Application Started...");
		Thread.sleep(2000);
		
		extent.flush();

	}
	
	
	
	
	
	
	
}
