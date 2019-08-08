package steps;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GooglelStepTest {
    private static final Logger LOG = Logger.getLogger(GooglelStepTest.class);

    @Before
    public void beforeMethod() {
        LOG.info("BEFORE METHOD CHROME LOG");
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            System.setProperty("selenide.browser", prop.getProperty("chromeDriver"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void afterMethod(){
        LOG.info("AFTER METHOD CHROME LOG");
        WebDriverRunner.getWebDriver().quit();
    }

    @Given("^open google page$")
    public void openGooglePage() {
        LOG.info("GIVEN METHOD GOOGLE LOG");
        open("http://google.com");


    }

    @When("^user enter value \"([^\"]*)\"$")
    public void userEnterValue(String value){
         $(By.xpath("//*[@name ='q']")).setValue(value).pressEnter();

    }

    @Then("^search is made$")
    public void searchIsMade(){
        //todo check value
       Assert.assertTrue(true);
    }

}
