package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPageobj {
	
	public WebDriver driver;
	
	By Search = By.xpath("//input[@type='search']");
	By offPrdname = By.cssSelector("tbody tr td:nth-child(1)");
	
	
	public OffersPageobj(WebDriver driver) {
		
		this.driver= driver;
		
	}
	
	public void searchtext(String name) {
		
		driver.findElement(Search).sendKeys(name);
		
	}

	public   String getoffertext() {
		
		return driver.findElement(offPrdname).getText();
	 
		
	}
	
	

}
	


