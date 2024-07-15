package DemoProject.FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;

public class DragandDrop extends ApiDemosResource{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		OpenApiDemoApp();
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement element = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "endX", 712,
			    "endY", 671
			));
		Assert.assertEquals((((RemoteWebElement) driver.findElement(By.id("io.appium.android.apis:id/drag_result_text"))).getText()), "Dropped!");
		teardown();

	}

}
