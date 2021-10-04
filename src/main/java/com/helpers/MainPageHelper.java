package com.helpers;

import com.codeborne.selenide.Selenide;
import com.managers.PageManager;
import io.qameta.allure.Step;
import org.testng.Assert;

public class MainPageHelper {

    PageManager pages;

    public MainPageHelper(PageManager pages) {
        this.pages = pages;
    }

    @Step
    public MainPageHelper toLogin() {
        pages.onMainPage().toLogin();
        return this;
    }

    @Step
    public MainPageHelper toRegister() {
        pages.onMainPage().toRegister();
        return this;
    }

    @Step
    public MainPageHelper logOff() {
        pages.onMainPage().logOff();
        return this;
    }

    @Step
    public MainPageHelper checkWelcomeTitle(String login) {
        String actWelcomeTitle = pages.onMainPage().getWelcomeTitle();
        Assert.assertEquals(actWelcomeTitle, "Hello "+login+"!", "Welcome title is wrong");
        return this;
    }

    @Step
    public MainPageHelper openMainPage() {
        Selenide.open("http://eaapp.somee.com/");
        return this;
    }
}
