package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "html:target/cucumber/report.html" },

		features = { "src/test/java/features" }, glue = { "steps" }

)
public class TestRunner extends AbstractTestNGCucumberTests {

}
