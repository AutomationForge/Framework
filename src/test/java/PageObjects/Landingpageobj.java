package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landingpageobj {
	
	public WebDriver driver;
	
	By Search = By.xpath("//input[@type='search']");
	By landPrdname = By.cssSelector("h4[class='product-name']");
	By Link =  By.linkText("Top Deals");
	
	public Landingpageobj(WebDriver driver) {
		
		this.driver= driver;
		
	}
	
	public void searchtext(String name) {
		
		driver.findElement(Search).sendKeys(name);
		
	}

	public   String getlandtext() {
		
		return driver.findElement(landPrdname).getText();
	 
		
	}
	
	public void dealspage() {
		
		driver.findElement(Link).click();

}

	public String getTitleLandingPage() {
		return driver.getTitle();
	}
	
}
