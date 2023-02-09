package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.Assert.*;

public class EditingSinglActivistPage {
    private final static SelenideElement FILTER=$x("//span[text()='Фильтры']/..");
    private final static SelenideElement FILTER_SAVED=$x("//span[text()[contains(.,'Фильтровать')]]/..");
    private final static SelenideElement RESPONSIBLE=$x("//input[@id='search-is_foreman']/..");
    private final static SelenideElement POISK_FIO=$x("//label[text()='ФИО/телефон активиста']/../input");
    private final static SelenideElement FIRST_ELEMENT_OF_THE_LIST=$x("//div[@class='v-data-table__wrapper']//tbody/tr/td[@class='text-start']");
    private final static SelenideElement EDIT=$x("//button[@class='v-btn v-btn--icon v-btn--plain v-btn--round theme--light v-size--default edit']");
    private final static SelenideElement LAST_NAME=$x("//input[@id='edit-last_name']");
    private final static SelenideElement FIRST_NAME=$x("//input[@id='edit-first_name']");
    private final static SelenideElement PATRONYMIC=$x("//input[@id='edit-patronymic']");
    private final static SelenideElement MOBILE_NUMBER=$x("//input[@id='edit-phone_mobile']");
    private final static SelenideElement ADRESS=$x("//textarea[@id='edit-address']");
    private final static SelenideElement LOCAL_BRANCH=$x("//input[@id='edit-branch_id']/..");
    private final static SelenideElement DATE=$x("//label[text()='Дата рождения']/../input");
    private final static SelenideElement UIK_NUMBER = $x("//label[text()[contains(.,'УИК №')]]/..//input[@id='edit-uik_id']");
    private final static SelenideElement CHECK_BOX_UP = $x("//div[@class='v-input v-input--hide-details theme--light v-input--selection-controls v-input--checkbox']//label[text()[contains(.,'ВВЕРХ')]]/../div");
    private final static SelenideElement FIO_RESPONSIBLE = $x("//input[@id='edit-foreman_id']");
    private final static SelenideElement FULL_NAME_RESPONSIBLE = $x("(//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']//div[@class='v-list-item__title'])[1]");
    private final static SelenideElement FIND_OFFICE = $x("//label[text()[contains(.,'Местное отделение')]]/../div[@class='v-select__selections']");
    private final static SelenideElement CHECK_BOX_RESPONSIBLE = $x("//div[@class='v-dialog__content v-dialog__content--active']//label[text()[contains(.,'Ответственный')]]/../div");
    private final static SelenideElement CHECK_BOX_RESPONSIBLE_ASSERTED = $x("//div[@class='v-dialog__content v-dialog__content--active']//label[text()[contains(.,'Ответственный')]]/../div/input");
    private final static SelenideElement ORG_STATUS = $x("//input[@id='edit-status']/..");
    private final static SelenideElement LOYALTY = $x("//div[@class='v-dialog__content v-dialog__content--active']//label[text()='Лояльность']/../div[@class='v-select__selections']");
    private final static SelenideElement TARGET_AUDIENCE = $x("//input[@id='edit-target_group_ids']/../..");
    private final static SelenideElement DP3 = $x("//div[@class='row mb-5 no-gutters']//label[text()='ДП3']/../div");
    private final static SelenideElement DP3_ASSERTED = $x("//div[@class='row mb-5 no-gutters']//label[text()='ДП3']/../div/input");
    private final static SelenideElement READY = $x("//input[@id='edit-cfaaso']/..");

    private final static SelenideElement FLAG = $x("//div[@class='row mb-5 no-gutters']//label[text()='Флаг']");
    private final static SelenideElement FLAG_ASSERTED = $x("//div[@class='row mb-5 no-gutters']//label[text()='Флаг']/..//input");

    private final static SelenideElement FLAG1 = $x("//div[@class='row mb-5 no-gutters']//label[text()='Флаг1']");
    private final static SelenideElement FLAG1_ASSERTED = $x("//div[@class='row mb-5 no-gutters']//label[text()='Флаг1']/..//input");

    private final static SelenideElement FLAG2 = $x("//div[@class='row mb-5 no-gutters']//label[text()='Флаг2']");
    private final static SelenideElement FLAG2_ASSERTED = $x("//div[@class='row mb-5 no-gutters']//label[text()='Флаг2']/..//input");

    private final static SelenideElement FLAG3 = $x("//div[@class='row mb-5 no-gutters']//label[text()='Флаг3']");
    private final static SelenideElement FLAG3_ASSERTED = $x("//div[@class='row mb-5 no-gutters']//label[text()='Флаг3']/..//input");

    private final static SelenideElement FLAG4 = $x("//div[@class='row mb-5 no-gutters']//label[text()='Флаг4']");
    private final static SelenideElement FLAG4_ASSERTED = $x("//div[@class='row mb-5 no-gutters']//label[text()='Флаг4']/..//input");

