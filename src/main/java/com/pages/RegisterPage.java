package com.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegisterPage extends BasePage {

    private SelenideElement userNameField;
    private SelenideElement passwordField;
    private SelenideElement confirmPassField;
    private SelenideElement eMailField;
    private SelenideElement registerSubmitBtn;
    private SelenideElement header;

    public RegisterPage() {
        this.userNameField = $(By.cssSelector("input#UserName"));
        this.passwordField = $(By.cssSelector("input#Password"));
        this.confirmPassField = $(By.cssSelector("input#ConfirmPassword"));
        this.eMailField = $(By.cssSelector("input#Email"));
        this.registerSubmitBtn = $(By.cssSelector("body > div.container.body-content > form > div:nth-child(9) > div > input"));
        this.header = $(By.cssSelector("body > div.container.body-content > form > h4"));
    }

    public RegisterPage register(String userName, String password, String mail) {
        userNameField.setValue(userName);
        passwordField.setValue(password);
        confirmPassField.setValue(password);
        eMailField.setValue(mail);
        registerSubmitBtn.click();
        return this;
    }

}
