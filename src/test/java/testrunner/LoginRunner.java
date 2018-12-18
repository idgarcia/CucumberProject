package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Iris Garcia\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\features"
, glue= {"stepsDefinition"}
,tags= {"@Regression"}
,monochrome=true// cleans up the report 
, plugin= {"pretty", "html:test-output"}// "Pretty" creates the test-output folder and html report in that folder
,dryRun=false
)
public class LoginRunner {
	
	

}
