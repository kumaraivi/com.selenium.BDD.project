package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(plugin = {"html:target/cucumber.html", "json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenarios.txt"}, 
        features = "src/test/resource/FeatureFile",
        monochrome = true, 
        dryRun = false,
        glue = {"stepDef" }, 
        tags ="@Sanity")

public class Runner_test extends AbstractTestNGCucumberTests {

	


}
