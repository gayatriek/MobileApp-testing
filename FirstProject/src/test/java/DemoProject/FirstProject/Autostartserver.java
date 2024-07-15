package DemoProject.FirstProject;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Autostartserver {
	
	
	
	public static AndroidDriver driver;
	public static AppiumDriverLocalService service;
	
	
	public static void ConfigurAppium() {
		
     service=new AppiumServiceBuilder().withAppiumJS(new File ("C:\\Users\\GAKSHIRS\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
	    
	    service.start();
	}
	
	
	
    public static void OpenCalculator() throws Exception {

	    

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Gayatri");	
		cap.setCapability("udid", "ad228059");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
	//	cap.setCapability("appPackage", "com.oneplus.calculator");
    //	cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		cap.setCapability("appPackage", "com.google.android.calendar");
		cap.setCapability("appActivity", "com.google.android.calendar.AllInOneCalendarActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver(url, cap);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		System.out.println("Application Started...");

	}


    public static void LongPressAction(WebElement ele) {
    	
	((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)ele ).getId(),"duration", 2000));
	
	
     }
    
    public static void teardown() {
    	driver.quit();
    	service.stop();
    }




}
