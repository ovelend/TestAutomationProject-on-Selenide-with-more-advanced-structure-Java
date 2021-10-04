package com.managers;

import com.pages.*;

public class PageManager {

    public static LoginPage loginPage;
    public static MainPage mainPage;
    public static RegisterPage registerPage;

    public PageManager() {
        loginPage = new LoginPage();
        mainPage = new MainPage();
        registerPage = new RegisterPage();
    }

    public LoginPage onLoginPage() {
        return loginPage;
    }

    public MainPage onMainPage() {
        return mainPage;
    }

    public RegisterPage onRegisterPage() {
        return registerPage;
    }

}
