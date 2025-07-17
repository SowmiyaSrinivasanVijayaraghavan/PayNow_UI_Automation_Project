package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "stepdefinitions",
    plugin = {"pretty",
            "html:target/cucumber-reports",
            "json:target/cucumber-json-reports/Cucumber.json",
            "junit:target/cucumber-xml-reports/Cucumber.xml"},
    monochrome = true
)

public class TestRunner {
}