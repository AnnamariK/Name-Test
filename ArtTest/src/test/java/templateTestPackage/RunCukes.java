package templateTestPackage;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"	},features="src/test/resources/",
tags="@SSEtest")


public class RunCukes {
//Added from Github

}
