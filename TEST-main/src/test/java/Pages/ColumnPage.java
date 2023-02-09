package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.Assert.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ColumnPage {
    public final static SelenideElement EDIT_COLUMN=$x("//button[@class='ml-3 settings v-btn v-btn--text theme--light v-size--default']");
    public final static SelenideElement BUTTON_UP=$x("//button[@class='move-up mx-4 my-8 v-btn v-btn--icon v-btn--round v-btn--tile theme--light v-size--large primary--text']");
    public final static SelenideElement SAVED=$x("//button[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    public final static SelenideElement EMAIL=$x("//span[text()='E-mail']");
    public void editColunb(){
        EDIT_COLUMN.click();
    }


    public void settingColumn(String column) {
        int count = 0;
        if (element(By.xpath("//div[text()='" + column + "']/../..//input")).getAttribute("aria-checked").equals("true"))
        {
            Actions action = new Actions(getWebDriver());
            action.sendKeys(Keys.ESCAPE).perform();
        }
        else {
            ElementsCollection elements = $$x("//div[@class='smooth-dnd-container vertical']//div[@class='v-list-item__title']");
            List<String> list = new ArrayList<>();
            for (SelenideElement e : elements) {
                list.add(e.getText());
                if (element(By.xpath("//div[@class='smooth-dnd-container vertical']//div[@class='v-list-item__title'][text()='" + e.getText() + "']/../../div/div/div/div/div/input")).getAttribute("aria-checked").equals("true")) {
                    count++;
                }
            }

            int place = list.indexOf(column);
            for (String l : list) {
                if (l.equals(column)) {
                    element(By.xpath("//div[@class='smooth-dnd-container vertical']//div[@class='v-list-item__title'][text()='" + l + "']/../../div/div/div/div/div/input/../div")).shouldBe(visible, Duration.ofSeconds(10)).click();
                    assertTrue(element(By.xpath("//div[text()='" + l + "']/../..//input")).getAttribute("aria-checked").equals("true"));
                    element(By.xpath("(//div[@class='smooth-dnd-container vertical']//div[@class='v-list-item__title'][text()='" + l + "']/../../div/div/div/div/div/input/../div)[2]")).shouldBe(visible, Duration.ofSeconds(10)).click();
                    assertTrue(element(By.xpath("(//div[text()='" + l + "']/../..//input)[2]")).getAttribute("aria-checked").equals("true"));
                }
            }

            try {
                int up = place - (count);
                clickUp(up);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("Элемент уже видимый");
            }
        }
    }

    public void settingColumn(List<String>columnList){
        int count=0;
        //int place=0;
        ElementsCollection elements=$$x("//div[@class='smooth-dnd-container vertical']//div[@class='v-list-item__title']");
        List<String>list=new ArrayList<>();
        for(SelenideElement e:elements){
            list.add(e.getText());
            if (element(By.xpath("//div[@class='smooth-dnd-container vertical']//div[@class='v-list-item__title'][text()='"+e.getText()+"']/../../div/div/div/div/div/input")).getAttribute("aria-checked").equals("true")){
                count++;
            }
        }
        int place =list.indexOf(columnList.get(0));
        for (String elementColumbList:columnList){
            for (String l:list){
                if (l.equals(elementColumbList)){
                    //place=l.indexOf(elementColumbList);
                    element(By.xpath("//div[@class='v-list-item__title'][text()='"+l+"']/../../div/div/div/div/div/input/../div")).shouldBe(visible, Duration.ofSeconds(10)).click();
                    assertTrue(element(By.xpath("//div[text()='"+l+"']/../..//input")).getAttribute("aria-checked").equals("true"));
                    element(By.xpath("(//div[@class='v-list-item__title'][text()='"+l+"']/../../div/div/div/div/div/input/../div)[2]")).shouldBe(visible, Duration.ofSeconds(10)).click();
                    assertTrue(element(By.xpath("(//div[text()='"+l+"']/../..//input)[2]")).getAttribute("aria-checked").equals("true"));
                }
            }
        }

        try {
            int up = place-(count);
            clickUp(up);
        }catch (ArithmeticException arithmeticException){
            System.out.println("Элемент уже видимый");
        }

    }

    public void clickUp(int count){
        for(int i=1;i<=count;i++){
            BUTTON_UP.click();
        }
    }
    public void saved(){
        SAVED.click();
    }
    public void emailCheck(String examonation){
        assertEquals(examonation,EMAIL.getText());
    }
}
