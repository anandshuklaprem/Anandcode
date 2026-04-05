package Com.cucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = "FeatureFileFolder",
glue="Com.Stepdefinetion",
plugin="html:./CucumberReport/report.html",
dryRun = false,
tags ="@DataDriven"
)
public class Runner extends AbstractTestNGCucumberTests {

	

}
