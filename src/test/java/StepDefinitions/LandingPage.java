package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import PageObjects.Landingpageobj;
import Utils.Basetest;
import Utils.TextContextsetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPage {
	public String offerPageProductName;
	public String landingprdname;
	public WebDriver driver;
	TextContextsetup textContextsetup;
	Landingpageobj landingpageobj;
	
	public LandingPage(TextContextsetup textContextsetup) {
		
		this.textContextsetup = textContextsetup;
		this.landingpageobj =textContextsetup.pageobjectManager.landingpagemanager();
	}
	
	
	@Given("user is on landing page")
	public void user_is_on_landing_page() {
		
		Assert.assertTrue(landingpageobj.getTitleLandingPage().contains("GreenKart"));

		System.out.println("Correct Title Displayed as "+ "GreenKart");
		
	}
	
	@When("^user search the (.+) shortname in landing page and extract the product name$")
	public void user_search_the_shortname_in_landing_page_and_extract_the_product_name(String shortname) throws InterruptedException {
		
		Landingpageobj landingpageobj = textContextsetup.pageobjectManager.landingpagemanager();
		
		landingpageobj.searchtext(shortname);
		
		
		Thread.sleep(2000);
	 landingprdname= landingpageobj.getlandtext().split("-")[0].trim();
	Thread.sleep(2000);
		System.out.println("Extracted landprod name is " + landingprdname);
		
		System.out.println("Test Case is Done");
		System.out.println("Received Output");
		System.out.println("Received Output");
		System.out.println("Received Output");
	}
	

	

}
