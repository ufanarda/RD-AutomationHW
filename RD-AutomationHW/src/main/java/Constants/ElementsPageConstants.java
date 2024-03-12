package Constants;

import org.openqa.selenium.By;

public class ElementsPageConstants {

    private ElementsPageConstants(){

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


}
