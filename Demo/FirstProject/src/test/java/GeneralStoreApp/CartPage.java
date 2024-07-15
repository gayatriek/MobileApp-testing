package GeneralStoreApp;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class CartPage extends ResourceFile{

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
        driver.findElement(By.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']//following::android.widget.TextView[@text='ADD TO CART']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Air Jordan 1 Mid SE']//following::android.widget.TextView[@text='ADD TO CART']")).click();          	
        Thread.sleep(5000);
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	    Thread.sleep(5000);
	    
	    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text", "Cart"));
	    		
	    List<WebElement> ProductPrices = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
	    int count= ProductPrices.size();
	    double TotalSum = 0;
	    for(int i=0; i<count;i++) {
	    	
	        String AmountString= ProductPrices.get(i).getText();
	        Double price= getFormattedAmount(AmountString);
	        TotalSum = TotalSum + price;	    	
	    }
	    
	    String DisplaySum = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
	    Double displayFormattedSum = getFormattedAmount(DisplaySum);
	    Assert.assertEquals(TotalSum, displayFormattedSum);	    
		System.out.println("Amount Verified");	
		
		WebElement Element= driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
		LongPressAction(Element);
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.className("android.widget.CheckBox")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(5000);
	    
		Set <String> context = driver.getContextHandles();
		for (String contextname : context) {
			System.out.println(contextname);
		}
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.findElement(By.name("q")).sendKeys("appium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.context("NATIVE_APP");
		
		teardown();	
				
	}

	
	
}
