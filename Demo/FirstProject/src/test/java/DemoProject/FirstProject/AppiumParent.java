package DemoProject.FirstProject;

import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;




public class AppiumParent {

	
	public static AndroidDriver driver;

	
public static void OpenCalculator() throws Exception {

		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Gayatri");	
		cap.setCapability("udid", "ad228059");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
		cap.setCapability("appPackage", "com.oneplus.calculator");
    	cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		//cap.setCapability("appPackage", "com.google.android.calendar");
		//cap.setCapability("appActivity", "com.google.android.calendar.AllInOneCalendarActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver(url, cap);

		System.out.println("Application Started...");

	}


public static void LongPressAction(WebElement ele) {
	((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)ele ).getId(),"duration", 2000));
	
	
}

	
	
	
	
	
	
	
}
