package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features= {"source\\test\\resources\\appfeatures\\Orders.feature"},
			glue= {"searchdefinition"},
			plugin={"pretty"}
)
public class OrderRunner {

}
