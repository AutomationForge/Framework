package Cucumberrunner;

import org.testng.TestNG;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features",glue="StepDefinitions",monochrome=true,dryRun=false
)
public class TestRunner extends AbstractTestNGCucumberTests {
	

}

