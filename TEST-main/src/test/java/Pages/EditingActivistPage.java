package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.Assert.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.element;

public class EditingActivistPage {
    private final static SelenideElement EDIT=$x("//button[@class='v-btn v-btn--icon v-btn--plain v-btn--round theme--light v-size--default edit']");
    private final static SelenideElement REFACTOR_UIK=$x("//label[text()='УИК №'][@class='v-label v-label--is-disabled theme--light']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CLICK_UIK=$x("//input[@id='bulk-edit-uik_id']");
    private final static SelenideElement CHECK_BOX_REFACTOR_PARTY_SUPPORTED_1=$x("//div[@class='v-dialog__content v-dialog__content--active']//label[text()='Сторонник Партии']/../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_REFACTOR_PARTY_SUPPORTED_1_ASSERTED=$x("//div[@class='v-dialog__content v-dialog__content--active']//label[text()='Сторонник Партии']/../../../../..//input");
    private final static SelenideElement CHECK_BOX_REFACTOR_PARTY_SUPPORTED_2=$x("//div[@class='v-dialog__content v-dialog__content--active']//label[text()='Сторонник Партии']/../div");
    private final static SelenideElement CHECK_BOX_REFACTOR_PARTY_SUPPORTED_2_ASSERTED=$x("//div[@class='v-dialog__content v-dialog__content--active']//label[text()='Сторонник Партии']/..//input");
    private final static SelenideElement ADDING_ACTIVIST_TO_CELLS=$x("//label[text()='Добавление активистов в ячейки']/../div");
    private final static SelenideElement CHECK_BOX_MAIN_CELL=$x("//div[@class='row mb-5 no-gutters align-center']//label[text()='Основная ячейка']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_MAIN_CELL_ASSERTED=$x("//div[@class='row mb-5 no-gutters align-center']//label[text()='Основная ячейка']/../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement MAIN_CELL=$x("//div[@class='row mb-5 no-gutters align-center']//label[text()='Основная ячейка']/..");
    private final static SelenideElement MAIN_CELL_ASSERTED=$x("//div[@class='row mb-5 no-gutters align-center']//label[text()='Основная ячейка']/../div/div");
    private final static SelenideElement CHECK_BOX_DEF1_1=$x("//label[text()='DEF1']/../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_DEF1_1_ASSERTED=$x("//label[text()='DEF1']/../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement CHECK_BOX_DEF1_2=$x("//label[text()='DEF1']/../div");
    private final static SelenideElement CHECK_BOX_DEF1_2_ASSERTED=$x("//label[text()='DEF1']/..//input");
    private final static SelenideElement CHECK_BOX_DEF2_1=$x("//label[text()='DEF2']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_DEF2_1_ASSERTED=$x("//label[text()='DEF2']/../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement DEF2_2=$x("//label[text()='DEF2']/../div[@class='v-select__selections']");
    private final static SelenideElement CHECK_BOX_NEUNI_1=$x("//label[text()='NEUNI']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_NEUNI_1_ASSERTED=$x("//label[text()='NEUNI']/../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement NEUNI_2=$x("//input[@id='bulk-edit-sraabe']");
    private final static SelenideElement CHECK_BOX_UNI_1=$x("//label[text()='UNI']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_UNI_1_ASSERTED=$x("//label[text()='UNI']/../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement UNI_2=$x("//input[@id='bulk-edit-sfaabd']");
    private final static SelenideElement CHECK_BOX_CHOISE=$x("//label[text()='Выбор']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_CHOISE_ASSERTED=$x("//label[text()='Выбор']/../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement CHOISE=$x("//input[@id='bulk-edit-craabf']/..");
    private final static SelenideElement CHECK_BOX_READY=$x("//label[text()='Готовность']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_READY_ASSERTED=$x("//label[text()='Готовность']/../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement READY=$x("//input[@id='bulk-edit-cfaaso']/..");
    private final static SelenideElement CHECK_BOX_DATE_AND_TIME=$x("//label[text()='Дата время']/../../../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_DATE_AND_TIME_ASSERTED=$x("//label[text()='Дата время']/../../../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement DATE_AND_TIME=$x("//label[text()='Дата время']/../input");
    private final static SelenideElement TIME_HOURS=$x("(//strong[text()=':']/../..//div[@class='v-select__selections'])[1]");
    private final static SelenideElement TIME_MINUTES = $x("(//strong[text()=':']/../../../..//div[@class='v-select__selections'])[2]");
    private final static SelenideElement DATE_OF_APPEARANCE = $x("//label[text()[contains(.,'Дата явки')]]/../input");
    private final static SelenideElement DATE_ADVANCE_HOURSE = $x("(//strong[text()=':']/../..//div[@class='v-select__selections'])[2]");
    private final static SelenideElement DATE_ADVANCE_MINUTE = $x("(//strong[text()=':']/../../../..//div[@class='v-select__selections'])[4]");
    private final static SelenideElement CHECK_BOX_DATE_ADVANCE=$x("//label[text()='Дата явки']/../../../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_DATE_ADVANCE_ASSERTED=$x("//label[text()='Дата явки']/../../../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement CHECK_BOX_LOYALTY=$x("//div[@class='v-dialog__content v-dialog__content--active']//label[text()='Лояльность']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_LOYALTY_ASSERTED=$x("//div[@class='v-dialog__content v-dialog__content--active']//label[text()='Лояльность']/../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement LOYALTY=$x("//div[@class='v-dialog__content v-dialog__content--active']//label[text()='Лояльность']/../div[@class='v-select__selections']");
    private final static SelenideElement CHECK_BOX_REFACTOR_PRESIDENT_SUPPORTED_1=$x("(//div[@class='v-dialog__content v-dialog__content--active']//label[text()='Сторонник президента']/../../../../..//div[@class='v-input--selection-controls__input'])[1]");
    private final static SelenideElement CHECK_BOX_REFACTOR_PRESIDENT_SUPPORTED_1_ASSERTED=$x("(//div[@class='v-dialog__content v-dialog__content--active']//label[text()='Сторонник президента']/../../../../..//div[@class='v-input--selection-controls__input'])[1]/input");
    private final static SelenideElement CHECK_BOX_REFACTOR_PRESIDENT_SUPPORTED_2=$x("(//div[@class='v-dialog__content v-dialog__content--active']//label[text()='Сторонник президента']/../../../../..//div[@class='v-input--selection-controls__input'])[2]");
    private final static SelenideElement CHECK_BOX_REFACTOR_PRESIDENT_SUPPORTED_2_ASSERTED=$x("(//div[@class='v-dialog__content v-dialog__content--active']//label[text()='Сторонник президента']/../../../../..//div[@class='v-input--selection-controls__input'])[2]/input");
    private final static SelenideElement REMOVAL_ACTIVIST=$x("//label[text()='Удаление активистов из ячеек']/../div");
    private final static SelenideElement CHECK_BOX_DOP_POLE_M=$x("//label[text()='Допполе Мособллл']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_DOP_POLE_M_ASSERTED=$x("//label[text()='Допполе Мособллл']/../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement DOP_POLE_M=$x("//label[text()='Допполе Мособллл']/../input");
    private final static SelenideElement CHECK_BOX_DOP_POLE_DP1=$x("//label[text()='ДП1']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_DOP_POLE_DP1_ASSERTED=$x("//label[text()='ДП1']/../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement DOP_POLE_DP1=$x("//label[text()='ДП1']/../input");
    private final static SelenideElement CHECK_BOX_DOP_POLE_DP11=$x("//label[text()='ДП11']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_DOP_POLE_DP11_ASSERTED=$x("//label[text()='ДП11']/../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement DOP_POLE_DP11=$x("//label[text()='ДП11']/../input");
    private final static SelenideElement CHECK_BOX_DOP_POLE_DP2=$x("//label[text()='ДП2']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_DOP_POLE_DP2_ASSERTED=$x("//label[text()='ДП2']/../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement DOP_POLE_DP2=$x("//label[text()='ДП2']/../input");
    private final static SelenideElement CHECK_BOX_DOP_POLE_DP5=$x("//label[text()='ДП5']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_DOP_POLE_DP5_ASSERTED=$x("//label[text()='ДП5']/../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement DOP_POLE_DP5=$x("//label[text()='ДП5']/../input");
    private final static SelenideElement CHECK_BOX_DOP_POLE_DP6=$x("//label[text()='ДП6']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_DOP_POLE_DP6_ASSERTED=$x("//label[text()='ДП6']/../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement DOP_POLE_DP6=$x("//label[text()='ДП6']/../input");
    private final static SelenideElement CHECK_BOX_DOP_POLE_DP6_1=$x("//label[text()='ДП6-1']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_DOP_POLE_DP6_1_ASSERTED=$x("//label[text()='ДП6-1']/../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement DOP_POLE_DP6_1=$x("//label[text()='ДП6-1']/../input");
    private final static SelenideElement CHECK_BOX_DOP_POLE_DP_NUMBER=$x("//label[text()='ДП число']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_DOP_POLE_DP_NUMBER_ASSERTED=$x("//label[text()='ДП число']/../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement DOP_POLE_DP_NUMBER=$x("//label[text()='ДП число']/../input");
    private final static SelenideElement CHECK_BOX_DOP_POLE_BAN=$x("//label[text()='ЗАПРЕТ тест']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_DOP_POLE_BAN_ASSERTED=$x("//label[text()='ЗАПРЕТ тест']/../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement DOP_POLE_BAN=$x("//label[text()='ЗАПРЕТ тест']/../input");
    private final static SelenideElement CHECK_BOX_JJJ=$x("//label[text()='ййй']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_JJJ_ASSERTED=$x("//label[text()='ййй']/../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement JJJ=$x("//label[text()='ййй']/../input");
    private final static SelenideElement CHECK_BOX_KOORDINAT=$x("//label[text()='Координаты явки']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_KOORDINAT_ASSERTED=$x("//label[text()='Координаты явки']/../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement KOORDINAT=$x("//label[text()='Координаты явки']/../input");
    private final static SelenideElement CHECK_BOX_DOP_POLE_DP3_1=$x("(//label[text()='ДП3']/../../../../..//div[@class='v-input--selection-controls__input'])[1]");
    private final static SelenideElement CHECK_BOX_DOP_POLE_DP3_1_ASSERTED=$x("(//label[text()='ДП3']/../../../../..//div[@class='v-input--selection-controls__input'])[1]/input");
    private final static SelenideElement CHECK_BOX_DOP_POLE_DP3_2=$x("(//label[text()='ДП3']/../../../../..//div[@class='v-input--selection-controls__input'])[2]");
    private final static SelenideElement CHECK_BOX_DOP_POLE_DP3_2_ASSERTED=$x("(//label[text()='ДП3']/../../../../..//div[@class='v-input--selection-controls__input'])[2]/input");
    private final static SelenideElement CHECK_BOX_FLAG=$x("(//label[text()='Флаг']/../../../../..//div[@class='v-input--selection-controls__input'])[1]");
    private final static SelenideElement CHECK_BOX_FLAG_1_ASSERTED=$x("(//label[text()='Флаг']/../../../../..//div[@class='v-input--selection-controls__input'])[1]/input");
    private final static SelenideElement CHECK_BOX_FLAG_2=$x("(//label[text()='Флаг']/../../../../..//div[@class='v-input--selection-controls__input'])[2]");
    private final static SelenideElement CHECK_BOX_FLAG_2_ASSERTED=$x("(//label[text()='Флаг']/../../../../..//div[@class='v-input--selection-controls__input'])[2]/input");
    private final static SelenideElement CHECK_BOX_FLAG1=$x("(//label[text()='Флаг1']/../../../../..//div[@class='v-input--selection-controls__input'])[1]");
    private final static SelenideElement CHECK_BOX_FLAG1_1_ASSERTED=$x("(//label[text()='Флаг1']/../../../../..//div[@class='v-input--selection-controls__input'])[1]/input");
    private final static SelenideElement CHECK_BOX_FLAG1_2=$x("(//label[text()='Флаг1']/../../../../..//div[@class='v-input--selection-controls__input'])[2]");
    private final static SelenideElement CHECK_BOX_FLAG1_2_ASSERTED=$x("(//label[text()='Флаг1']/../../../../..//div[@class='v-input--selection-controls__input'])[2]/input");

    private final static SelenideElement CHECK_BOX_FLAG2=$x("(//label[text()='Флаг2']/../../../../..//div[@class='v-input--selection-controls__input'])[1]");
    private final static SelenideElement CHECK_BOX_FLAG2_1_ASSERTED=$x("(//label[text()='Флаг2']/../../../../..//div[@class='v-input--selection-controls__input'])[1]/input");
    private final static SelenideElement CHECK_BOX_FLAG2_2=$x("(//label[text()='Флаг2']/../../../../..//div[@class='v-input--selection-controls__input'])[2]");
    private final static SelenideElement CHECK_BOX_FLAG2_2_ASSERTED=$x("(//label[text()='Флаг2']/../../../../..//div[@class='v-input--selection-controls__input'])[2]/input");

    private final static SelenideElement CHECK_BOX_FLAG3=$x("(//label[text()='Флаг3']/../../../../..//div[@class='v-input--selection-controls__input'])[1]");
    private final static SelenideElement CHECK_BOX_FLAG3_1_ASSERTED=$x("(//label[text()='Флаг3']/../../../../..//div[@class='v-input--selection-controls__input'])[1]/input");
    private final static SelenideElement CHECK_BOX_FLAG3_2=$x("(//label[text()='Флаг3']/../../../../..//div[@class='v-input--selection-controls__input'])[2]");
    private final static SelenideElement CHECK_BOX_FLAG3_2_ASSERTED=$x("(//label[text()='Флаг3']/../../../../..//div[@class='v-input--selection-controls__input'])[2]/input");

    private final static SelenideElement CHECK_BOX_FLAG4=$x("(//label[text()='Флаг4']/../../../../..//div[@class='v-input--selection-controls__input'])[1]");
    private final static SelenideElement CHECK_BOX_FLAG4_1_ASSERTED=$x("(//label[text()='Флаг4']/../../../../..//div[@class='v-input--selection-controls__input'])[1]/input");
    private final static SelenideElement CHECK_BOX_FLAG4_2=$x("(//label[text()='Флаг4']/../../../../..//div[@class='v-input--selection-controls__input'])[2]");
    private final static SelenideElement CHECK_BOX_FLAG4_2_ASSERTED=$x("(//label[text()='Флаг4']/../../../../..//div[@class='v-input--selection-controls__input'])[2]/input");

    private final static SelenideElement CHECK_BOX_FLAG5=$x("(//label[text()='Флаг5']/../../../../..//div[@class='v-input--selection-controls__input'])[1]");
    private final static SelenideElement CHECK_BOX_FLAG5_1_ASSERTED=$x("(//label[text()='Флаг5']/../../../../..//div[@class='v-input--selection-controls__input'])[1]/input");
    private final static SelenideElement CHECK_BOX_FLAG5_2=$x("(//label[text()='Флаг5']/../../../../..//div[@class='v-input--selection-controls__input'])[2]");
    private final static SelenideElement CHECK_BOX_FLAG5_2_ASSERTED=$x("(//label[text()='Флаг5']/../../../../..//div[@class='v-input--selection-controls__input'])[2]/input");

    private final static SelenideElement CHECK_BOX_RESULT=$x("//label[text()='Результат явки']/../../../../../..//div[@class='v-input--selection-controls__input']");
    private final static SelenideElement CHECK_BOX_RESULT_ASSERTED=$x("//label[text()='Результат явки']/../../../../../..//div[@class='v-input--selection-controls__input']/input");
    private final static SelenideElement RESULT=$x("//label[text()='Результат явки']/../div[@class='v-input__append-inner']");
    //private final static SelenideElement SAVED = $x("//span[text()[contains(.,'Сохранить')]]/..");
    private final static SelenideElement CLOSED = $x("//div[@class='v-dialog__content v-dialog__content--active']//i[@class='v-icon notranslate v-icon--dense mdi mdi-close theme--light']");





    public void editClick(){
        EDIT.shouldBe(visible,Duration.ofSeconds(10)).click();
    }
    public void refactorUik(String number){
        //new WebDriverWait(getWebDriver(), 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='УИК №'][@class='v-label v-label--is-disabled theme--light']/../../../../../..//div[@class='v-input--selection-controls__input']/input"))).click();
        REFACTOR_UIK.shouldBe(visible,Duration.ofSeconds(10)).click();
        CLICK_UIK.shouldBe(visible,Duration.ofSeconds(10)).click();
        new WebDriverWait(getWebDriver(), 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']//div[@class='v-list-item__title'][text()='1']")));
        Actions action = new Actions(getWebDriver());
        action.sendKeys(Keys.CONTROL, Keys.END).perform();
        action.sendKeys(Keys.CONTROL, Keys.END).perform();
        element(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']//div[@class='v-list-item__title'][text()='"+number+"']")).shouldBe(visible, Duration.ofSeconds(10)).click();
        assertEquals(number,CLICK_UIK.getValue());
    }
    public void clickPatrySupported(){
        CHECK_BOX_REFACTOR_PARTY_SUPPORTED_1.click();
        assertTrue(CHECK_BOX_REFACTOR_PARTY_SUPPORTED_1_ASSERTED.getAttribute("aria-checked").equals("true"));
        CHECK_BOX_REFACTOR_PARTY_SUPPORTED_2.click();
        assertTrue(CHECK_BOX_REFACTOR_PARTY_SUPPORTED_2_ASSERTED.getAttribute("aria-checked").equals("true"));
    }
    public void addActivistToCells(String first, String second, String third,String fourth){
        ADDING_ACTIVIST_TO_CELLS.click();
        element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//div[text()='"+first+"']/../../button[1]")).shouldBe(visible,Duration.ofSeconds(10)).click();
        element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//div[text()='" + second + "']/../../button[1]")).shouldBe(visible,Duration.ofSeconds(10)).click();
        element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//div[text()='"+third+"']/../../button[1]")).shouldBe(visible,Duration.ofSeconds(10)).click();
        element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//div[text()='"+fourth+"']/../../button[1]")).shouldBe(visible,Duration.ofSeconds(10)).click();
        element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//span[contains(text(),'Закрыть')]/../../button")).click();
        assertNotNull(ADDING_ACTIVIST_TO_CELLS.getText());
    }
    public void mainCell(String first, String second, String third,String fourth){
        CHECK_BOX_MAIN_CELL.click();
        assertTrue(CHECK_BOX_MAIN_CELL_ASSERTED.getAttribute("aria-checked").equals("true"));
        MAIN_CELL.click();
        element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//div[text()='"+first+"']/../../button")).shouldBe(visible,Duration.ofSeconds(10)).click();
        element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//div[text()='"+second+"']/../../button")).shouldBe(visible,Duration.ofSeconds(10)).click();
        element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//div[text()='"+third+"']/../../button")).shouldBe(visible,Duration.ofSeconds(10)).click();
        element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//div[text()='"+fourth+"']")).shouldBe(visible,Duration.ofSeconds(10)).click();
        element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//span[contains(text(),'Закрыть')]/..")).click();
        assertEquals(fourth,MAIN_CELL_ASSERTED.getText());
    }
    public void clickDef1(){
        CHECK_BOX_DEF1_1.click();
        assertTrue(CHECK_BOX_DEF1_1_ASSERTED.getAttribute("aria-checked").equals("true"));
        CHECK_BOX_DEF1_2.click();
        assertTrue(CHECK_BOX_DEF1_2_ASSERTED.getAttribute("aria-checked").equals("true"));
    }
    public void clickDef2(String text){
        CHECK_BOX_DEF2_1.click();
        assertTrue(CHECK_BOX_DEF2_1_ASSERTED.getAttribute("aria-checked").equals("true"));
        DEF2_2.click();
        element(By.xpath("//div[text()='"+text+"'][@class='v-list-item__title']")).shouldBe(visible,Duration.ofSeconds(10)).click();
        assertEquals(text,DEF2_2.getText());
    }
    public void clickNeuni(String text){
        CHECK_BOX_NEUNI_1.click();
        assertTrue(CHECK_BOX_NEUNI_1_ASSERTED.getAttribute("aria-checked").equals("true"));
        NEUNI_2.setValue(text);
        assertEquals(text,NEUNI_2.getValue());
    }
    public void clickUni(String text){
        CHECK_BOX_UNI_1.click();
        assertTrue(CHECK_BOX_UNI_1_ASSERTED.getAttribute("aria-checked").equals("true"));
        UNI_2.setValue(text);
        assertEquals(text,UNI_2.getValue());
    }
    public void clickChoise(String choise){
        CHECK_BOX_CHOISE.click();
        assertTrue(CHECK_BOX_CHOISE_ASSERTED.getAttribute("aria-checked").equals("true"));
        CHOISE.click();
        element(By.xpath("//div[text()='"+choise+"'][@class='v-list-item__title']")).shouldBe(visible,Duration.ofSeconds(10)).click();
        assertEquals(choise,CHOISE.getText());
    }
    public void clickReady(String ready){
        CHECK_BOX_READY.click();
        assertTrue(CHECK_BOX_READY_ASSERTED.getAttribute("aria-checked").equals("true"));
        READY.click();
        element(By.xpath("//div[text()='"+ready+"'][@class='v-list-item__title']")).shouldBe(visible,Duration.ofSeconds(10)).click();
        assertEquals(ready,READY.getText());
    }
    public void addDateAndTime(String date){
        CHECK_BOX_DATE_AND_TIME.click();
        assertTrue(CHECK_BOX_DATE_AND_TIME_ASSERTED.getAttribute("aria-checked").equals("true"));
        DATE_AND_TIME.val(date);
        assertEquals(date,DATE_AND_TIME.getValue());
    }
    public void addHours(String hours) {
        TIME_HOURS.click();
        Actions action = new Actions(getWebDriver());
        action.sendKeys(Keys.CONTROL, Keys.END).perform();
        element(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']/div/div/div/div[text()='" + hours + "']")).click();
        assertEquals(hours,TIME_HOURS.getText());
    }
    public void addMinutes(String minutes) {
        TIME_MINUTES.click();
        Actions action = new Actions(getWebDriver());
        action.sendKeys(Keys.CONTROL, Keys.END).perform();
        action.sendKeys(Keys.CONTROL, Keys.END).perform();
        element(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[text()='" + minutes + "']")).click();
        assertEquals(minutes,TIME_MINUTES.getText());
    }
    public void addAprearance(String date) {
        CHECK_BOX_DATE_ADVANCE.click();
        assertTrue(CHECK_BOX_DATE_ADVANCE_ASSERTED.getAttribute("aria-checked").equals("true"));
        DATE_OF_APPEARANCE.val(date);
        assertEquals(date,DATE_OF_APPEARANCE.getValue());
    }
    public void addHourseDateAdvanceHourse(String hourse) {
        DATE_ADVANCE_HOURSE.click();
        Actions action = new Actions(getWebDriver());
        action.sendKeys(Keys.CONTROL, Keys.END).perform();
        element(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[text()='" + hourse + "']")).shouldBe(visible, Duration.ofSeconds(10)).click();
        assertEquals(hourse,DATE_ADVANCE_HOURSE.getText());
    }
    public void addHourseDateAdvanceMinutse(String minutes) {
        DATE_ADVANCE_MINUTE.click();
        Actions action = new Actions(getWebDriver());
        action.sendKeys(Keys.CONTROL, Keys.END).perform();
        action.sendKeys(Keys.CONTROL, Keys.END).perform();
        element(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list-item__title'][text()='" + minutes + "']")).shouldBe(visible, Duration.ofSeconds(10)).click();
        assertEquals(minutes,DATE_ADVANCE_MINUTE.getText());
    }
    public void fillAllFields() {
        for (int i = 1; i <= 50; i++) {
            try {
                element(By.xpath("//label[text()='Допполе "+i+"']/../../../../../..//div[@class='v-input--selection-controls__input']")).shouldBe(visible,Duration.ofSeconds(10)).click();
                assertTrue(element(By.xpath("//label[text()='Допполе "+i+"']/../../../../../..//div[@class='v-input--selection-controls__input']/input")).getAttribute("aria-checked").equals("true"));
                SelenideElement selenideElement = element(By.xpath("//label[text()='Допполе " + i + "']/../input"));
                selenideElement.click();
                selenideElement.val("Text");
                assertEquals("Text",selenideElement.getValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void loyalty(String loyalty){
        CHECK_BOX_LOYALTY.click();
        assertTrue(CHECK_BOX_LOYALTY_ASSERTED.getAttribute("aria-checked").equals("true"));
        LOYALTY.click();
        element(By.xpath("//div[text()='"+loyalty+"'][@class='v-list-item__title']")).shouldBe(visible,Duration.ofSeconds(10)).click();
        assertEquals(loyalty,LOYALTY.getText());
    }
    public void addSupportedPresident(){
        CHECK_BOX_REFACTOR_PRESIDENT_SUPPORTED_1.click();
        assertTrue(CHECK_BOX_REFACTOR_PRESIDENT_SUPPORTED_1_ASSERTED.getAttribute("aria-checked").equals("true"));
        CHECK_BOX_REFACTOR_PRESIDENT_SUPPORTED_2.click();
        assertTrue(CHECK_BOX_REFACTOR_PRESIDENT_SUPPORTED_2_ASSERTED.getAttribute("aria-checked").equals("true"));
    }
    public void removeActivist(String first, String second, String third,String fourth){
        REMOVAL_ACTIVIST.click();
        if (element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//div[text()='"+first+"']/../../..")).getAttribute("aria-expanded").equalsIgnoreCase("false")){
            element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//div[text()='"+first+"']/../../button[1]")).shouldBe(visible,Duration.ofSeconds(10)).click();
        }
        if (element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//div[text()='" + second + "']/../../..")).getAttribute("aria-expanded").equalsIgnoreCase("false")){
            element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//div[text()='" + second + "']/../../button[1]")).shouldBe(visible,Duration.ofSeconds(10)).click();
        }
        if (element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//div[text()='"+third+"']/../../..")).getAttribute("aria-expanded").equalsIgnoreCase("false")){
            element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//div[text()='"+third+"']/../../button[1]")).shouldBe(visible,Duration.ofSeconds(10)).click();
        }
        element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//div[text()='"+fourth+"']/../../button[1]")).shouldBe(visible,Duration.ofSeconds(10)).click();

        Actions action = new Actions(getWebDriver());
        action.sendKeys(Keys.ESCAPE).perform();
    }
    public void dopPole(String text){
        CHECK_BOX_DOP_POLE_M.click();
        assertTrue(CHECK_BOX_DOP_POLE_M_ASSERTED.getAttribute("aria-checked").equals("true"));
        DOP_POLE_M.val(text);
        assertEquals(text,DOP_POLE_M.getValue());
    }
    public void dopPoleDP1(String text){
        CHECK_BOX_DOP_POLE_DP1.click();
        assertTrue(CHECK_BOX_DOP_POLE_DP1_ASSERTED.getAttribute("aria-checked").equals("true"));
        DOP_POLE_DP1.val(text);
        assertEquals(text,DOP_POLE_DP1.getValue());
    }
    public void dopPoleDP11(String number){
        CHECK_BOX_DOP_POLE_DP11.click();
        assertTrue(CHECK_BOX_DOP_POLE_DP11_ASSERTED.getAttribute("aria-checked").equals("true"));
        DOP_POLE_DP11.val(number);
        assertEquals(number,DOP_POLE_DP11.getValue());
    }
    public void dopPoleDP2(String date){
        CHECK_BOX_DOP_POLE_DP2.click();
        assertTrue(CHECK_BOX_DOP_POLE_DP2_ASSERTED.getAttribute("aria-checked").equals("true"));
        DOP_POLE_DP2.val(date);
        assertEquals(date,DOP_POLE_DP2.getValue());
    }
    public void dopPoleDP3(){
        CHECK_BOX_DOP_POLE_DP3_1.click();
        assertTrue(CHECK_BOX_DOP_POLE_DP3_1_ASSERTED.getAttribute("aria-checked").equals("true"));
        CHECK_BOX_DOP_POLE_DP3_2.click();
        assertTrue(CHECK_BOX_DOP_POLE_DP3_2_ASSERTED.getAttribute("aria-checked").equals("true"));
    }
    public void dopPoleDP5(String text){
        CHECK_BOX_DOP_POLE_DP5.click();
        assertTrue(CHECK_BOX_DOP_POLE_DP5_ASSERTED.getAttribute("aria-checked").equals("true"));
        DOP_POLE_DP5.val(text);
        assertEquals(text,DOP_POLE_DP5.getValue());
    }
    public void dopPoleDP6(String text){
        CHECK_BOX_DOP_POLE_DP6.click();
        assertTrue(CHECK_BOX_DOP_POLE_DP6_ASSERTED.getAttribute("aria-checked").equals("true"));
        DOP_POLE_DP6.val(text);
        assertEquals(text,DOP_POLE_DP6.getValue());
    }
    public void dopPoleDP6_1(String text){
        CHECK_BOX_DOP_POLE_DP6_1.click();
        assertTrue(CHECK_BOX_DOP_POLE_DP6_1_ASSERTED.getAttribute("aria-checked").equals("true"));
        DOP_POLE_DP6_1.val(text);
        assertEquals(text,DOP_POLE_DP6_1.getValue());
    }
    public void dopPoleDpNumber(String number){
        CHECK_BOX_DOP_POLE_DP_NUMBER.click();
        assertTrue(CHECK_BOX_DOP_POLE_DP_NUMBER_ASSERTED.getAttribute("aria-checked").equals("true"));
        DOP_POLE_DP_NUMBER.val(number);
        assertEquals(number,DOP_POLE_DP_NUMBER.getValue());
    }
    public void dopPoleBan(String ban){
        CHECK_BOX_DOP_POLE_BAN.click();
        assertTrue(CHECK_BOX_DOP_POLE_BAN_ASSERTED.getAttribute("aria-checked").equals("true"));
        DOP_POLE_BAN.val(ban);
        assertEquals(ban,DOP_POLE_BAN.getValue());
    }
    public void dopPoleJJJ(String text){
        CHECK_BOX_JJJ.click();
        assertTrue(CHECK_BOX_JJJ_ASSERTED.getAttribute("aria-checked").equals("true"));
        JJJ.val(text);
        assertEquals(text,JJJ.getValue());
    }
    public void koordinat(String koordinat){
        CHECK_BOX_KOORDINAT.click();
        assertTrue(CHECK_BOX_KOORDINAT_ASSERTED.getAttribute("aria-checked").equals("true"));
        KOORDINAT.val(koordinat);
        assertEquals(koordinat,KOORDINAT.getValue());
    }
    public void result(String result){
     CHECK_BOX_RESULT.click();
     assertTrue(CHECK_BOX_RESULT_ASSERTED.getAttribute("aria-checked").equals("true"));
     RESULT.click();
     element(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[text()='"+result+"'][@class='v-list-item__title']")).shouldBe(visible,Duration.ofSeconds(10)).click();
     //assertEquals(result,RESULT.getValue());
    }
    public void checkFlag(){
        CHECK_BOX_FLAG.click();
        assertTrue(CHECK_BOX_FLAG_1_ASSERTED.getAttribute("aria-checked").equals("true"));
        CHECK_BOX_FLAG_2.click();
        assertTrue(CHECK_BOX_FLAG_2_ASSERTED.getAttribute("aria-checked").equals("true"));
    }
    public void checkFlag1(){
        CHECK_BOX_FLAG1.click();
        assertTrue(CHECK_BOX_FLAG1_1_ASSERTED.getAttribute("aria-checked").equals("true"));
        CHECK_BOX_FLAG1_2.click();
        assertTrue(CHECK_BOX_FLAG1_2_ASSERTED.getAttribute("aria-checked").equals("true"));
    }
    public void checkFlag2(){
        CHECK_BOX_FLAG2.click();
        assertTrue(CHECK_BOX_FLAG2_1_ASSERTED.getAttribute("aria-checked").equals("true"));
        CHECK_BOX_FLAG2_2.click();
        assertTrue(CHECK_BOX_FLAG2_2_ASSERTED.getAttribute("aria-checked").equals("true"));
    }
    public void checkFlag3(){
        CHECK_BOX_FLAG3.click();
        assertTrue(CHECK_BOX_FLAG3_1_ASSERTED.getAttribute("aria-checked").equals("true"));
        CHECK_BOX_FLAG3_2.click();
        assertTrue(CHECK_BOX_FLAG3_2_ASSERTED.getAttribute("aria-checked").equals("true"));
    }
    public void checkFlag4(){
        CHECK_BOX_FLAG4.click();
        assertTrue(CHECK_BOX_FLAG4_1_ASSERTED.getAttribute("aria-checked").equals("true"));
        CHECK_BOX_FLAG4_2.click();
        assertTrue(CHECK_BOX_FLAG4_2_ASSERTED.getAttribute("aria-checked").equals("true"));
    }
    public void checkFlag5(){
        CHECK_BOX_FLAG5.click();
        assertTrue(CHECK_BOX_FLAG5_1_ASSERTED.getAttribute("aria-checked").equals("true"));
        CHECK_BOX_FLAG5_2.click();
        assertTrue(CHECK_BOX_FLAG5_2_ASSERTED.getAttribute("aria-checked").equals("true"));
    }

    public void close(){
        CLOSED.click();
    }


}
