package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = {"src/test/resources/AppFeatures/loginPage.feature"},//path of feature file
				glue = {"StepDefinition","AppHooks"},//To execute pre defined steps
				plugin = {"pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},//Reporting
				monochrome=true,//Clear console output
				tags = "@smokeTest"//Differentiate test suit
				)

public class Runner {

}