    private final static SelenideElement FLAG5 = $x("//div[@class='row mb-5 no-gutters']//label[text()='Флаг5']");
    private final static SelenideElement FLAG5_ASSERTED = $x("//div[@class='row mb-5 no-gutters']//label[text()='Флаг5']/..//input");
    private final static SelenideElement CHECK_BOX_PARTY_MGER = $x("//div[@class='v-dialog__content v-dialog__content--active']//label[text()='Участник МГЕР']/../div");
    private final static SelenideElement CHECK_BOX_PARTY_MGER_ASSERTED = $x("//div[@class='v-dialog__content v-dialog__content--active']//label[text()='Участник МГЕР']/../div/input");
    private final static SelenideElement CHECK_BOX_PAROL = $x("//label[text()[contains(.,'Сбросить и выслать пароль')]]/../div");
    private final static SelenideElement CHECK_BOX_PAROL_ASSERTED = $x("//label[text()[contains(.,'Сбросить и выслать пароль')]]/../div/input");

    private final static SelenideElement EMAIL_ID = $x("//input[@id='search-email']");
    public static String deleteString = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE;


    ElementsCollection elements=$$x("//tbody/tr/td");

    public void poiskEmail(String email){
        for (SelenideElement e : elements) {
            if (e.getText().equals(email)){
                assertTrue(email,e.getText().equals(email));
            }
        }

    }

    public void addEmail(String email){
        EMAIL_ID.val(email);
    }

