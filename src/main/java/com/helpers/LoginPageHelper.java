package com.helpers;

import com.codeborne.selenide.Selenide;
import com.managers.PageManager;
import io.qameta.allure.Step;

public class LoginPageHelper {

    PageManager pages;

    public LoginPageHelper(PageManager pages) {
        this.pages = pages;
    }

    public LoginPageHelper loginToApp(String userName, String password) {
        pages.onLoginPage().login(userName, password);
        return this;
    }

    @Step
    public LoginPageHelper openLoginPage() {
        Selenide.open("http://eaapp.somee.com/Account/Login");
        return this;
    }

}
