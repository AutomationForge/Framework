package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageobjectManager;



public class TextContextsetup {
	
	public String landingprdname;
	
	public WebDriver driver;
	public PageobjectManager pageobjectManager;
	public Genericcode genericcode;
	public Basetest basetest;
	
	public TextContextsetup() throws IOException  {
		{
			
			 basetest = new Basetest();
			
				pageobjectManager = new PageobjectManager(basetest.WebDrivermanager()) ;
		
			 genericcode =  new Genericcode(basetest.WebDrivermanager());
		}
	} 
	
}
