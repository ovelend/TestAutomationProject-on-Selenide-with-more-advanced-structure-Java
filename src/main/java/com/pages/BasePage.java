package com.pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public abstract class BasePage {

    private final SelenideElement homeBtn = $(By.xpath("/html/body/div[1]/div/div[2]/ul[1]/li[1]/a"));
    private final SelenideElement employeeListBtn = $(By.xpath("/html/body/div[1]/div/div[2]/ul[1]/li[3]/a"));
    private final SelenideElement aboutBtn = $(By.xpath("/html/body/div[1]/div/div[2]/ul[1]/li[2]/a"));

    public BasePage goHome() {
        homeBtn.click();
        return this;
    }

    public BasePage goAbout() {
        aboutBtn.click();
        return this;
    }

    public BasePage goEmployeeList() {
        employeeListBtn.click();
        return this;
    }

    public BasePage checkVisibility(SelenideElement el) {
        el.shouldBe(Condition.visible);
        return this;
    }


}
