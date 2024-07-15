package MobileBrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class MobileBrowserTest extends BaseTest {

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

}
