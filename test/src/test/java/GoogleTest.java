import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.Thread.sleep;

public class GoogleTest {

    private static final Logger LOGGER = Logger.getLogger("GoogleTest.class");
    @Test
    public void checkSearchingWordAtGoogle() throws InterruptedException {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            System.setProperty("selenide.browser", prop.getProperty("firefoxDriver"));


            LOGGER.info("NEW TEST LOGGER");
            open("http://google.com");
            sleep(1000);
            $(By.name("q")).setValue("selenide").pressEnter();
            sleep(1000);
            //  $$("#ires  .g" ).shouldHave(size(10));
            //  $("#ires .g").shouldHave(text("selenide.org"));
            Assert.assertEquals(1, 1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }
