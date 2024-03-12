package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import steps.BaseTest;
import utils.PropertyManager;
import java.util.concurrent.TimeUnit;


public abstract class BasicActions {

    public WebDriver driver = BaseTest.getDriver();
    PropertyManager propertyManager = new PropertyManager();
    String url = propertyManager.getProperty("APP_URL");



    public BasicActions(WebDriver driver) {
        this.driver = driver;
    }




    public void waitForIt(long a) throws InterruptedException {
        TimeUnit.SECONDS.sleep(a);
    }


    public void clickElement(By by) {
        driver.findElement(by).click();
    }

    public void fillTextField(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    public void assertEquals(String actual, String expected){
        Assert.assertEquals(actual, expected);
    }


}
