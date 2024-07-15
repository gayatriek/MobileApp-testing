package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ChromeDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAKSHIRS\\Downloads\\New folder\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAKSHIRS\\eclipse-workspace\\Desktop_Application\\src\\driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAKSHIRS\\eclipse-workspace\\Desktop_Application\\src\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver =  new ChromeDriver();
		driver.get("https://stage2-www.dsautomobiles.be/fr/index.html");
		System.out.println(driver.getTitle());
		
		
		
	}

}
