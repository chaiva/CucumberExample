package Runner;

import org.junit.runner.RunWith;

import com.fasterxml.jackson.annotation.JsonFormat;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\chaithra\\seleniumassignments\\CuucumberEx\\src\\main\\java\\Features\\Login.feature"
		,glue = {"step_Definition"},
		format = {"pretty","html:test-output"},
		monochrome = true,
		strict = true,
		dryRun = true
		)

public class TestRunner {

}
