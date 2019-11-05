package PO;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class GooglePO {
    private SelenideElement inputField = $(By.xpath("//*[@name ='q']"));
    private SelenideElement titleContext = $(By.xpath("//div[@id='search']//h3"));

    public void typeValue(String value) {
        inputField.setValue(value).pressEnter();
    }

    public String getTitle() {
        return titleContext.getText();
    }


}
