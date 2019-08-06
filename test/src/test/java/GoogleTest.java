import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.Thread.sleep;

public class GoogleTest {

    private static final Logger LOGGER = Logger.getLogger("GoogleTest.class");
    @Test
    public void checkSearchingWordAtGoogle(){
        LOGGER.info("NEW TEST LOGGER");
        open("http://google.com");
        $(By.name("q")).setValue("selenide").pressEnter();
      //  $$("#ires  .g" ).shouldHave(size(10));
      //  $("#ires .g").shouldHave(text("selenide.org"));
    }

    @Test
    public void writtingTestInGmail(){
        LOGGER.info("TEST STARTED LOGGER");
        open("http://gmail.com");
        $(By.xpath("//*[@type ='email']]")).setValue("test.iryna.mail");
        $(By.xpath("//*[@type =\"password\"]]")).setValue("testmail");
        $(By.xpath("//*[@class = 'T-I J-J5-Ji T-I-KE L3']")).click();
        $(By.xpath("//*[@name = 'to']")).setValue("test.iryna.mail@gmail.com");
        $(By.xpath("//*[@name = 'subjectbox']")).setValue("mail subject");
        $(By.xpath("//*[@id = ':qb']")).setValue("mail text");
        $(By.xpath("//*[text() = 'Send']")).click();

    }
}
