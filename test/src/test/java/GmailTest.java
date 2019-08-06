import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GmailTest {
    private static final Logger LOGGER = Logger.getLogger("GmailTest.class");
    @Test
    public void writtingTestInGmail(){
        LOGGER.info("GMAIL TEST LOGGER");
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
