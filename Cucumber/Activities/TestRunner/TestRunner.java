package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
   features = "src/test/java/feautures",
        glue = {"StepDefinitions"},
        tags = "@FirstScenario"
)
public class TestRunner {
}
