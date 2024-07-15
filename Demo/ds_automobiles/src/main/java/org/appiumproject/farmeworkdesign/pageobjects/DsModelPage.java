package org.appiumproject.farmeworkdesign.pageobjects;

import java.io.IOException;
import java.util.List;

import org.appiumproject.farmeworkdesign.utils.Resourcefile;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;



public class DsModelPage extends Resourcefile {

	public DsModelPage() throws IOException{

		PageFactory.initElements(driver, this);		
	}

	@FindBy(className = "q-hamburger__inner")
	 WebElement  Menubutton;
	
	@FindBy(xpath="/html/body/div[2]/div/aside/div/ul/li[2]/a/span/font/font")
	 WebElement  DSOption;
	
	@FindBy(xpath = "//ul[@class='inline-list q-content-container q-nav-segment-list']")
	 WebElement  flyout;
	
	@FindBy(xpath="/html/body/div[2]/div/aside/div/ul/li[2]/ul/li[4]/div/div/div/div[1]/div/ul/li[1]/a/span/font/font")
	 WebElement OurModel;

	@FindBy(xpath="//*[@id='flyout-nav']/div")
	List<WebElement> SelectModel;
	
	
	@FindBy(xpath = "//*[@class='q-multimedia-overlay__content is-visible']")
	 WebElement  modelpage;
	
	@FindBy(tagName = "footer" )
	 WebElement  footer;
	
	public void ClickDsModel() throws Exception {
//		Menubutton.click();
//		DSOption.click();
//		flyout.isDisplayed();
//		
		driver.findElement(By.className("q-hamburger__inner")).click();	
		driver.findElement(By.xpath("/html/body/div[2]/div/aside/div/ul/li[2]/a/span/font/font")).click();
		Thread.sleep(3000);
		
	}	
	

		public void SelectModel(String model) throws Exception {
//		OurModel.click();
//		Thread.sleep(3000);
//		SelectModel.get(i).click();
		Thread.sleep(3000);		
		driver.findElement(By.xpath("/html/body/div[2]/div/aside/div/ul/li[2]/ul/li[4]/div/div/div/div[1]/div/ul/li[1]/a/span/font/font")).click();
		Thread.sleep(3000);	
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath("//a[@data-gtm-event-label='"+model+"']")));
		driver.findElement(By.xpath("//a[@data-gtm-event-label='"+model+"']")).click();
		Thread.sleep(3000);
	}	

	public void CheckFooterInModelPage() {
		modelpage.isDisplayed();	
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", footer);
		boolean isFooterDisplayed = footer.isDisplayed();
		System.out.println("Is the footer displayed?" + isFooterDisplayed);
	}	
}


