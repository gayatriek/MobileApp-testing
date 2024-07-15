package MobileBrowser;

import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
	
public static AndroidDriver driver;

	
	public static void OpenCrome() throws Exception {

			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "Gayatri");	
			//cap.setCapability("udid", "192.168.33.100:5555");
			//cap.setCapability("udid", "192.168.13.104:5555");
			cap.setCapability("udid", "ad228059");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "13");
			cap.setCapability("appPackage", "com.android.chrome");
	    	cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
			//cap.setCapability("browserName", "Chrome");
	    	
	    	cap.setCapability("chromedriverExecutable", "C:\\Users\\GAKSHIRS\\Downloads\\New folder\\chromedriver-win64\\chromedriver.exe");
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver(url, cap);
			Thread.sleep(2000);
			System.out.println("Application Started...");
		

		
		
		
		
		

		}

	public static void teardown() {
		driver.quit();
	}

	

}
