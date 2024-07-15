package DemoProject.FirstProject;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class BasicDemo {
	// WebDriver driver;
	public static AndroidDriver driver;
	// AndroidDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
	
			openCalculator();
			driver.findElement(By.id("com.oneplus.calculator:id/digit_9")).click();
			driver.findElement(AppiumBy.accessibilityId("Add")).click();
			driver.findElement(By.id("com.oneplus.calculator:id/digit_3")).click();
			driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Equals\"]")).click();
			driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
			String result = driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
		    
			System.out.println("addition is " + result);
			
//			WebElement ele= driver.findElement(By.id("com.oneplus.calculator:id/result"));
//			driver.executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",ele ));
			
			WebElement ele= driver.findElement(By.id("com.oneplus.calculator:id/result"));
			((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)ele ).getId(),"duration", 2000));
			
			
			WebElement text= driver.findElement(By.id("com.oneplus.calculator:id/formula_container"));
			Assert.assertEquals(text, "copy");
			Assert.assertTrue(driver.findElement(By.id("com.oneplus.calculator:id/formula_container")).isDisplayed());
		    
		}

	public static void openCalculator() throws Exception {

		
		
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

}
