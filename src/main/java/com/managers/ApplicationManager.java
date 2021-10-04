package com.managers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.helpers.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ApplicationManager {

    public static PageManager pages = new PageManager();
    public LoginPageHelper loginPageHelper;
    public MainPageHelper mainPageHelper;
    public RegisterPageHelper registerPageHelper;

    public ApplicationManager() {
        loginPageHelper = new LoginPageHelper(pages);
        mainPageHelper = new MainPageHelper(pages);
        registerPageHelper = new RegisterPageHelper(pages);
    }

    @BeforeClass
    public static void setup() {
        setBrowserProperties();
    }

    public static void setBrowserProperties() {
        System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
        Configuration.startMaximized = true;
        Configuration.headless = true;
    }

    public LoginPageHelper getLoginPageHelper() {
        return loginPageHelper;
    }
    public MainPageHelper getMainPageHelper() {
        return mainPageHelper;
    }
    public RegisterPageHelper getRegisterPageHelper() {
        return registerPageHelper;
    }

      // Настрйоки для Селеноида
/*    private static void setBrowserSettings() {
        Configuration.reportsFolder = "test/screenshotReports"; // селенид сохраняет сюда скрины при падении
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }

    @AfterClass
    public static void teardown() {
        Selenide.closeWebDriver();
        String stopContainers = "docker stop selenoid selenoid-ui";
        String command = "cmd.exe /c start "+"allure serve allure-results";
        try {
            Runtime.getRuntime().exec(stopContainers);
            Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

}