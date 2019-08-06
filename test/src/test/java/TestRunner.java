import cucumber.api.CucumberOptions;


import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.testng.CucumberFeatureWrapper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources",
        glue = {"steps"},
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "rerun:target/cucumber-reports/rerun.txt"
        })
public class TestRunner {
}
