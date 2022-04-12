package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features= {"source\\test\\resources\\appfeatures\\Search.feature"},
			glue= {"searchdefinition","MyHooks"},
			//tags = "@All",
			plugin={"pretty",
					"json:target/Myreport/report.json",
					"junit:target/Myreport/report.xml"},
			dryRun = false,
			monochrome = true,
			publish = true
)
public class UberTestRunner {

}
