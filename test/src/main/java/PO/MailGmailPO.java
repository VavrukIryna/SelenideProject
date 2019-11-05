package PO;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MailGmailPO {
    private SelenideElement composeButton = $(By.xpath("//*[@role ='button' and contains(text(), 'Compose')"));

    public boolean isComposeButtonExist() {
        composeButton.shouldBe(Condition.visible);
        return composeButton.exists();
    }
}
