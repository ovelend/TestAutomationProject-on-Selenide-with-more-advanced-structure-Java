package tests;

import com.TestBase;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;


public class LoginAndRegisterTest extends TestBase {

    private String userName = "sRgfgH";
    private String password = "dA2344G!346";
    private String eMail = "oll4123@mail.ru";

    @BeforeTest
    public void setUp() {
        open("http://eaapp.somee.com/");
    }

    @Test
    @Description("Go to RegisterPage from MainPage, fill the data")
    public void
    checkRegister() {
        app.getMainPageHelper()
                .toRegister();
        app.getRegisterPageHelper()
                .register(userName, password, eMail);
        app.getMainPageHelper()
                .checkWelcomeTitle(userName);
    }

    @Test
    @Description("Go to LoginPage from MainPage, fill the data, check welcome title and log off")
    public void checkLogin() {
        app.getMainPageHelper()
                .toLogin();
        app.getLoginPageHelper()
                .loginToApp("admin", "password");
        app.getMainPageHelper()
                .checkWelcomeTitle("admin");
        app.getMainPageHelper()
                .logOff();
    }

}
