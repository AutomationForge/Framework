package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Basetest {
	
	public WebDriver driver;
	
	public WebDriver WebDrivermanager() throws IOException {
		

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String URL= prop.getProperty("url");

		
		 if(driver==null) {
			 
			 if (prop.getProperty("browser").equalsIgnoreCase("chrome"))
			 {	 
	       System.setProperty("Webdriver.chrome.driver","System.getProperty(\"user.dir\")+\"//src//test//resources//chromedriver.exe");
	       driver = new ChromeDriver();
	
			 }
			 
			 if (prop.getProperty("browser").equalsIgnoreCase("edge"))
			 {	 
				 driver = new EdgeDriver();
			 }
			 if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
			 {	 
				 driver = new FirefoxDriver();
			 }
			 driver.get(URL);
	}
		
	
	return driver;
}
	
}