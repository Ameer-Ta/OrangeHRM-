package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C://Users//thasleem//eclipse-workspace//orangeHRMproject//Features//OrangeHrM.feature",
		glue="StepDefinitions",
		dryRun = true ,
		monochrome = true ,
		plugin = {"pretty"}
		)

public class testrunner {

}
