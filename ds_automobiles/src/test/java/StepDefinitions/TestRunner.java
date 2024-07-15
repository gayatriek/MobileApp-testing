package StepDefinitions;



import org.junit.runner.RunWith;

import io.cucumber.core.backend.CucumberBackendException;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features",
glue= {"StepDefinitions"}, 
monochrome= true,
plugin={"pretty","junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
"html:target/HTMLReports/report.html"},
tags="@smoketest")


public class TestRunner {

}
