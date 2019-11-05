package PO;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PasswordGmailPO {
    private SelenideElement passwordInputField = $(By.xpath("//input[@type ='password']"));
    private SelenideElement nextButton = $(By.xpath("//*[@id='passwordNext']"));

    public void clickNextButton() {
        nextButton.click();
    }

    public void enterPassword(String password) {
        passwordInputField.setValue(password);
    }
}
