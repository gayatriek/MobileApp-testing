
package MobileBrowser;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class MobileBrowser {
//	public static AndroidDriver driver;

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OpenCrome();
		//driver.get("https://www.google.com/");
//		Set <String> context = driver.getContextHandles();
//		for (String contextname : context) {
//			System.out.println(contextname);
//		}
//		driver.context("WEBVIEW_chrome");
//		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@text='No, thanks']")).click();
		//System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("appium");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		
		
		
	}
	
	
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
}
