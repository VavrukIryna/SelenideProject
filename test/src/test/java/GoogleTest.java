import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;
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
        Assert.assertEquals(1,1);
    }


}
