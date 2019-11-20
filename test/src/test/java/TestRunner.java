import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/feature",
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber"}
)
public class TestRunner extends AbstractTestNGCucumberTests {}