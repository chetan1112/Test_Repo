package CucumberPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\91899\\OneDrive\\Desktop\\Trial\\Trial1\\src\\main\\java\\CucumberPackage\\a.feature",
		glue= {"cucumberPackage"},
		dryRun = false,
		monochrome = true
		)

public class Runner {
	

}
