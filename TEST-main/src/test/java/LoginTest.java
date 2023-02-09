import Pages.*;
import com.codeborne.selenide.WebDriverRunner;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.*;

public class LoginTest extends BaseTest {
    List<String> list = List.of("Член ГС", "Член РПС", "Мун. деп.");
    List<String> targetAudience = List.of("Пенсионер", "Житель многоквартирного дома", "Работник бюджетной сферы");


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/properties.csv")
        public void LoginTest(String addOffice,String addResponsible,
                          String activistCellSelection1,String activistCellSelection2,String activistCellSelection3,String activistCellSelection4,
                          String first,String second,String third,String fourth,
                          String choicePartStatus,
                          String loyalty,String choiceDef2, String choiceClick,String ready,String addHours, String addMinutes,String turnoutRes, String lvlMger, String statusMger) {
        Faker faker = new Faker(new Locale("ru-RU"));

        ActivistPage activistPage = new ActivistPage();
        activistPage.clickAddActivist();
        activistPage.addLastName(faker.address().lastName());
        activistPage.addFirstName(faker.address().firstName());
        activistPage.addPatronymic(faker.address().cityName());

        activistPage.addDate("13.10.2022");
        activistPage.addPhone(activistPage.fakeValuesServiceNumerify());
        activistPage.addAddress(faker.address().streetAddress());
        activistPage.addOffice(addOffice);
        activistPage.addUik();
        activistPage.clickUp();
        activistPage.clickRegionalResponsible();

        activistPage.clickMainCell(activistCellSelection1,activistCellSelection2,activistCellSelection3,activistCellSelection4);

        activistPage.activistCells(first, second, third, fourth);

        activistPage.choicePartStatus(choicePartStatus);
        activistPage.addOrgStatus(list);
        activistPage.addPlaceOfWork(faker.address().fullAddress());
        activistPage.choiseTargetAudience(targetAudience);
        activistPage.addJobTitle(faker.address().lastName());
        activistPage.addNote(faker.address().secondaryAddress());
        activistPage.clickPartySupported();
        activistPage.clickPresidentSupported();
        activistPage.loyalty(loyalty);
        activistPage.clickContact();
        activistPage.addHomePhone(activistPage.fakeValuesServiceNumerify());
        activistPage.addEmail("skala.s@yandex.ru");
        activistPage.addVK(activistPage.fakeSocialNetwork());
        activistPage.addOK(activistPage.fakeSocialNetwork());
        activistPage.addFB(activistPage.fakeSocialNetwork());
        activistPage.addTW(activistPage.fakeSocialNetwork());
        activistPage.addIG(activistPage.fakeSocialNetwork());
        activistPage.addTiktok(activistPage.fakeSocialNetwork());
        activistPage.addMyWorld(activistPage.fakeSocialNetwork());

        activistPage.clickDopolnitelno();
        activistPage.clickDef1();
        activistPage.choiceDef2(choiceDef2);
        activistPage.neuni("Здесь вводится текст для поля NEUNI");
        activistPage.uni("Текст для UNI");
        activistPage.choiceClick(choiceClick);
        activistPage.addReady(ready);

        activistPage.addDateAndTime("13.10.2021");
        activistPage.addHours(addHours);
        activistPage.addMinutes(addMinutes);

        activistPage.addAprearance("14.10.2021");
        activistPage.addHourseDateAdvanceHourse(addHours);
        activistPage.addHourseDateAdvanceMinutse(addMinutes);

        activistPage.enterDopPole("Текст для доп поля");
        activistPage.enterDp1("текст для ДП1");
        activistPage.enterDp2("13.12.2009");
        activistPage.enterDp11("11");
        activistPage.enterDp5("Текст для дп5");
        activistPage.clickDp3();
        activistPage.enterDp6("Текст для дп6");
        activistPage.enterDp6First("Текст для дп6_1");
        activistPage.enterDpNumber(2);
        activistPage.ban("текст для запрета тест");
        activistPage.textField("Текст для поля с ЙЙЙ");
        activistPage.coordinat(faker.address().longitude());
        activistPage.turnoutRes(turnoutRes);
        activistPage.fillAllFields();
        activistPage.clickFlag();
        activistPage.clickFlag1();
        activistPage.clickFlag2();
        activistPage.clickFlag3();
        activistPage.clickFlag4();
        activistPage.clickFlag5();
        activistPage.clickAdres();

        activistPage.clickMger();
        activistPage.clickPartyMger();
        activistPage.lvlMger(lvlMger);
        activistPage.statusMger(statusMger);
        activistPage.clickParol();
        activistPage.clickPassword();
        activistPage.save();
        activistPage.exit();
        WebDriverRunner.getWebDriver().navigate().refresh();
    }
    @Test
    public void editingTest(){
        EditingActivistPage editingActivistPage= new EditingActivistPage();
        editingActivistPage.editClick();
        editingActivistPage.refactorUik("40");
        editingActivistPage.clickPatrySupported();
        editingActivistPage.addActivistToCells("Депутаты","Депутаты ГД","Колунов Сергей Владимирович","Красногорск");
        editingActivistPage.mainCell("Партийные проекты","ПП Жители МКД","Дворовые встречи","Дворовые встречи (Балашиха)");
        editingActivistPage.clickDef1();
        editingActivistPage.clickDef2("ДА");
        editingActivistPage.clickNeuni("JIRAYA");
        editingActivistPage.clickUni("JAVA");
        editingActivistPage.clickChoise("111");
        editingActivistPage.clickReady("Да");

        editingActivistPage.addDateAndTime("13.06.2019");
        editingActivistPage.addHours("13");
        editingActivistPage.addMinutes("17");

        editingActivistPage.addAprearance("13.07.2019");
        editingActivistPage.addHourseDateAdvanceHourse("16");
        editingActivistPage.addHourseDateAdvanceMinutse("10");

        editingActivistPage.fillAllFields();
        editingActivistPage.loyalty("Условно лояльный");
        editingActivistPage.addSupportedPresident();
        editingActivistPage.removeActivist("Депутаты","Депутаты ГД","Колунов Сергей Владимирович","Красногорск");
        editingActivistPage.dopPole("Доп поле");
        editingActivistPage.dopPoleDP1("ДП1");
        editingActivistPage.dopPoleDP11("11");
        editingActivistPage.dopPoleDP2("13.01.2010");
        editingActivistPage.dopPoleDP3();
        editingActivistPage.dopPoleDP5("ДП5");
        editingActivistPage.dopPoleDP6("ДП6");
        editingActivistPage.dopPoleDP6_1("ДП6-1");
        editingActivistPage.dopPoleDpNumber("12313");
        editingActivistPage.dopPoleBan("BAN");
        editingActivistPage.dopPoleJJJ("ййй");
        editingActivistPage.koordinat("13'2 широты");
        editingActivistPage.result("Да");
        editingActivistPage.checkFlag();
        editingActivistPage.checkFlag1();
        editingActivistPage.checkFlag2();
        editingActivistPage.checkFlag3();
        editingActivistPage.checkFlag4();
        editingActivistPage.checkFlag5();
        editingActivistPage.close();


    }
    @Test
    public void editingSingleActivist(){
        sleep(10000);
        Faker faker = new Faker(new Locale("ru-RU"));
        EditingSinglActivistPage single=new EditingSinglActivistPage();
//        WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        single.clickFilter();
        single.addOffice("МО городского округа Долгопрудный");
        single.filterClickAnResponsicle("Да");
        single.clickFilterSaved();

        single.clickPoiskAndSelection("МО городского округа Долгопрудный");
        single.clickRefactor();
        single.refactorLastName(faker.address().lastName());
        single.refFirstName(faker.address().firstName());
        single.refPatronymic("Михайлович");
        single.refDate("12.10.2009");
        single.refNumber("9660777733");
        single.refAdress(faker.address().fullAddress());
        single.refLocalBranch("МО городского округа Воскресенск");
        single.addUik();
        single.clickUp();
        single.clickResponsible();
        ActivistPage activist=new ActivistPage();
        activist.addResponsible("ААА");
        activist.clickMainCell("Депутаты","Депутаты ГД","Колунов Сергей Владимирович","Красногорск");
        activist.activistCells("Партийные проекты","ПП Жители МКД","Дворовые встречи","Дворовые встречи (Балашиха)");
        activist.choicePartStatus("сторонник");

        single.addOrgStatus(list);

        activist.addPlaceOfWork(faker.address().fullAddress());
        single.refAudience(targetAudience);

        //activist.choiseTargetAudience(targetAudience);
        activist.addJobTitle("Связист");

        activist.addNote(faker.address().secondaryAddress());
        activist.clickPartySupported();
        activist.clickPresidentSupported();
        single.loyalty("Условно лояльный");
        activist.clickContact();

        activist.addHomePhone("9660768845");
        activist.addEmail("skala.s@yandex.ru");
        activist.addVK(activist.fakeSocialNetwork());
        activist.addOK(activist.fakeSocialNetwork());
        activist.addFB(activist.fakeSocialNetwork());
        activist.addTW(activist.fakeSocialNetwork());
        activist.addIG(activist.fakeSocialNetwork());
        activist.addTiktok(activist.fakeSocialNetwork());
        activist.addMyWorld(activist.fakeSocialNetwork());

        activist.clickDopolnitelno();
        //activistPage.clickDef1();
        activist.choiceDef2("ДА");
        activist.neuni("Здесь вводится текст для поля NEUNI");
        activist.uni("Текст для UNI");
        activist.choiceClick("111");
        single.ready("Да");

        activist.addDateAndTime("13.10.2021");
        activist.addHours("13");
        activist.addMinutes("13");

        activist.addAprearance("14.10.2021");
        activist.addHourseDateAdvanceHourse("12");
        activist.addHourseDateAdvanceMinutse("12");

        activist.enterDopPole("Текст для доп поля");
        activist.enterDp1("текст для ДП1");
        activist.enterDp2("13.12.2009");
        activist.enterDp11("11");
        activist.enterDp5("Текст для дп5");
        single.dp3();
        activist.enterDp6("Текст для дп6");
        activist.enterDp6First("Текст для дп6_1");
        activist.enterDpNumber(2);
        activist.ban("текст для запрета тест");
        activist.textField("Текст для поля с ЙЙЙ");
        activist.coordinat(faker.address().longitude());
        activist.turnoutRes("Да");
        single.fillAllFields();
        single.flag();
        single.flag1();
        single.flag2();
        single.flag3();
        single.flag4();
        single.flag5();
        activist.clickAdres();


        activist.clickMger();
        single.clickPartyMger();
        activist.lvlMger("Федеральный");
        activist.statusMger("Член Политического совета");
        activist.clickParol();
        single.parol();
        //activist.save();
        activist.exit();
    }
    /*
    Тест с фильтром УИК, Парт. Статус и датой создания
     */
    @Test
    public void filter1(){
        String uik="211";
        String partStatus="беспартийный";
        String addDateCreate="04.03.2022";
        String responsibleBOOLEAN="Нет";
        String localBranch="Истринское МО Московской области в границах г.о. Истра Московской области и г.о. Восход Московской области";

        EditingSinglActivistPage single=new EditingSinglActivistPage();
        single.clickFilter();
        FilterPage filter=new FilterPage();
        filter.uik(uik);
        single.addOffice(localBranch);
        filter.responsible(responsibleBOOLEAN);
        filter.partStatus(partStatus);
        filter.addDateCreate(addDateCreate);
        single.clickFilterSaved();
        //filter.examinationFilter(responsibleBOOLEAN,uik,partStatus,addDateCreate,localBranch);

    }
    @Test
    public void listColumn(){
        List<String>columnList= List.of("Допполе 1","Допполе 11");
        ColumnPage columnPage=new ColumnPage();
        WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //sleep(10000);
        columnPage.editColunb();
        columnPage.settingColumn(columnList);
    }
    @Test
    public void emailColumn(){
        ColumnPage columnPage=new ColumnPage();
        WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sleep(10000);
        columnPage.editColunb();
        columnPage.settingColumn("E-mail");
        columnPage.saved();
        columnPage.emailCheck("E-mail");

    }
    @Test
    public void sendPassword(){
        String email="bezotv@mail.ru";
        ColumnPage columnPage=new ColumnPage();
        sleep(10000);
        //WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        columnPage.editColunb();
        columnPage.settingColumn("E-mail");
        columnPage.saved();
        columnPage.emailCheck("E-mail");

        EditingSinglActivistPage single=new EditingSinglActivistPage();
        single.clickFilter();
        single.filterClickAnResponsicle("Да");
        //bitware@yandex.ru
        single.addEmail(email);
        single.clickFilterSaved();
        sleep(5000);
        single.poiskEmail(email);
    }
}
