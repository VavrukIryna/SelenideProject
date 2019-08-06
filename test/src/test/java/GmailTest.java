import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.WebDriverRunner;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import static com.codeborne.selenide.Browsers.FIREFOX;
import static com.codeborne.selenide.Selenide.*;

public class GmailTest {

    private static final Logger LOGGER = Logger.getLogger("GmailTest.class");

    @Test
    public void writtingTestInGmail() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            System.setProperty("selenide.browser", prop.getProperty("chromeDriver"));

            LOGGER.info("GMAIL TEST LOGGER");
            open("http://gmail.com");
            sleep(1000);
            $(By.xpath("//*[@type ='email']]")).setValue("test.iryna.mail");
            $(By.xpath("//*[@type =\"password\"]]")).setValue("testmail");
            $(By.xpath("//*[@class = 'T-I J-J5-Ji T-I-KE L3']")).click();
            $(By.xpath("//*[@name = 'to']")).setValue("test.iryna.mail@gmail.com");
            $(By.xpath("//*[@name = 'subjectbox']")).setValue("mail subject");
            $(By.xpath("//*[@id = ':qb']")).setValue("mail text");
            $(By.xpath("//*[text() = 'Send']")).click();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
