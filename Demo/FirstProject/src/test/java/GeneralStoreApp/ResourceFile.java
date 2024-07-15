package GeneralStoreApp;

import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;

public class ResourceFile {

	public static AndroidDriver driver;

	
	public static void OpenGeneralStoreApp() throws Exception {

			
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

		}

	public static void teardown() {
		driver.quit();
	}

	public static Double getFormattedAmount(String Amount){
		Double price= Double.parseDouble(Amount.substring(1));
		return price;
		
	}
	public static void LongPressAction(WebElement ele) {
    	
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)ele ).getId(),"duration", 2000));
		
		
	     }
	
	
	
	
}
