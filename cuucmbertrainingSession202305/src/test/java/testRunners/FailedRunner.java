package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"target/failedRun.txt"},
		glue= {"stepDef","AppHooks"},
		plugin = {"pretty",
				"html:target/cucumberReport.html",
				"rerun:target/failedreRun.txt"
		},
		publish=true
		)
public class FailedRunner {

}
