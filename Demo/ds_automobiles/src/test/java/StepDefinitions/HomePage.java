package StepDefinitions;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.appiumproject.farmeworkdesign.pageobjects.DsModelPage;
//import org.appiumproject.farmeworkdesign.pageobjects.DsModelPage;
import org.appiumproject.farmeworkdesign.pageobjects.Firstpage;
import org.appiumproject.farmeworkdesign.utils.Resourcefile;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class HomePage  extends Resourcefile{
	Firstpage firstpage;
	DsModelPage DsModelPage;
	public HomePage() throws IOException {
		//		super();
		firstpage=new Firstpage();
		DsModelPage=new DsModelPage();
		// TODO Auto-generated constructor stub
	}


	@Given("DS website is open on Mobile")
	public void ds_website_is_open_on_mobile() throws Exception {

		OpenWebPage();
	}

	@Then("Click on Menu \\(top left) and verify DS MODELS, THE DS EXPERIENCE,BUY & RENT and YOUR DS options are available and clickable")
	public void click_on_menu_top_left_and_verify_ds_models_the_ds_experience_buy_rent_your_ds_options_are_available_and_clickable() throws Exception {

		firstpage.CheckMenuItemsPresent();	

	}

	@Then("Check Home page masthead is showing a MM Scroller \\(one image or several images) and user can see all MM")
	public void check_home_page_masthead_is_showing_a_mm_scroller_one_image_or_several_images_and_user_can_see_all_mm() throws Exception {


		firstpage.VerifyAllImagesPresent();

	}

	@Then("Click the menu items on the left corner of the home page")
	public void click_the_menu_items_on_the_left_corner_of_the_home_page() throws Exception {

//		firstpage.CheckMenuItemDirectedToPage();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div[2]/nav/div/section[1]/a/span/span")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[1]/div/aside/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[1]/div/aside/div/ul/li[2]/ul/li[4]/div/div/div/div[1]/div/ul/li[2]/a/span/font/font")).click();

		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[1]/div/div/a/i")).click();


		
	}

	@Then("Below the Masthead check the bodystyle selector is shown properly")
	public void below_the_masthead_check_the_bodystyle_selector_is_shown_properly() throws Exception {

		firstpage.CheckBodyStyleSelector();

	}

	@Then("Check MM paragraphs\\/items are properly displayed")
	public void check_mm_paragraphs_items_are_properly_displayed() {

		firstpage.MMParagrapghDisplayed();
	}

	@Then("Click on buttons\\/links available in Home page")
	public void click_on_buttons_links_available_in_home_page() {

		firstpage.LinksInHomepage();

	}

	@Then("Go to the bottom of the page and check Footer is displayed and links are also selectable")
	public void go_to_the_bottom_of_the_page_and_check_footer_is_displayed_and_links_are_also_selectable() throws Exception {

		firstpage.CheckFooterAndFooterlinks();
	}

	@Then("Go to left menu bar on Home Page and click on Modeles DS option")
	public void go_to_left_menu_bar_on_home_page_and_click_on_modeles_ds_option() throws Exception {

		DsModelPage.ClickDsModel();
	}


	@Then("^Select (.*) and click on it$")
	public void select_one_model_and_click_on_it(String model) throws Exception {
		DsModelPage.SelectModel(model);

	}

	@Then("Check masthead and footer are available for model overview page")
	public void check_masthead_and_footer_are_available_for_model_overview_page() {

		DsModelPage.CheckFooterInModelPage();

	}


}
