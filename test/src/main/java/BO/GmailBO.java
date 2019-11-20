package BO;

import core.PO.LoginGmailPO;
import core.PO.MailGmailPO;
import core.PO.PasswordGmailPO;

public class GmailBO {
    private LoginGmailPO loginPO = new LoginGmailPO();
    private PasswordGmailPO passwordGmailPO = new PasswordGmailPO();
    private MailGmailPO mailGmailPO = new MailGmailPO();

    public void enterLogin(String login) {
        loginPO.enterEmail(login);
        loginPO.clickNextButton();
    }

    public void enterPassword(String password) {
        passwordGmailPO.enterPassword(password);
        passwordGmailPO.clickNextButton();
    }

    public boolean isUserLogin() {
        return mailGmailPO.isComposeButtonExist();
    }
}
