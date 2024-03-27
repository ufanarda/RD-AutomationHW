package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static Constants.ElementsPageConstants.*;

public class QADemoElementsPage extends BasePageUtil {

    public QADemoElementsPage(WebDriver driver) {
        super(driver);
    }


    private String yeniKayit;

    private List<WebElement> employee_elements = new ArrayList<>();


    public QADemoElementsPage openElementsMeuPages(String menuname) {

        switch (menuname) {
            case "Buttons":
                //driver.findElement(BUTTONS_MENU).click();
                clickElement(BUTTONS_MENU);
                break;
            case "Web Tables":
                clickElement(WEB_TABLES_MENU);
                break;
        }

        return this;
    }


    public QADemoElementsPage clickMeButtons() {
        clickElement(CLICK_ME_BUTTON);
        return this;
    }

    public QADemoElementsPage verifyClickMeBottonsMesage() {
        String message = driver.findElement(CLICK_ME_BUTTON_MSG).getText();
        Assert.assertEquals(message, "You have done a dynamic click");
        return this;
    }

    public QADemoElementsPage pressWebTablesButtons(String button) {
        switch (button) {
            case "Add":
                clickElement(ADD_BUTTON);

                break;
            case "Submit":
                clickElement(SUBMIT_BUTTON);
                break;

        }
        return this;
    }

    public QADemoElementsPage fillFirstName(String name) {
        fillTextField(FIRST_NAME_TXT, name);
        setYeniKayit(name);
        return this;
    }

    public QADemoElementsPage fillLastName(String lastname) {
        fillTextField(LAST_NAME_TXT, lastname);
        setYeniKayit(lastname);
        return this;
    }

    public QADemoElementsPage fillEmail(String email) {
        fillTextField(EMAIL_TXT, email);
        setYeniKayit(email);
        return this;
    }

    public QADemoElementsPage fillAge(String age) {
        fillTextField(AGE_TXT, age);
        setYeniKayit(age);
        return this;
    }

    public QADemoElementsPage fillSalary(String salary) {
        fillTextField(SALARY_TXT, salary);
        setYeniKayit(salary);
        return this;
    }

    public QADemoElementsPage fillDepartment(String department) {
        fillTextField(DEPARTMENT_TXT, department);
        setYeniKayit(department);
        return this;
    }


    public int findEntry(String text) {
        int index = 0;
        for (int i = 0; i < getEmployeeList().size(); i++) {
            if (getEmployeeList().get(i).getText().contains(text)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Step("Yeni girilen veya degistirilen bilgiler kontrol edilir")
    public QADemoElementsPage verifyNewEntry(){
        setEmployeeList(driver.findElements(By.xpath("//div[@role='rowgroup']")));
        int index = findEntry(getYeniKayit());
        assertEquals(getEmployeeList().get(index).getText(),getYeniKayit());
        return this;
    }


    public QADemoElementsPage pressLastEntryEdit() {
        int index = findEntry(getYeniKayit())+1;
        clickElement(By.xpath("//span[@id='edit-record-" + index + "']"));
        deleteYeniKayit();
        return this;
    }


    public void setEmployeeList(List<WebElement> elist) {
        employee_elements = elist;
    }

    public List<WebElement> getEmployeeList() {
        return employee_elements;
    }


    public void setYeniKayit(String kayit) {
        yeniKayit = yeniKayit + "\n" + kayit;
    }

    public void deleteYeniKayit() {
        yeniKayit = null;
    }

    public String getYeniKayit() {
        return yeniKayit.replaceAll("null\n", "");
    }

}
