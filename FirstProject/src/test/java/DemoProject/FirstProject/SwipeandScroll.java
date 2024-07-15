package DemoProject.FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;


import io.appium.java_client.AppiumBy;

public class SwipeandScroll extends ApiDemosResource{

	

	public static void main (String[] args) throws Exception {
	
	OpenApiDemoApp();
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	
	//scrolldown by text
	
	//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
	
	//scroll by value
	boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "down",
		    "percent", 3.0
		));
	
	//Scroll till last by do while loop
//	boolean canScrollMore;
//	do {
//	canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//		    "left", 100, "top", 100, "width", 200, "height", 200,
//		    "direction", "down",
//		    "percent", 3.0
//		));
//	} while (canScrollMore);
	
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc ='Gallery']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc ='1. Photos']")).click();
	
	WebElement FirstImage= driver.findElement(By.xpath("//android.widget.ImageView[1]"));
	
	//Swipe
	Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[1]")).getAttribute("focusable"), "true");
	Thread.sleep(3000);
	SwipeAction(FirstImage, "left");
	Thread.sleep(3000);
	Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[1]")).getAttribute("focusable"), "false");
	Thread.sleep(3000);
	WebElement SecondImage= driver.findElement (By.xpath("//android.widget.ImageView[2]"));
	Thread.sleep(3000);
    Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[2]")).getAttribute("focusable"), "true");
    Thread.sleep(3000);
	SwipeAction(SecondImage, "left");	
	Thread.sleep(3000);
	Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[2]")).getAttribute("focusable"), "false");	
	Thread.sleep(3000);
	Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[3]")).getAttribute("focusable"), "true");
	Thread.sleep(3000);
    WebElement ThirdImage= driver.findElement (By.xpath("//android.widget.ImageView[3]"));
    Thread.sleep(3000);
	SwipeAction(ThirdImage, "left");	
	Thread.sleep(3000);
	Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[3]")).getAttribute("focusable"), "false");	
	Thread.sleep(3000);
	Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[4]")).getAttribute("focusable"), "true");
	Thread.sleep(3000);
	WebElement FourthImage= driver.findElement (By.xpath("//android.widget.ImageView[4]"));
    Thread.sleep(3000);
	SwipeAction(FourthImage, "left");	
	Thread.sleep(3000);
	Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[4]")).getAttribute("focusable"), "false");	
	Thread.sleep(3000);
	Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[5]")).getAttribute("focusable"), "true");
	Thread.sleep(3000);
	WebElement FifthImage= driver.findElement (By.xpath("//android.widget.ImageView[5]"));
    
    

    Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[5]")).getAttribute("focusable"), "true");
	((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
		    "elementId", (((RemoteWebElement) FifthImage).getId()),
		    "direction", "right",
		    "percent", 0.75
		));
	Thread.sleep(5000);
	Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[5]")).getAttribute("focusable"), "false");	
	Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[6]")).getAttribute("focusable"), "true");
	System.out.println("Swipe action to right and left done successfully");
	
	
	}
}
