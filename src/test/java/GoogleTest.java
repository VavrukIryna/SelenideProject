import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {
    @Test
    public void checkSearchingWordAtGoogle(){
        open("http://google.com");
        $(By.name("q")).setValue("selenide").pressEnter();
        $$("#ires  .g" ).shouldHave(size(10));
        $("#ires .g").shouldHave(text("selenide.org"));
    }

    @Test
    public void writtingTestInGmail(){
        open("http://gmail.com");
        $(By.xpath("//*[@type ='email']]")).setValue("test.iryna.mail");
        $(By.xpath("//*[@type =\"password\"]]")).setValue("testmail");
        $(By.xpath("//*[@class = 'T-I J-J5-Ji T-I-KE L3']")).click();
        $(By.xpath("//*[@name = 'to']")).setValue("test.iryna.mail@gmail.com");
        $(By.xpath("//*[@name = 'subjectbox']")).setValue("mail subject");
        $(By.xpath("//*[@id = ':qb']")).setValue("mail text");
        $(By.xpath("//*[text() = 'Send']")).click();
        sleep(1000);
    }
}
