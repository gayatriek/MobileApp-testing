package org.appiumproject.farmeworkdesign.pageobjects;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.appiumproject.farmeworkdesign.utils.Resourcefile;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class Firstpage extends Resourcefile {

	Resourcefile resourcefile;
	public Firstpage() throws IOException{

		PageFactory.initElements(driver, this);		
		resourcefile = new Resourcefile();
	}
	//	
	@FindBy(xpath="//*[@class='has-submenu js-has-submenu  off-canvas-list__item  ']/a/span/font/font")
	List<WebElement> MenuItems;

	//	@FindBy(className ="q-hamburger__inner")
	@FindBy(xpath="//a[@data-gtm-event-label='Menu']")
	WebElement  Menubutton;

	@FindBy(xpath="//i[@class='icon icon-close']//parent::a[@class='q-close-primary-nav']")
	WebElement closemenu;

	@FindBy(xpath="//*[@class='q-mod q-mod-analytics js-slider-control']")
	List<WebElement> images;

	@FindBy(xpath = "//*[@class='q-offcanvas-header omni-enabled-offcanvas animate-in show']//following::span[@class='offcanvas-header back']//following::font//font//font//child::font")
	WebElement  PageTitle;

	@FindBy(xpath ="//span[@class='offcanvas-header back']//i[@class='icon icon-back']")
	WebElement  BackToMenu;

	@FindBy(xpath ="(//button[@class='q-mod q-mod-analytics js-slider-control'])[5]")
	WebElement  FirstSlider;

	@FindBy(xpath ="(//i[@class='icon icon-slider-next'])[1]")
	WebElement  NextArrow;

	@FindBy(xpath ="(//div[@class='model_slider__bottom-content'])[1]")
	WebElement  BodyStyleSelector1;

	@FindBy(xpath ="(//div[@class='model_slider__bottom-content'])[2]")
	WebElement  BodyStyleSelector2;

	@FindBy(xpath ="//div[@class='model_slider__bottom-content'])[3]")
	WebElement  BodyStyleSelector3;

	@FindBy(xpath ="//div[@class='model_slider__bottom-content'])[4]")
	WebElement  BodyStyleSelector4;

//
//	@FindBy(xpath="//div[@class='headline_text_v2 headline_text aem-GridColumn aem-GridColumn--default--12']")
//	List<WebElement>  paragraphElements1;
//
//	@FindBy(xpath="//div[@class='ht-content q-ht-paragraph flex-item q-rte-container']")
//	List<WebElement>  paragraphElements2;

	@FindBy(tagName = "a")
	List<WebElement> AllLinks;

//	@FindBy(tagName = "footer")
//	WebElement footer;
//
//	@FindBy(xpath = "//footer//a")
//	List<WebElement> footerlinks;


	public void CheckMenuItemsPresent() throws Exception {
//		Thread.sleep(6000);
//		Menubutton.click();
//		driver.findElement(By.xpath("//a[@data-gtm-event-label='Menu']")).click();
//		Thread.sleep(3000);
//		
//		String[] expected = {"DS MODELS", "THE DS EXPERIENCE", "BUY & RENT", "YOUR DS"};		
//		Thread.sleep(3000);
//		for (int i = 0; i < expected.length; i++) {
//			String optionValue = MenuItems.get(i).getText();
//			if (optionValue.equals(expected[i])) {
//				ExpectedConditions.elementToBeClickable(MenuItems.get(i));
//				System.out.println(expected[i] + " is available and clickable");	        
//			} else {
//				System.out.println(expected[i] + " is not available and clickable");
//			}
//		}
//		Thread.sleep(3000);
//		closemenu.click();
//		Thread.sleep(5000);
		
		Thread.sleep(3000);
		driver.findElement(By.className("q-hamburger__inner")).click();	
		Resourcefile.getScreenshotpath();	
		Thread.sleep(3000);
		String[] expected = {"DS MODELS", "THE DS EXPERIENCE", "BUY & RENT", "YOUR DS"};
		List<WebElement> allOptions = driver.findElements(By.xpath("//*[@class='has-submenu js-has-submenu  off-canvas-list__item  ']/a/span/font/font"));	
		Thread.sleep(3000);

		for (int i = 0; i < expected.length; i++) {
			String optionValue = allOptions.get(i).getText();
			if (optionValue.equals(expected[i])) {
				ExpectedConditions.elementToBeClickable(allOptions.get(i));
				System.out.println(optionValue + " is available and clickable");	        

			} else {
				System.out.println(optionValue + " is not available and clickable");
			}
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='icon icon-close']//parent::a[@class='q-close-primary-nav']")).click();
		Thread.sleep(5000);
		Resourcefile.getScreenshotpath();
		
	}

	public void VerifyAllImagesPresent() throws Exception {
//		for (int i = 0; i < 8; i++) {
//			WebElement image = images.get(i);		 
//			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", image);		    
//			Thread.sleep(5000);		    
//			Boolean checked = isAttribtuePresent(image, "aria-current");		    
//			if (checked) {
//				System.out.println("Image"+ i+" is already opened");
//			}
//			else {
//				((JavascriptExecutor) driver).executeScript("arguments[0].click();", image);
//				Thread.sleep(3000);
//				System.out.println("Image "+ i+" is verified");
//				Thread.sleep(5000);
//			}
//		}
		
		List<WebElement> images= driver.findElements(By.xpath("//*[@class='q-mod q-mod-analytics js-slider-control']"));
		for (int i = 0; i < 8; i++) {
			WebElement image = images.get(i);		 
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", image);		    
			Thread.sleep(5000);		    
			Boolean checked = isAttribtuePresent(image, "aria-current");		    
			if (checked) {
				System.out.println("image already opened");
			}
			else {
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", image);
				Thread.sleep(3000);
				//		    image.click();
				Resourcefile.getScreenshotpath();
				System.out.println(i +"image is verified");

				Thread.sleep(5000);
			}
		}
		
		
	}


	public void CheckMenuItemDirectedToPage() throws Exception {
//		Thread.sleep(3000);
//		Menubutton.click();
//		Thread.sleep(3000);
//		String[] expected = {"DS MODELS", "THE DS EXPERIENCE", "BUY & RENT", "YOUR DS"};
//		Thread.sleep(3000);
//		for (int i = 0; i < expected.length; i++) {
//			MenuItems.get(i).click();
//			Thread.sleep(3000);
//			String PageName= PageTitle.getText();
//			if(PageName.equals(expected[i])) {
//				System.out.println(PageName + " Page is open");
//			}
//			else {
//				System.out.println(PageName + " Page is not open");
//			}
//			Thread.sleep(3000);
//			BackToMenu.click();
//			Thread.sleep(3000);
//		}
//		closemenu.click();
//		Thread.sleep(15000);
		
		Thread.sleep(3000);
		driver.findElement(By.className("q-hamburger__inner")).click();
		Thread.sleep(3000);
		String[] expected = {"DS MODELS", "THE DS EXPERIENCE", "BUY & TO RENT OUT", "YOUR DS"};
		List<WebElement> allOptions = driver.findElements(By.xpath("//*[@class='has-submenu js-has-submenu  off-canvas-list__item  ']/a/span/font/font"));	
		Thread.sleep(3000);

		for (int i = 0; i < expected.length; i++) {

			allOptions.get(i).click();
			Thread.sleep(3000);
			WebElement Page =driver.findElement(By.xpath("//*[@class='q-offcanvas-header omni-enabled-offcanvas animate-in show']//following::span[@class='offcanvas-header back']//following::font//font//font//child::font"));
//			WebElement Page =driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/span/a/font/font/font"));
			String PageName= Page.getText();
			if(PageName.equals(expected[i])) {
				System.out.println(PageName + " Page is open");
				Resourcefile.getScreenshotpath();
			}
			else {
				System.out.println(PageName + " Page is not open");
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@class='offcanvas-header back']//i[@class='icon icon-back']")).click();
			Thread.sleep(3000);
		}
		driver.findElement(By.xpath("//i[@class='icon icon-close']//parent::a[@class='q-close-primary-nav']")).click();
		Thread.sleep(5000);
		
		
	}





	public void CheckBodyStyleSelector() throws Exception {

		FirstSlider.click();		
		Thread.sleep(3000);
		Resourcefile.getScreenshotpath();
		Assert.assertTrue(BodyStyleSelector1.isDisplayed());		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", NextArrow);
		Thread.sleep(3000);
		Resourcefile.getScreenshotpath();
		Assert.assertTrue(BodyStyleSelector2.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", NextArrow);
		Thread.sleep(3000);	
		Resourcefile.getScreenshotpath();
		Assert.assertTrue(BodyStyleSelector3.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", NextArrow);
		Thread.sleep(3000);
		Resourcefile.getScreenshotpath();
		Assert.assertTrue(BodyStyleSelector4.isDisplayed());		
	}


	public void MMParagrapghDisplayed() {

		List<WebElement> paragraphElements1 = driver.findElements(By.xpath("//div[@class='headline_text_v2 headline_text aem-GridColumn aem-GridColumn--default--12']"));
//		@FindBy(xpath="//div[@class='headline_text_v2 headline_text aem-GridColumn aem-GridColumn--default--12']")
//		List<WebElement>  paragraphElements1;
		List<WebElement> paragraphElements2 = driver.findElements(By.xpath("//div[@class='ht-content q-ht-paragraph flex-item q-rte-container']"));
	
		int index1 = 0;		
		while (index1 < paragraphElements1.size()) {
			paragraphElements1.get(index1).isDisplayed();
			WebElement paragraph = paragraphElements1.get(index1);
//			System.out.println(paragraph.getText());
			index1++;
		}
		int index2=0;
		while (index2 < paragraphElements2.size()) {
			paragraphElements2.get(index2).isDisplayed();
			WebElement paragraph2 = paragraphElements2.get(index2);
//			System.out.println(paragraph2.getText());
			index2++;
		}

	}

	public void LinksInHomepage() {

		List<WebElement> links = driver.findElements(By.xpath("//*[@tagName='a']"));
		for(int i=0; i<links.size();i++) {		
			ExpectedConditions.elementToBeClickable(AllLinks.get(i));		
		}	
	}


	public void CheckFooterAndFooterlinks() throws Exception{
		
		
		
		
		List<WebElement> footer = driver.findElements(By.xpath("//*[@tagName='footer']"));
		List<WebElement> footerlinks = driver.findElements(By.xpath("//footer//a"));
		
//		@FindBy(tagName = "footer")
//		WebElement footer;

//		@FindBy(xpath = "//footer//a")
//		List<WebElement> footerlinks;

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", footer);
		boolean isFooterDisplayed = ((WebElement) footer).isDisplayed();
		System.out.println("Is the footer displayed?" + isFooterDisplayed);
		Resourcefile.getScreenshotpath();
		for(int i=0; i<footerlinks.size();i++) {		
			boolean islinkSelectable = footerlinks.get(i).isEnabled();
			System.out.println("Link " + i +" "+ footerlinks.get(i).getText() +" is selectable: " + islinkSelectable);
			ExpectedConditions.elementToBeClickable(footerlinks.get(i));		
//		}
	}
}}
















