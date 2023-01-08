package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/src/test/java/cucumber/features",
		glue="StepDefination",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty"}
		)

public class Runner {
	//this class will be empty the code must be written outside of the class
}
