package DesktopApplication.DesktopApplication;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAKSHIRS\\Downloads\\New folder\\chromedriver-win64\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAKSHIRS\\eclipse-workspace\\Desktop_Application\\src\\driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAKSHIRS\\eclipse-workspace\\Desktop_Application\\src\\driver\\chromedriver.exe");
	
		WebDriver driver = (WebDriver) new ChromeDriver();
//		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://stage2-www.dsautomobiles.be/fr/index.html");
		System.out.println(driver.getTitle());
		
			}

}
