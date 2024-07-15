package GeneralStoreApp;





import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;

public class AddProducttoCart extends ResourceFile{

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
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"))"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@text='Jordan 6 Rings']//following::android.widget.TextView[@text='ADD TO CART']")).click();
        
        
        
//        int productcount = driver.findElements(By.id("com.androidsample.generalstore:id/productImage")).size();               
//        for (int i=0; i<productcount; i++) {      	
//        	String productname = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
//        	if(productname.equalsIgnoreCase("Jordan 6 Rings")) 
//        	{
//        		driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
//        	}       	
//        }
           	
        Thread.sleep(5000);
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	    Thread.sleep(5000);
	    
	    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text", "Cart"));
	    		
	    
	    
		String product= driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
		Assert.assertEquals(product, "Jordan 6 Rings");
		System.out.println("Product Added Successfully");
		
		
		teardown();
		
		
		
		
		
		
		
	}

}
