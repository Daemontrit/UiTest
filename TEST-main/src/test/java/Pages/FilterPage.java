package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.Assert.*;
public class FilterPage {
    private final static SelenideElement UIK=$x("//input[@id='search-uik_id']");
    private final static SelenideElement RESPONSIBLE_EXAMINATION=$x("//div[@class='v-data-table__wrapper']//tbody//td[2]");
    private final static SelenideElement LOCAL_BRANCH_EXAMINATION=$x("//div[@class='v-data-table__wrapper']//tbody//td[7]");
    private final static SelenideElement DATE_CREATION_EXAMINATION=$x("//div[@class='v-data-table__wrapper']//tbody//td[3]");
    private final static SelenideElement UIK_EXAMINATION=$x("//div[@class='v-data-table__wrapper']//tbody//td[4]");
    private final static SelenideElement PART_STATUS_EXAMINATION=$x("//div[@class='v-data-table__wrapper']//tbody//td[5]");
    private final static SelenideElement PART_STATUS=$x("//label[text()='Парт. статус']/../div");
    private final static SelenideElement DATE_CREATION=$x("//label[text()='Дата создания']/../div[@class='row mb-4 no-gutters align-end']//label[text()='с']/../input");
    private final static SelenideElement RESPONSIBLE=$x("//div[@class='v-dialog__content v-dialog__content--active']//label[text()='Ответственный']/../div");


    public void uik(String uik){
        UIK.click();
        new WebDriverWait(getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='v-list v-select-list v-sheet theme--light theme--light']/div")));
        UIK.val(uik);
        element($x("//span[text()='"+211+"']")).shouldBe(visible,Duration.ofSeconds(10)).click();
        assertEquals(uik,UIK.getValue());
    }
    public void partStatus(String status){
        PART_STATUS.click();
        element($x("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[text()='"+status+"']")).click();
        assertEquals(status,PART_STATUS.getText());
    }
    public void addDateCreate(String date){
        DATE_CREATION.click();
        DATE_CREATION.val(date);
        Actions actions=new Actions(getWebDriver());
        actions.sendKeys(Keys.ESCAPE).perform();
        assertEquals(date,DATE_CREATION.getValue());
    }
    public void examinationFilter(String responsible,String uik, String partStatus,String addDateCreate, String localBeanch){
        sleep(5000);
        assertEquals(responsible,RESPONSIBLE_EXAMINATION.getText());
        assertEquals(uik,UIK_EXAMINATION.getText());
        assertEquals(partStatus,PART_STATUS_EXAMINATION.getText());
        assertTrue(DATE_CREATION_EXAMINATION.getText().contains(addDateCreate));
        assertEquals(localBeanch,LOCAL_BRANCH_EXAMINATION.getText());

    }
    public void responsible(String responsible){
        RESPONSIBLE.click();
        element($x("//div[text()='"+responsible+"']")).click();
        assertEquals(responsible,RESPONSIBLE.getText());
    }
}
