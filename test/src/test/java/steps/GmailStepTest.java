package steps;

import BO.GmailBO;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class GmailStepTest {
    private static final Logger LOG = Logger.getLogger(GmailStepTest.class);
    private GmailBO gmailBO = new GmailBO();

    @Before
    public void beforeMethod() {
        LOG.info("BEFORE METHOD LOG");
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            System.setProperty("selenide.browser", prop.getProperty("driver"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void afterMethod() {
        LOG.info("AFTER METHOD LOG");
        WebDriverRunner.getWebDriver().quit();
    }

    @Given("^open gmail page$")
    public void openGmailPage() {
        LOG.info("GIVEN METHOD LOG");
        open("http://gmail.com");
    }

    @When("^user enter login \"([^\"]*)\"$")
    public void userEnterLogin(String login) {
        gmailBO.enterLogin(login);
    }

    @And("^user enter password \"([^\"]*)\"$")
    public void userEnterPassword(String password) {
        gmailBO.enterPassword(password);
    }

    @Then("^user login to gmail$")
    public void userLoginToGmail() {
        Assert.assertTrue(gmailBO.isUserLogin(), "user is not login to gmail");
    }

    @When("^user click to compose button$")
    public void userClickToComposeButton() {
        //todo add some staff
    }

    @Then("^new message Window is entered$")
    public void newMessageWindowIsEntered() {
        //todo add smth
    }
}
