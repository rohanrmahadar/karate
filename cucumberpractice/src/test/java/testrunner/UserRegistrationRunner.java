package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"source\\test\\resources\\appfeatures\\registration.feature"},
		glue= {"searchdefinition"},
		plugin={"pretty"},
		monochrome = true,
		publish = true
		)
public class UserRegistrationRunner {

}
