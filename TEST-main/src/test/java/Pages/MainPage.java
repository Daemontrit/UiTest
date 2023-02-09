package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement activists = $x("//*[text()[contains(.,'Активисты')]]");
    private final SelenideElement CLICK_REGION = $x("//span[text()[contains(.,'Вся Россия')]]");
    private final SelenideElement MOSCOW_REGION = $x("//div[text()[contains(.,'Московская область')]]");


    public void clickMoscowRegion() {


        if (CLICK_REGION.getText().equalsIgnoreCase("Вся Россия")) {
            CLICK_REGION.click();
            MOSCOW_REGION.click();
        } else {
            clickAktivists();
        }

    }

    public void clickAktivists() {
        activists.shouldBe(visible, Duration.ofSeconds(10)).click();
    }
}
