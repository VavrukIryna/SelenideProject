package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class GmailStepTest {
    private static final Logger LOG = Logger.getLogger(GmailStepTest.class);

    @BeforeMethod
    public void beforeMethod() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            System.setProperty("selenide.browser", prop.getProperty("chromeDriver"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Given("^open gmail page$")
    public void openGmailPage() {
        open("http://gmail.com");
       // Assert.assertEquals(title().toLowerCase(), "gmail.com");
    }
    @When("^user enter login \"([^\"]*)\"$")
    public void userEnterLogin(String login){
        $(By.xpath("//input[@type ='email']]")).setValue(login);
        $(By.xpath("//*[text() ='Next']]")).click();
    }

    @Then("^login is entered$")
    public void loginIsEntered(){
        //todo check value
       Assert.assertTrue(true);
    }

    @When("^user enter password \"([^\"]*)\"$")
    public void userEnterPassword(String password){
        $(By.xpath("//input[@type ='password']]")).setValue(password);
        $(By.xpath("//*[text() ='Next']]")).click();
    }
    @Then("^password is entered$")
    public void passwordIsEntered(){
        //todo add asserts
    }

}
