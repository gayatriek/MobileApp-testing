package DemoProject.FirstProject;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;

public class PopupsandTextEnter extends ApiDemosResource {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
           
		OpenApiDemoApp();
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		driver.findElement(By.id("android:id/widget_frame")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"WiFi settings\"]")).click();
		String AlertTitle =driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(AlertTitle,"WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("Wifi");
		driver.findElements(By.className("android.widget.Button")).get(1).click();
		
		teardown();
		
		
		
		
		
	}

}
