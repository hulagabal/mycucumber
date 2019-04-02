package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "features", 
				glue = "stepDefenitions", 
				plugin = { "pretty","json:target/Destination/cucumber.json", "html:target/Destination" })
public class MyRunner extends AbstractTestNGCucumberTests {
}
