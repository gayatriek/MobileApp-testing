package DemoProject.FirstProject;


import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorTest {

	static  AndroidDriver driver;
     
	
	// AndroidDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
			openCalculator();
		
		
	}

	public static void openCalculator() throws Exception  {
	
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "Gayatri");
		cap.setCapability("udid", "ad228059");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
		cap.setCapability("appPackage", "com.oneplus.calculator");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
	
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver(url, cap);
		

		System.out.println("Application Started...");

	}

}
