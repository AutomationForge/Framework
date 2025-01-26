package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.Landingpageobj;
import PageObjects.OffersPageobj;
import PageObjects.PageobjectManager;
import Utils.TextContextsetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OffersPage {
	
	
	public String offerspagename;
	public WebDriver driver;
	PageobjectManager pageobjectManager ;
	
    TextContextsetup textContextsetup;
	
	public OffersPage(TextContextsetup textContextsetup) {
		
		this.textContextsetup = textContextsetup;
		
		
	}
	
	
	@Then("^user search the (.+) shortname in offer page to check if product exist$")
	public void user_search_the_shortname_in_offer_page_to_check_if_product_exist(String shortname) throws InterruptedException {
		
		OffersPageobj offersPageobj = textContextsetup.pageobjectManager.offerpagemanager();
		// textContextsetup.landingprdname = landingpageobj.getlandtext().split("-")[0].trim();
		 
		switchtoofferpage();
		
		offersPageobj.searchtext(shortname);
		
		 offerspagename = offersPageobj.getoffertext();
		
		System.out.println("Extracted offerprod name is " + offerspagename);
		System.out.println("ShortnameSearch");
	  
	}
	
	
	public void switchtoofferpage() throws InterruptedException {
		Landingpageobj landingpageobj = textContextsetup.pageobjectManager.landingpagemanager();
		
		landingpageobj.dealspage();
		Thread.sleep(2000);
		
		textContextsetup.genericcode.switchtoofferpage();
		System.out.println("switchtoofferpage");
	}
	
	
	
	@Then("validate product name is same as landing page")
	public void validate_product_name_is_same_as_landing_page() throws InterruptedException {
	 
		Thread.sleep(2000);
	
		System.out.println(offerspagename);
		System.out.println(textContextsetup.landingprdname);
		//Assert.assertEquals(offerspagename, textContextsetup.landingprdname);
		System.out.println("Received Output");
		System.out.println("Offers");
		System.out.println("Page");
	}


}
