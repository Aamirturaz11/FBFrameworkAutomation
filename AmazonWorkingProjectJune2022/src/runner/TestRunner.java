package runner;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;

@CucumberOptions(
features = "D:\\Framework\\AmazonWorkingProjectJune2022\\AmazonFeature\\", 
glue = { "com.selenium.StepsImplmention" }, 
dryRun = false,
monochrome = false,
strict = false,
plugin = { "pretty", "json:target/cucumber.json" },
tags = { "@FbinValidLogin4"}
)





public class TestRunner extends AbstractTestNGCucumberTests {

	
}
