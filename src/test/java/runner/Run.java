package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
			features = ".//testFetures",
			glue = {"stepDefinetion"},
			plugin = {"pretty", "html:target/cucumber-reports2.html"},
			tags = "@reg"
			
		)


public class Run {

}
