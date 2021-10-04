package com.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage {

    private SelenideElement loginBtn;
    private SelenideElement registerBtn;
    private SelenideElement logOffBtn;
    private SelenideElement welcomeTitle;

    public MainPage() {
        this.loginBtn = $(By.cssSelector("a#loginLink"));
        this.registerBtn = $(By.xpath("//*[@id='registerLink']"));
        this.logOffBtn = $(By.cssSelector("#logoutForm > ul > li:nth-child(2) > a"));
        this.welcomeTitle = $(By.cssSelector("#logoutForm > ul > li:nth-child(1) > a"));
    }

    public MainPage toLogin() {
        loginBtn.click();
        return this;
    }

    public MainPage toRegister() {
        registerBtn.click();
        return this;
    }

    public MainPage logOff() {
        logOffBtn.click();
        return this;
    }

    public String getWelcomeTitle() {
        return welcomeTitle.getText();
    }

}
