package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Utils.Basetest;
import Utils.TextContextsetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class hooks {
	TextContextsetup textContextsetup;
	
	public hooks(TextContextsetup textContextsetup)
	{
		
		this.textContextsetup = textContextsetup;
		System.out.println("This is textcontextsetup");
	}
	@After
	public void AfterScenario() throws IOException
	{
		textContextsetup.basetest.WebDrivermanager().quit();
		System.out.println("AfterScenario");
		
	}
}
	

