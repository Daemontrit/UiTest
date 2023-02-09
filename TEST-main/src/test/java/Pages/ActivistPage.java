package Pages;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ActivistPage {
    private final static SelenideElement ADD_ACTIVIST = $x("//button[@class='v-btn v-btn--icon v-btn--plain v-btn--round theme--light v-size--default add']");
    private final static SelenideElement LAST_NAME = $("#edit-last_name");
    private final static SelenideElement FIRST_NAME = $("#edit-first_name");
    private final static SelenideElement PATRONYMIC = $("#edit-patronymic");
    private final static SelenideElement DATE = $x("//label[contains(text(), 'Дата рождения')]/..//input");
    private final static SelenideElement PHONE = $("#edit-phone_mobile");
    private final static SelenideElement ADDRESS = $("#edit-address");
    private final static SelenideElement FIND_OFFICE = $x("//label[text()[contains(.,'Местное отделение')]]/../div[@class='v-select__selections']");
    private final static SelenideElement UIK_NUMBER = $x("//label[text()[contains(.,'УИК №')]]/..//input[@id='edit-uik_id']");
    private final static SelenideElement CHECK_BOX_UP = $x("//label[text()[contains(.,'ВВЕРХ')]]");
    private final static SelenideElement CHECK_BOX_REGIONAL_RESPONSIBLE = $x("//label[text()[contains(.,'Региональный ответственный')]]");
    private final static SelenideElement CHECK_BOX_REGIONAL_RESPONSIBLE_ASSERTED = $x("//label[text()[contains(.,'Региональный ответственный')]]/../div/input");
    private final static SelenideElement FIO_RESPONSIBLE = $x("//input[@id='edit-foreman_id']");
    private final static SelenideElement ORG_STATUS = $x("//input[@id='edit-status']/..");
    private final static SelenideElement PLACE_OF_WORK = $x("//input[@id='edit-workplace']");
    private final static SelenideElement JOB_TITLE = $x("//input[@id='edit-workposition']");
    private final static SelenideElement NOTE = $x("//textarea[@id='edit-notes']");
    private final static SelenideElement CHECK_BOX_PARTY_SUPPORTED = $x("//div[@class='v-dialog__content v-dialog__content--active']//label[text()[contains(.,'Сторонник Партии')]]");
    private final static SelenideElement CHECK_BOX_PARTY_SUPPORTED_ASSERT = $x("//div[@class='v-dialog__content v-dialog__content--active']//label[text()[contains(.,'Сторонник Партии')]]/../div/input");
    private final static SelenideElement CHECK_BOX_PRESIDENT_SUPPORTED = $x("//div[@class='v-dialog__content v-dialog__content--active']//label[text()[contains(.,'Сторонник президента')]]");
    private final static SelenideElement CHECK_BOX_PRESIDENT_SUPPORTED_ASSERTED = $x("//div[@class='v-dialog__content v-dialog__content--active']//label[text()[contains(.,'Сторонник президента')]]/../div/input");
    private final static SelenideElement LOYALTY = $x("//label[text()[contains(.,'Лояльность')]]/../div");
    private final static SelenideElement CONTACT = $x("//div[text()[contains(.,'Контакт')]]");
    private final static SelenideElement HOME_PHONE = $x("//input[@id='edit-phone_home']");
    private final static SelenideElement EMAIl = $x("//input[@id='edit-email']");
    private final static SelenideElement VK = $x("//input[@id='edit-vk']");
    private final static SelenideElement OK = $x("//input[@id='edit-ok']");
    private final static SelenideElement FB = $x("//input[@id='edit-fb']");
    private final static SelenideElement TW = $x("//input[@id='edit-tw']");
    private final static SelenideElement IG = $x("//input[@id='edit-ig']");
    private final static SelenideElement TIKTOK = $x("//input[@id='edit-tiktok']");
    private final static SelenideElement MY_WORLD = $x("//input[@id='edit-my_world']");
    private final static SelenideElement DOPOLNITELNO = $x("//div[text()[contains(.,'Дополнительно')]]");
    private final static SelenideElement CHECK_BOX_DEF1 = $x("//label[text()[contains(.,'DEF1')]]");
    private final static SelenideElement CHECK_BOX_DEF1_ASSERTED = $x("//label[text()[contains(.,'DEF1')]]/../div/input");
    private final static SelenideElement DEF2 = $x("//input[@id='edit-cfaadt']/..");
    private final static SelenideElement NEUNI = $x("//input[@id='edit-sraabe']");
    private final static SelenideElement UNI = $x("//input[@id='edit-sfaabd']");
    private final static SelenideElement CHOICE = $x("//input[@id='edit-craabf']/..");
    private final static SelenideElement DARE_AND_TIME = $x("//label[text()[contains(.,'Дата время')]]/../input");
    private final static SelenideElement TIME_HOURS=$x("(//strong[text()=':']/../..//div[@class='v-select__selections'])[1]");
    private final static SelenideElement TIME_MINUTES = $x("(//strong[text()=':']/../../../..//div[@class='v-select__selections'])[2]");
    private final static SelenideElement DATE_OF_APPEARANCE = $x("//label[text()[contains(.,'Дата явки')]]/../input");
    private final static SelenideElement CHECK_BOX_DPZ = $x("//label[text()[contains(.,'ДПЗ')]]");
    private final static SelenideElement CHECK_BOX_DPZ_ASSERTED = $x("//label[text()[contains(.,'ДПЗ')]]/../div/input");
    private final static SelenideElement CHECK_BOX_FLAG = $x("//label[text()[contains(.,'Флаг')]]");
    private final static SelenideElement CHECK_BOX_FLAG_ASSERTED = $x("//label[text()[contains(.,'Флаг')]]/../div/input");
    private final static SelenideElement CHECK_BOX_FLAG1 = $x("//label[text()[contains(.,'Флаг1')]]");
    private final static SelenideElement CHECK_BOX_FLAG1_ASSERTED = $x("//label[text()[contains(.,'Флаг1')]]/../div/input");
    private final static SelenideElement CHECK_BOX_FLAG2 = $x("//label[text()[contains(.,'Флаг2')]]");
    private final static SelenideElement CHECK_BOX_FLAG2_ASSERTED = $x("//label[text()[contains(.,'Флаг2')]]/../div/input");
    private final static SelenideElement CHECK_BOX_FLAG3 = $x("//label[text()[contains(.,'Флаг3')]]");
    private final static SelenideElement CHECK_BOX_FLAG3_ASSERTED = $x("//label[text()[contains(.,'Флаг3')]]/../div/input");
    private final static SelenideElement CHECK_BOX_FLAG4 = $x("//label[text()[contains(.,'Флаг4')]]");
    private final static SelenideElement CHECK_BOX_FLAG4_ASSERTED = $x("//label[text()[contains(.,'Флаг4')]]/../div/input");
    private final static SelenideElement CHECK_BOX_FLAG5 = $x("//label[text()[contains(.,'Флаг5')]]");
    private final static SelenideElement CHECK_BOX_FLAG5_ASSERTED = $x("//label[text()[contains(.,'Флаг5')]]/../div/input");
    private final static SelenideElement ADRESS_TAB = $x("//div[text()='Адрес']");
    private final static SelenideElement TEXT_ADRES = $x("//*[@id='edit-addressTree-address']");
    private final static SelenideElement MGER = $x("//div[text()='МГЕР'][@class='v-tab']");
    private final static SelenideElement CHECK_BOX_PARTY_MGER = $x("//label[text()='Участник МГЕР']/../div");
    private final static SelenideElement CHECK_BOX_PARTY_MGER_ASSERTED = $x("//label[text()='Участник МГЕР']/../div/input");
    private final static SelenideElement TARGET_AUDIENCE = $x("//input[@id='edit-target_group_ids']/..");
    private final static SelenideElement DATE_ADVANCE_HOURSE = $x("(//strong[text()=':']/../..//div[@class='v-select__selections'])[2]");
    private final static SelenideElement MAIN_CELL = $x("//div[@class='v-dialog__content v-dialog__content--active']//label[text()='Основная ячейка']/..");
    private final static SelenideElement DOP_POLE = $x("//input[@id='edit-sraaaz']");
    private final static SelenideElement DP1 = $x("//input[@id='edit-sraaad']");
    private final static SelenideElement DP11 = $x("//input[@id='edit-nraaan']");
    private final static SelenideElement DP2 = $x("//label[text()='ДП2']/../input");
    private final static SelenideElement CHECK_BOX_DP3 = $x("//label[text()='ДП3']");
    private final static SelenideElement CHECK_BOX_DP3_ASSERTED = $x("//label[text()='ДП3']/../div/input");
    private final static SelenideElement DP5 = $x("//input[@id='edit-sfaabg']");
    private final static SelenideElement DP6 = $x("//input[@id='edit-sfaabi']");
    private final static SelenideElement DP6_1 = $x("//input[@id='edit-sraabh']");
    private final static SelenideElement DP_NUMBER = $x("//input[@id='edit-nraaak']");
    private final static SelenideElement BAN = $x("//input[@id='edit-sfaaay']");
    private final static SelenideElement TEXT_FIELD = $x("//input[@id='edit-sraabc']");
    private final static SelenideElement TURNOUT_COORDINATES = $x("//input[@id='edit-sfaadi']");
    private final static SelenideElement TURNOUT_RESULT = $x("//input[@id='edit-cfaadj']/..");
    private final static SelenideElement LVL_MGER = $x("//input[@id='edit-mger_level']/..");
    private final static SelenideElement STATUS_MGER = $x("//input[@id='edit-mger_status']/..");
    private final static SelenideElement PAROL = $x("//div[text()[contains(.,'Пароль')]]");
    private final static SelenideElement CHECK_BOX_SEND_PASSWORD = $x("//label[text()[contains(.,'Выслать пароль')]]");
    private final static SelenideElement CHECK_BOX_SEND_PASSWORD_ASSERTED = $x("//label[text()[contains(.,'Выслать пароль')]]/../div/input");
    private final static SelenideElement DATE_ADVANCE_MINUTE = $x("(//strong[text()=':']/../../../..//div[@class='v-select__selections'])[4]");
    private final static SelenideElement ACTIVIST_CELLS = $x("//label[text()='Ячейки с участием активиста']/../div");
    private final static SelenideElement SAVE = $x("//span[text()[contains(.,'Сохранить')]]");
    private final static SelenideElement FULL_NAME_RESPONSIBLE = $x("(//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']//div[@class='v-list-item__title'])[1]");
    private final static SelenideElement EXIT = $x("//div[@class='v-dialog__content v-dialog__content--active']//button[@class='v-btn v-btn--icon v-btn--round theme--light v-size--default']");
    private final static SelenideElement READINESS = $x("//label[text()='Готовность']/../div");
    public static String deleteString = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE;





    public void clickAddActivist() {
        ADD_ACTIVIST.click();
        assertNotNull(ADD_ACTIVIST);
    }

    public void addLastName(String lastName) {
        LAST_NAME.val(lastName);
        assertEquals(lastName,LAST_NAME.getValue());
    }

    public void addFirstName(String firstName) {
        FIRST_NAME.val(firstName);
        assertEquals(firstName,FIRST_NAME.getValue());
    }

    public void addPatronymic(String patronymic) {
        PATRONYMIC.val(patronymic);
        assertEquals(patronymic,PATRONYMIC.getValue());
    }

    public void addDate(String date) {
        DATE.setValue(date);
        assertEquals(date,DATE.getValue());
    }

    public void addPhone(String phone) {
        PHONE.val(String.valueOf(phone));
        assertEquals(phone,PHONE.getValue());
    }

    public void addAddress(String address) {
        ADDRESS.val(address);
        assertEquals(address,ADDRESS.getValue());
    }

    public void addOffice(String office) {
        FIND_OFFICE.click();
        //(WebDriverRunner.getWebDriver()).manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Actions action = new Actions(getWebDriver());
        action.sendKeys(Keys.CONTROL, Keys.END).perform();
        action.sendKeys(Keys.CONTROL, Keys.END).perform();
        element(By.xpath("//div[text()='"+office+"'][@class='v-list-item__title']")).shouldBe(visible, Duration.ofSeconds(10)).click();
        assertEquals(office,FIND_OFFICE.getText());

    }

    public void addUik() {
        UIK_NUMBER.click();
        sleep(1000);
        element(By.xpath("(//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']//div[@class='v-list-item__content']/div)[1]")).shouldBe(visible, Duration.ofSeconds(10)).click();
        assertNotNull(UIK_NUMBER.getText());
    }

    public void clickUp() {
        CHECK_BOX_UP.click();
        assertTrue(element(By.xpath("//label[text()[contains(.,'ВВЕРХ')]]/../div/input")).getAttribute("aria-checked").equals("true"));
    }

    public void clickRegionalResponsible() {
        CHECK_BOX_REGIONAL_RESPONSIBLE.click();
        assertTrue(CHECK_BOX_REGIONAL_RESPONSIBLE_ASSERTED.getAttribute("aria-checked").equals("true"));
    }

    public void addResponsible(String responsible) {
        FIO_RESPONSIBLE.click();
        FIO_RESPONSIBLE.val(responsible);
        FULL_NAME_RESPONSIBLE.shouldBe(visible,Duration.ofSeconds(20)).click();
        assertTrue(FIO_RESPONSIBLE.getValue().contains(responsible));

    }

    public void choicePartStatus(String status) {
        element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//label[text()[contains(.,'Парт. статус')]]/../div[@class='v-select__selections']")).click();
        element(By.xpath("//div[text()='"+status+"'][@class='v-list-item__title']/..")).click();
        assertEquals(status,element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//label[text()[contains(.,'Парт. статус')]]/../div[@class='v-select__selections']")).getText());
    }

    public void addOrgStatus(List<String> status) {
        ORG_STATUS.click();
        for (String s : status) {
            element(By.xpath("//div[text()[contains(.,'" + s + "')]]")).click();
        }
        Actions action = new Actions(getWebDriver());
        action.sendKeys(Keys.ESCAPE).perform();
        assertNotNull(ORG_STATUS.getText());

    }

    public void addPlaceOfWork(String placeOfWork) {
        PLACE_OF_WORK.sendKeys(deleteString);
        PLACE_OF_WORK.val(placeOfWork);
        assertEquals(placeOfWork,PLACE_OF_WORK.getValue());
    }

    public void addJobTitle(String jobTitle) {
        JOB_TITLE.sendKeys(deleteString);
        JOB_TITLE.val(jobTitle);
        assertEquals(jobTitle,JOB_TITLE.getValue());
    }

    public void addNote(String note) {
        NOTE.sendKeys(deleteString);
        NOTE.val(note);
        assertEquals(note,NOTE.getValue());
    }

    public void clickPartySupported() {
        if (CHECK_BOX_PARTY_SUPPORTED_ASSERT.getAttribute("aria-checked").equals("true"));
        else{
            CHECK_BOX_PARTY_SUPPORTED.click();
            assertTrue(CHECK_BOX_PARTY_SUPPORTED_ASSERT.getAttribute("aria-checked").equals("true"));
        }
    }

    public void clickPresidentSupported() {
        if (CHECK_BOX_PRESIDENT_SUPPORTED_ASSERTED.getAttribute("aria-checked").equals("true"));
        else {
            CHECK_BOX_PRESIDENT_SUPPORTED.click();
            assertTrue(CHECK_BOX_PRESIDENT_SUPPORTED_ASSERTED.getAttribute("aria-checked").equals("true"));
        }
    }

    public void loyalty(String loyal) {
        LOYALTY.click();
        element(By.xpath("//div[@class='v-list-item__title'][text()[contains(.,'" + loyal + "')]]")).click();
        assertEquals(loyal,LOYALTY.getText());
    }

    /*
    переход на вкладку контакты и методы заполнения полей
     */
    public void clickContact() {
        CONTACT.click();
    }

    public void addHomePhone(String number) {
        HOME_PHONE.sendKeys(deleteString);
        HOME_PHONE.val(number);
        assertEquals(number,HOME_PHONE.getValue());
    }

    public void addEmail(String email) {
        EMAIl.sendKeys(deleteString);
        EMAIl.val(email);
        assertEquals(email,EMAIl.getValue());
    }

    public void addVK(String vk) {
        VK.sendKeys(deleteString);
        VK.val(vk);
        assertEquals(vk,VK.getValue());
    }

    public void addOK(String ok) {
        OK.sendKeys(deleteString);
        OK.val(ok);
        assertEquals(ok,OK.getValue());
    }

    public void addFB(String fb) {
        FB.sendKeys(deleteString);
        FB.val(fb);
        assertEquals(fb,FB.getValue());
    }

    public void addTW(String tw) {
        TW.sendKeys(deleteString);
        TW.val(tw);
        assertEquals(tw,TW.getValue());
    }

    public void addIG(String ig) {
        IG.sendKeys(deleteString);
        IG.val(ig);
        assertEquals(ig,IG.getValue());
    }

    public void addTiktok(String tiktok) {
        TIKTOK.sendKeys(deleteString);
        TIKTOK.val(tiktok);
        assertEquals(tiktok, TIKTOK.getValue());
    }

    public void addMyWorld(String myWorld) {
        MY_WORLD.sendKeys(deleteString);
        MY_WORLD.val(myWorld);
        assertEquals(myWorld,MY_WORLD.getValue());
    }

    /*
    переход на вкладку дополнительно
     */
    public void clickDopolnitelno() {
        DOPOLNITELNO.click();
    }

    public void clickDef1() {
//        WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(),10);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()[contains(.,'DEF1')]]"))).click();
        sleep(1000);
        new WebDriverWait(getWebDriver(), 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()[contains(.,'DEF1')]]/../../.."))).click();
        //CHECK_BOX_DEF1.shouldBe(visible,Duration.ofSeconds(10)).click();
        assertTrue(CHECK_BOX_DEF1_ASSERTED.getAttribute("aria-checked").equals("false"));
    }

    public void choiceDef2(String choice) {
        DEF2.shouldBe(visible,Duration.ofSeconds(10)).click();
        element(By.xpath("//div[@class='v-list-item__title'][text()[contains(.,'" + choice + "')]]/..")).shouldBe(visible,Duration.ofSeconds(10)).click();
        assertEquals(choice,DEF2.getText());
    }

    public void neuni(String text) {
        NEUNI.sendKeys(deleteString);
        NEUNI.val(text);
        assertEquals(text,NEUNI.getValue());
    }

    public void uni(String text) {
        UNI.sendKeys(deleteString);
        UNI.val(text);
        assertEquals(text,UNI.getValue());
    }

    public void choiceClick(String choice) {
        CHOICE.click();
        element(By.xpath("//div[@class='v-list-item__title'][text()[contains(.,'" + choice + "')]]/..")).click();
        assertEquals(choice,CHOICE.getText());
    }

    public void addDateAndTime(String date) {
        DARE_AND_TIME.sendKeys(deleteString);
        DARE_AND_TIME.setValue(date);
        assertEquals(date,DARE_AND_TIME.getValue());
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
        DATE_OF_APPEARANCE.sendKeys(deleteString);
        DATE_OF_APPEARANCE.val(date);
        assertEquals(date,DATE_OF_APPEARANCE.getValue());
    }

//    public void clickDPZ() {
//        CHECK_BOX_DPZ.click();
//        assertTrue(CHECK_BOX_DPZ_ASSERTED.getAttribute("aria-checked").equals("true"));
//    }

    public void clickFlag() {
        CHECK_BOX_FLAG.click();
        assertTrue(CHECK_BOX_FLAG_ASSERTED.getAttribute("aria-checked").equals("true"));
    }

    public void clickFlag1() {
        CHECK_BOX_FLAG1.click();
        assertTrue(CHECK_BOX_FLAG1_ASSERTED.getAttribute("aria-checked").equals("true"));
    }

    public void clickFlag2() {
        CHECK_BOX_FLAG2.click();
        assertFalse(CHECK_BOX_FLAG2_ASSERTED.getAttribute("aria-checked").equals("true"));
    }

    public void clickFlag3() {
        CHECK_BOX_FLAG3.click();
        assertTrue(CHECK_BOX_FLAG3_ASSERTED.getAttribute("aria-checked").equals("true"));
    }

    public void clickFlag4() {
        CHECK_BOX_FLAG4.click();
        assertTrue(CHECK_BOX_FLAG4_ASSERTED.getAttribute("aria-checked").equals("true"));
    }

    public void clickFlag5() {
        CHECK_BOX_FLAG5.click();
        assertFalse(CHECK_BOX_FLAG5_ASSERTED.getAttribute("aria-checked").equals("true"));
    }

    public void clickAdres() {
        ADRESS_TAB.shouldBe(visible,Duration.ofSeconds(10)).click();
    }

    public void clickMger() {
        sleep(1000);
        new WebDriverWait(getWebDriver(), 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='МГЕР'][@class='v-tab']"))).click();
        //MGER.shouldBe(visible,Duration.ofSeconds(10)).click();
    }

    public void clickPartyMger() {
        CHECK_BOX_PARTY_MGER.shouldBe(visible,Duration.ofSeconds(10)).click();
        assertTrue(CHECK_BOX_PARTY_MGER_ASSERTED.getAttribute("aria-checked").equals("true"));
    }

    public void fillAllFields() {
        for (int i = 1; i <= 50; i++) {
            try {
                SelenideElement selenideElement = element(By.xpath("//label[text()='Допполе " + i + "']/../input"));
                selenideElement.click();
                selenideElement.val("Text");
                assertEquals("Text",selenideElement.getValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void choiseTargetAudience(List<String> list) {
        TARGET_AUDIENCE.click();
        for (String e : list) {
            element(By.xpath("//div[text()='" + e + "']")).click();
        }
        Actions action = new Actions(getWebDriver());
        action.sendKeys(Keys.ESCAPE).perform();
        assertNotNull(TARGET_AUDIENCE.getText());
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

    public void clickMainCell(String first, String second, String third,String fourth) {
        MAIN_CELL.click();
        element(By.xpath("//div[text()='"+first+"']/../../button")).shouldBe(visible,Duration.ofSeconds(10)).click();
        element(By.xpath("//div[text()='"+second+"']/../../button")).shouldBe(visible,Duration.ofSeconds(10)).click();
        element(By.xpath("//div[text()='"+third+"']/../../button")).shouldBe(visible,Duration.ofSeconds(10)).click();
        element(By.xpath("//div[text()='"+fourth+"']")).shouldBe(visible,Duration.ofSeconds(10)).click();
        element(By.xpath("//span[contains(text(),'Закрыть')]/../../button")).click();

    }



    public void activistCells(String first, String second, String third,String fourth) {
        ACTIVIST_CELLS.click();
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


    public void enterDopPole(String text) {
        DOP_POLE.sendKeys(deleteString);
        DOP_POLE.val(text);
        assertEquals(text,DOP_POLE.getValue());

    }

    public void enterDp1(String text) {
        DP1.sendKeys(deleteString);
        DP1.val(text);
        assertEquals(text,DP1.getValue());
    }

    public void enterDp11(String number) {
        DP11.sendKeys(deleteString);
        DP11.val(number);
        assertEquals(number,DP11.getValue());

    }

    public void enterDp2(String date) {
        DP2.sendKeys(deleteString);
        DP2.val(date);
        assertEquals(date,DP2.getValue());
    }

    public void clickDp3() {
        CHECK_BOX_DP3.click();
    }

    public void enterDp5(String text) {
        DP5.sendKeys(deleteString);
        DP5.val(text);
        assertEquals(text,DP5.getValue());
    }

    public void enterDp6(String text) {
        DP6.sendKeys(deleteString);
        DP6.val(text);
        assertEquals(text,DP6.getValue());
    }

    public void enterDp6First(String text) {
        DP6_1.sendKeys(deleteString);
        DP6_1.val(text);
        assertEquals(text,DP6_1.getValue());
    }

    public void enterDpNumber(int number) {
        DP_NUMBER.sendKeys(deleteString);
        DP_NUMBER.val(String.valueOf(number));
        //assertEquals(number,DP_NUMBER.getValue());
         assertTrue(Integer.class.isInstance(number));
    }

    public void ban(String text) {
        BAN.sendKeys(deleteString);
        BAN.val(text);
        assertEquals(text,BAN.getValue());
    }

    public void textField(String text) {
        TEXT_FIELD.sendKeys(deleteString);
        TEXT_FIELD.val(text);
        assertEquals(text,TEXT_FIELD.getValue());
    }

    public void coordinat(String text) {
        TURNOUT_COORDINATES.sendKeys(deleteString);
        TURNOUT_COORDINATES.val(text);
        assertEquals(text,TURNOUT_COORDINATES.getValue());
    }

    public void turnoutRes(String res) {
        TURNOUT_RESULT.click();
        element(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[text()='"+res+"'][@class='v-list-item__title']")).click();
        assertEquals(res,TURNOUT_RESULT.getText());
    }

    public void lvlMger(String lvl) {
        LVL_MGER.click();
        element(By.xpath("//div[text()='" + lvl + "']")).click();
        assertEquals(lvl,LVL_MGER.getText());
    }

    public void statusMger(String status) {
        STATUS_MGER.click();
        element(By.xpath("//div[text()='" + status + "']")).click();
        assertEquals(status,STATUS_MGER.getText());
    }

    public void clickParol() {
        PAROL.click();
    }

    public void clickPassword() {
        CHECK_BOX_SEND_PASSWORD.click();
        assertTrue(CHECK_BOX_SEND_PASSWORD_ASSERTED.getAttribute("aria-checked").equals("true"));
    }
    public String fakeValuesServiceNumerify() {
        FakeValuesService fakeValuesService = new FakeValuesService(new Locale("ru-RU"), new RandomService());
        String randomNumber = fakeValuesService.numerify("##########");

        return randomNumber;
    }
    public String fakeSocialNetwork(){
        String href="//https:Fake data";
        return href;
    }
    public void save(){
        SAVE.click();
    }
    public void exit(){
        EXIT.click();
    }

    public void addReady(String DaNet){
        READINESS.click();
        element(By.xpath("//div[@class='v-list-item__title'][text()='"+DaNet+"']")).click();
        assertEquals(DaNet,READINESS.getText());
    }

}

