package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
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
        sleep(20000);
    }

    @When("^user enter login \"([^\"]*)\"$")
    public void userEnterLogin(String login){
        sleep(2000);
        $(By.xpath("//*[@type ='email']")).setValue(login);
        sleep(2000);
        $(By.xpath("//*[@id=\"identifierNext\"]")).click();
    }

    @Then("^login is entered$")
    public void loginIsEntered(){
        //todo check value
       Assert.assertTrue(true);
    }

    @When("^user enter password \"([^\"]*)\"$")
    public void userEnterPassword(String password){
        $(By.xpath("//input[@type ='password']")).setValue(password);
        $(By.xpath("//*[@id=\"passwordNext\"]")).click();
    }
    @Then("^password is entered$")
    public void passwordIsEntered(){
        //todo add asserts
    }
    @And("^user login to gmail$")
    public void userLoginToGmail(){
        //todo add asserts
    }
    @When  ("^user click to compose button$")
    public void userClickToComposeButton(){
        //todo add some staff
    }

    @Then ("^new message Window is entered$")
    public void   newMessageWindowIsEntered(){
        //todo add smth
    }
}
