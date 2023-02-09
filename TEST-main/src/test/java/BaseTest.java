import Pages.LoginPage;
import Pages.MainPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

abstract public class BaseTest {
    public static String userName="user";
    public static String password="Pfghtnbnm83";




    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        //Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.screenshots = false;
        Configuration.startMaximized=true;
    }


    @BeforeEach
    public void initLogin(){
        setUp();
        LoginPage loginPage = new LoginPage(userName,password);
        loginPage.login("", "");

        MainPage mainPage = new MainPage();
        mainPage.clickAktivists();
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }

}