    public void clickFilter(){
        FILTER.click();
    }
    public void addOffice(String office) {

        FIND_OFFICE.click();

        scroll();
        element(By.xpath("//div[text()='"+office+"'][@class='v-list-item__title']")).shouldBe(visible, Duration.ofSeconds(10)).click();
        assertEquals(office,FIND_OFFICE.getText());

    }
    public void scroll(){
        Actions action = new Actions(getWebDriver());
        action.sendKeys(Keys.CONTROL, Keys.END).perform();
        action.sendKeys(Keys.CONTROL, Keys.END).perform();
    }
    public void filterClickAnResponsicle(String unResponsible){
        RESPONSIBLE.click();
        element(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list-item__title'][text()='"+unResponsible+"']")).shouldBe(visible,Duration.ofSeconds(10)).click();
        assertEquals(unResponsible,RESPONSIBLE.getText());
    }
    public void clickFilterSaved(){
        FILTER_SAVED.shouldBe(visible,Duration.ofSeconds(10)).click();
    }
    public void clickPoiskAndSelection(String fio){
//        POISK_FIO.val(fio);
//        assertEquals(fio,POISK_FIO.getValue());
        new WebDriverWait(getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//td[text()[contains(.,'"+fio+"')]]"))).click();
    }
    public void clickRefactor(){
        new WebDriverWait(getWebDriver(), 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='v-btn v-btn--icon v-btn--plain v-btn--round theme--light v-size--default edit']"))).click();

    }
    public void refactorLastName(String lastName){
        LAST_NAME.sendKeys(deleteString);
        LAST_NAME.val(lastName);
        assertEquals(lastName,LAST_NAME.getValue());
    }
    public void refFirstName(String firstName){
        FIRST_NAME.sendKeys(deleteString);
        FIRST_NAME.val(firstName);
        assertEquals(firstName,FIRST_NAME.getValue());
    }
    public void refPatronymic(String patronymic){
        PATRONYMIC.sendKeys(deleteString);
        PATRONYMIC.val(patronymic);
        assertEquals(patronymic,PATRONYMIC.getValue());
    }
    public void refDate(String date){
        DATE.sendKeys(deleteString);
        DATE.val(date);
        assertEquals(date,DATE.getValue());
    }
    public void refNumber(String number){
        MOBILE_NUMBER.sendKeys(deleteString);
        MOBILE_NUMBER.val(number);
        assertEquals(number,MOBILE_NUMBER.getValue());
    }
    public void refAdress(String adress){
        ADRESS.sendKeys(deleteString);
        ADRESS.val(adress);
        assertEquals(adress,ADRESS.getValue());
    }
    public void refLocalBranch(String branch){
        LOCAL_BRANCH.click();
        Actions action = new Actions(getWebDriver());
        action.sendKeys(Keys.CONTROL, Keys.END).perform();
        element(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[text()='"+branch+"'][@class='v-list-item__title']")).shouldBe(visible,Duration.ofSeconds(10)).click();
        assertEquals(branch,LOCAL_BRANCH.getText());
    }
    public void addUik() {
        UIK_NUMBER.click();
        element(By.xpath("(//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']//div[@class='v-list-item__content']/div)[1]")).shouldBe(visible, Duration.ofSeconds(10)).click();
        assertNotNull(UIK_NUMBER.getText());
    }
    public void clickUp() {

            CHECK_BOX_UP.click();
            assertTrue(element(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//label[text()[contains(.,'ВВЕРХ')]]/../div/input")).getAttribute("aria-checked").equals("true"));
        }

    public void clickResponsible(){
        CHECK_BOX_RESPONSIBLE.click();
        assertTrue(CHECK_BOX_RESPONSIBLE_ASSERTED.getAttribute("aria-checked").equals("false"));
    }
    public void addOrgStatus(List<String> status) {
        List<String> list=new ArrayList<>();
        ORG_STATUS.click();
        ElementsCollection element=$$x("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list v-select-list v-sheet theme--light theme--light']//div[@class='v-list-item__title']");
        for(SelenideElement elem:element){
            list.add(elem.getText());
        }
        for (String spisok:list){
            if (element(By.xpath("//div[@class='v-list v-select-list v-sheet theme--light theme--light']//div[text()[contains(.,'"+spisok+"')]]/../..")).getAttribute("aria-selected").equals("true")){
                element(By.xpath("//div[text()[contains(.,'" + spisok + "')]]")).click();
            }
        }
        for (String s : status) {
            element(By.xpath("//div[text()[contains(.,'" + s + "')]]")).click();
        }
        Actions action = new Actions(getWebDriver());
        action.sendKeys(Keys.ESCAPE).perform();
        assertNotNull(ORG_STATUS.getText());

    }
    public void refAudience(List<String> audience) {
        List<String> list=new ArrayList<>();
        TARGET_AUDIENCE.click();
        ElementsCollection element=$$x("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list v-select-list v-sheet theme--light theme--light']//div[@class='v-list-item__title']");
        for(SelenideElement elem:element){
            list.add(elem.getText());
        }
        for (String spisok:list){
            if (element(By.xpath("//div[@class='v-list v-select-list v-sheet theme--light theme--light']//div[text()[contains(.,'"+spisok+"')]]/../..")).getAttribute("aria-selected").equals("true")){
                element(By.xpath("//div[text()[contains(.,'" + spisok + "')]]")).click();
            }
        }
        for (String s : audience) {
            element(By.xpath("//div[text()[contains(.,'" + s + "')]]")).click();
        }
        Actions action = new Actions(getWebDriver());
        action.sendKeys(Keys.ESCAPE).perform();
        assertNotNull(ORG_STATUS.getText());

    }
    public void loyalty(String loyalty){
        LOYALTY.click();
        element($x("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[text()='"+loyalty+"']/..")).click();
        assertEquals(loyalty,LOYALTY.getText());
    }
    public void ready(String ready){
        READY.click();
        element($x("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[text()='"+ready+"']")).shouldBe(visible,Duration.ofSeconds(10)).click();
        assertEquals(ready,READY.getText());
    }
    public void dp3(){
        if (DP3_ASSERTED.getAttribute("aria-checked").equals("true"));
        else {
            DP3.click();
            assertTrue(DP3_ASSERTED.getAttribute("aria-checked").equals("true"));
        }
    }
    public void flag(){
        if (FLAG_ASSERTED.getAttribute("aria-checked").equals("true"));
        else {
            FLAG.click();
            assertTrue(FLAG_ASSERTED.getAttribute("aria-checked").equals("true"));
        }
    }
    public void flag1(){
        if (FLAG1_ASSERTED.getAttribute("aria-checked").equals("true"));
        else {
            FLAG1.click();
            assertTrue(FLAG1_ASSERTED.getAttribute("aria-checked").equals("true"));
        }
    }
    public void flag2(){
        if (FLAG2_ASSERTED.getAttribute("aria-checked").equals("true"));
        else {
            FLAG2.click();
            assertTrue(FLAG2_ASSERTED.getAttribute("aria-checked").equals("true"));
        }
    }
    public void flag3(){
        if (FLAG3_ASSERTED.getAttribute("aria-checked").equals("true"));
        else {
            FLAG3.click();
            assertTrue(FLAG3_ASSERTED.getAttribute("aria-checked").equals("true"));
        }
    }
    public void flag4(){
        if (FLAG4_ASSERTED.getAttribute("aria-checked").equals("true"));
        else {
            FLAG4.click();
            assertTrue(FLAG4_ASSERTED.getAttribute("aria-checked").equals("true"));
        }
    }
    public void flag5(){
        if (FLAG5_ASSERTED.getAttribute("aria-checked").equals("true"));
        else {
            FLAG5.click();
            assertTrue(FLAG5_ASSERTED.getAttribute("aria-checked").equals("true"));
        }
    }
    public void clickPartyMger(){
        if (CHECK_BOX_PARTY_MGER_ASSERTED.getAttribute("aria-checked").equals("true"));
        else {
            CHECK_BOX_PARTY_MGER.click();
            assertTrue(CHECK_BOX_PARTY_MGER_ASSERTED.getAttribute("aria-checked").equals("true"));
        }
    }
    public void parol(){
        CHECK_BOX_PAROL.click();
        assertTrue(CHECK_BOX_PAROL_ASSERTED.getAttribute("aria-checked").equals("true"));
    }
    public void fillAllFields() {
        for (int i = 1; i <= 50; i++) {
            try {
                SelenideElement selenideElement = element(By.xpath("//div[@class='row mb-5 no-gutters']//label[text()='Допполе " + i + "']/../input"));
                selenideElement.click();
                selenideElement.sendKeys(deleteString);
                selenideElement.val("Text");
                assertEquals("Text",selenideElement.getValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }




}
