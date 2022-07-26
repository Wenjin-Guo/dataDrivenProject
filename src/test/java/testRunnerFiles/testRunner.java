package testRunnerFiles;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/dataDrivenFeatureFile"},
        glue = {"stepDefinitionFiles"},
        //tags = "@RegularTest",
        plugin = {"pretty","junit:target/reports/cucumber.xml",
                "json:target/reports/cucumber.json","html:target/reports"
        },
        monochrome = true
)
public class testRunner {



}
