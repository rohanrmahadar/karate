
package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "source\\test\\resources\\appfeatures\\Search.feature" },
	glue = { "searchdefinition" ,"MyHooks"}, 
	plugin = {"pretty"},
	monochrome = true,
	dryRun = false
)
public class AmazonRunner {

}
