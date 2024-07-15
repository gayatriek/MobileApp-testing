package DemoProject.FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class AppiumChild extends AppiumParent {
	
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		 
			OpenCalculator();
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
			//((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)ele ).getId(),"duration", 2000));
			
			LongPressAction(ele);
			WebElement text= driver.findElement(By.id("com.oneplus.calculator:id/formula_container"));
			Assert.assertEquals(text, "copy");
			Assert.assertTrue(driver.findElement(By.id("com.oneplus.calculator:id/formula_container")).isDisplayed());
		    
		}
}


