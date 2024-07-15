package DemoProject.FirstProject;

import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;




public class ApiDemosResource {

	
	public static AndroidDriver driver;

	
public static void OpenApiDemoApp() throws Exception {

		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Gayatri");	
		cap.setCapability("udid", "192.168.33.101:5555");
		//cap.setCapability("udid", "ad228059");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
		cap.setCapability("appPackage", "io.appium.android.apis");
    	cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		//cap.setCapability("appPackage", "com.google.android.calendar");
		//cap.setCapability("appActivity", "com.google.android.calendar.AllInOneCalendarActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver(url, cap);

		System.out.println("Application Started...");

	}

public static void SwipeAction(WebElement ele, String Direction) {
	
	((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
		    "elementId", (((RemoteWebElement) ele).getId()),
		    "direction", Direction,
		    "percent", 0.75
		));
}

public static void teardown() {
	driver.quit();
}

}
