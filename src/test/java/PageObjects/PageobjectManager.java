package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageobjectManager {
	
	public WebDriver driver;
	public Landingpageobj landingpageobj;
	public OffersPageobj offersPageobj ;
	
	
	public PageobjectManager(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public Landingpageobj landingpagemanager() {
		
		  landingpageobj = new Landingpageobj(driver);
		 return landingpageobj;
		
		
	}
	
	
public OffersPageobj offerpagemanager() {
		
	 offersPageobj = new OffersPageobj(driver);
	
	 return offersPageobj;
		 
	}
	
	
}
