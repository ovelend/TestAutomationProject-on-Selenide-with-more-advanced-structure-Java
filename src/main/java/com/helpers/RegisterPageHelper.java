package com.helpers;

import com.codeborne.selenide.Selenide;
import com.managers.PageManager;
import io.qameta.allure.Step;

public class RegisterPageHelper {

    PageManager pages;

    public RegisterPageHelper(PageManager pages) {
        this.pages = pages;
    }

    public RegisterPageHelper register(String userName, String password, String mail) {
        pages.onRegisterPage().register(userName, password, mail);
        return this;
    }

    @Step
    public RegisterPageHelper openRegisterPage() {
        Selenide.open("http://eaapp.somee.com/Account/Register");
        return this;
    }
}
