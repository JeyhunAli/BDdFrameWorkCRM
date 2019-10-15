package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

     @CucumberOptions(
    		 
    		 features = "Feature",
    		 glue = {"stepdefinition"},
    	   format= {"pretty","html:test-outout"}
)
public class TestRunner extends AbstractTestNGCucumberTests{

}
