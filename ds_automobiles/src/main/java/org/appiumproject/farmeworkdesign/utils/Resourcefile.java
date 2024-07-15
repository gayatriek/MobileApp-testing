package org.appiumproject.farmeworkdesign.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.SimpleFormatter;
import java.io.FileNotFoundException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v111.browser.Browser;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.adb.SupportsIgnoreHiddenApiPolicyErrorOption;

public class Resourcefile {
public static AndroidDriver driver;

public static Properties prop;
	
    public Resourcefile() throws IOException  {
    	  prop = new Properties();
    	
		    FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\org\\appiumproject\\farmeworkdesign\\Resource\\data.properties");
		   // FileInputStream fis = new FileInputStream("C:\\UsersGAKSHIRS\\eclipse-workspace\\AppiumFrameworkDesign\\src\\main\\java\\org\\appiumproject\\farmeworkdesign\\Resource\\data.properties");
		   
		    prop.load(fis);
		    
    }

	public static void OpenWebPage() throws Exception {

		    
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", prop.getProperty("deviceName"));	
		cap.setCapability("udid", prop.getProperty("udid"));
		cap.setCapability("platformName", prop.getProperty("platformName"));
		cap.setCapability("platformVersion", prop.getProperty("platformversion"));
		cap.setCapability(CapabilityType.BROWSER_NAME,"Chrome");
		cap.setCapability("chromedriverExecutable", "C:\\Users\\GAKSHIRS\\eclipse-workspace\\ds_automobiles\\src\\test\\java\\driver1\\chromedriver.exe");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver(url, cap);
		Thread.sleep(2000);
		System.out.println("Application Started...");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(6000);
//		Set <String> context = driver.getContextHandles();
//		for (String contextname : context) {
//			System.out.println(contextname);
//		}
		driver.get(prop.getProperty("website"));
		Thread.sleep(3000);
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@text='English']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@text='Accept everything']")).click();
		Thread.sleep(3000);
		driver.context("CHROMIUM");
		Thread.sleep(3000);
		   
		  
		}

	public static void teardown() {
//		driver.quit();
		Browser.close();
	}
	public boolean isAttribtuePresent(WebElement element, String attribute) {
		Boolean result = false;
		try {
			String value = element.getAttribute(attribute);
			if (value != null){
				result = true;
			}
		} catch (Exception e) {}

		return result;
	}

	
	public void scrollToEndAction()
	{
		boolean canScrollMore;
	do {
	canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "down",
		    "percent", 3.0
		));
	} while (canScrollMore);
		
	}

	public static Double getFormattedAmount(String Amount){
		Double price= Double.parseDouble(Amount.substring(1));
		return price;
		
	}
	
	
	
	public void scrolltoText(String text) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
		
		
	}
	
	public static void LongPressAction(WebElement ele) {		
	     
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)ele ).getId(),"duration", 2000));
	
	}
	
	public List<HashMap<String,String>>getJsonData(String jsonfilepath) throws IOException{
		
		String jsoncontent = FileUtils.readFileToString(new File (jsonfilepath),StandardCharsets.UTF_8);
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String,String>> data = mapper.readValue(jsoncontent, new TypeReference<List<HashMap<String,String>>>(){});
		return data;
	}
	

	public static void getScreenshotpath() throws IOException {
		
		String ScreenshotName = new SimpleDateFormat("MMddmmssSSS").format(new Date());
		File source = driver.getScreenshotAs(OutputType.FILE);
		File screenshotName = new File("./screenshots/" + ScreenshotName + ".png");
		FileUtils.copyFile(source,  screenshotName);
		
	}
	


}
