package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = {"src/test/resources/AppFeatures/login.feature"},
				glue = {"StepDefinition","AppHooks"},
				plugin = {"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.html"
				},
				publish=true
				)

public class Runner2 {

}
