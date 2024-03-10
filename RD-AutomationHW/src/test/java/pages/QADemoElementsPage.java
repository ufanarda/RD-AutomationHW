package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import tests.BaseTest;

import java.util.List;

public class QADemoElementsPage extends BasePageUtil {

    private WebDriver driver = BaseTest.getDriver();
    public QADemoElementsPage(WebDriver driver) {
        super(driver);
    }
    public WebDriver getDriver() {
        return driver;
    }
    //MENU BUTTOS
    public static final By BUTTONS_MENU = By.xpath("//*[@id='item-4']//*[text()='Buttons']");
    public static final By WEB_TABLES_MENU = By.xpath("//*[@id='item-3']//*[text()='Web Tables']");

    //BUTTONS PAGE
    public static final By CLICK_ME_BUTTON = By.xpath("//button[text()='Click Me']");
    public static final By CLICK_ME_BUTTON_MSG = By.xpath("//*[@id='dynamicClickMessage']");


    //WEB TABLES PAGE
    public static final By ADD_BUTTON = By.xpath("//button[@id='addNewRecordButton']");
    public static final By SUBMIT_BUTTON = By.xpath("//button[@id='submit']");

    public static final By FIRST_NAME_TXT = By.xpath("//input[@id='firstName']");
    public static final By LAST_NAME_TXT = By.xpath("//input[@id='lastName']");
    public static final By EMAIL_TXT = By.xpath("//input[@id='userEmail']");
    public static final By AGE_TXT = By.xpath("//input[@id='age']");
    public static final By SALARY_TXT = By.xpath("//input[@id='salary']");
    public static final By DEPARTMENT_TXT = By.xpath("//input[@id='department']");




//    public QADemoElementsPage waitForIt(long a) throws InterruptedException {
//        TimeUnit.SECONDS.sleep(a);
//        return this;
//    }
//
//
//    public void clickElement(By by) {
//        driver.findElement(by).click();
//    }
//
//    public void fillTextField(By by, String text) {
//        driver.findElement(by).clear();
//        driver.findElement(by).sendKeys(text);
//    }


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
        return this;
    }

    public QADemoElementsPage fillLastName(String lastname) {
        fillTextField(LAST_NAME_TXT, lastname);
        return this;
    }

    public QADemoElementsPage fillEmail(String email) {
        fillTextField(EMAIL_TXT, email);

        return this;
    }

    public QADemoElementsPage fillAge(String age) {
        fillTextField(AGE_TXT, age);
        return this;
    }

    public QADemoElementsPage fillSalary(String salary) {
        fillTextField(SALARY_TXT, salary);

        return this;
    }

    public QADemoElementsPage fillDepartment(String department) {
        fillTextField(DEPARTMENT_TXT, department);

        return this;
    }


    public int findEntry(String text) {
        List<WebElement> employee_elements = driver.findElements(By.xpath("//div[@role='rowgroup']"));

        int index = 0;
        for (int i = 0; i < employee_elements.size(); i++) {
            if (employee_elements.get(i).getText().contains(text)) {
                index = i + 1;
                System.out.println(employee_elements.get(i).getText());
                break;
            }
        }
        return index;
    }

    public QADemoElementsPage pressEntryEdit(String search) {
        clickElement(By.xpath("//span[@id='edit-record-" + findEntry(search) + "']"));
        return this;
    }

}
