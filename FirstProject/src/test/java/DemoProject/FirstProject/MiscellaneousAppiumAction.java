package DemoProject.FirstProject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MiscellaneousAppiumAction extends ApiDemosResource {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	          
			OpenApiDemoApp();
			driver.findElement(AppiumBy.accessibilityId("Preference")).click();
			driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
			driver.findElement(By.id("android:id/widget_frame")).click();
			
			//Rotation
			
			DeviceRotation landscape = new DeviceRotation(0, 0, 90);
	        driver.rotate(landscape);
		
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"WiFi settings\"]")).click();
			String AlertTitle =driver.findElement(By.id("android:id/alertTitle")).getText();
			Assert.assertEquals(AlertTitle,"WiFi settings");
			
			// copy paste
			//copy to clipboard- paste it 
			driver.setClipboardText("Wifi");
			driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
			
			//Key Actions
			driver.pressKey(new KeyEvent(AndroidKey.ENTER));
			Thread.sleep(3000);
			driver.findElements(By.className("android.widget.Button")).get(1).click();
			Thread.sleep(3000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(3000);
			driver.pressKey(new KeyEvent(AndroidKey.HOME));
			
			teardown();
			
	}

	
}
