package com;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideDriver;
import com.managers.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public abstract class TestBase {

    public static ApplicationManager app;

    @BeforeClass
    public void init() {
        app = new ApplicationManager();
    }



}
