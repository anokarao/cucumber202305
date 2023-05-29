package testRunners;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/AppFeatures"},
glue= {"stepDef","AppHooks"},
plugin = {"pretty",
		"html:target/cucumberReport.html",
		"rerun:target/failedRun.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-out-thread/"
},
publish=true)
public class parallelRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
