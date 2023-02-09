package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class LoginPage {
    //public String pageUrl;
    public SelenideElement loginField = $("#input-5");
    public SelenideElement passwordField = $("#input-8");
    public SelenideElement signInButton = $x("//button[@class='body-2 v-btn v-btn--block v-btn--has-bg theme--light v-size--large primary']");

    public LoginPage(String username, String password) {
        String pageUrl="https://"+username+":"+password+"@"+"mob-new.edinros.ru/#/stats";
       // https://user:Pfghtnbnm83@mob-new.edinros.ru/#/stats
        Selenide.open(pageUrl);
    }

    public void login(String email, String password) {
        loginField.setValue(email);
        passwordField.setValue(password);
        signInButton.click();
    }
}
