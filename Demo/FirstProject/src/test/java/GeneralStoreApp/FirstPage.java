package GeneralStoreApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;

public class FirstPage extends ResourceFile{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		OpenGeneralStoreApp();
		Thread.sleep(2000);
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();	
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))"));
	    driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
		//driver.findElement(By.className("android.widget.EditText")).click();
		driver.findElement(By.className("android.widget.EditText")).sendKeys("Gayatri");
		//driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(2000);
//		ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Air Jordon 4 Retro']"));

		
//		String toastMessage = driver.findElement(By.xpath("//android.widget.Toast")).getAttribute("name");
//		System.out.println("Error Message is "+ toastMessage);
//		Assert.assertEquals(toastMessage, "Please enter your name");
//		
		teardown();
		
		

	}

	
	

}
