package PO;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginGmailPO {
    private SelenideElement emailInputField = $(By.xpath("//*[@type ='email']"));
    private SelenideElement nextButton = $(By.xpath("//*[@id='identifierNext']"));

    public void clickNextButton() {
        nextButton.click();
    }

    public void enterEmail(String login) {
        emailInputField.setValue(login);
    }
}
