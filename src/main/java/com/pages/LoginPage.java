package com.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    private SelenideElement passwordField;
    private SelenideElement loginSubmitBtn;
    private SelenideElement userNameField;
    private SelenideElement registerBtn;

    public LoginPage() {
        this.userNameField = $(By.cssSelector("input#UserName"));
        this.passwordField = $(By.cssSelector("input#Password"));
        this.loginSubmitBtn = $(By.cssSelector("#loginForm > form > div:nth-child(5) > div > input"));
        this.registerBtn = $(By.cssSelector("#loginForm > form > p > a"));
    }

    public LoginPage login(String userName, String password) {
        userNameField.setValue(userName);
        passwordField.setValue(password);
        loginSubmitBtn.click();
        return this;
    }

}
