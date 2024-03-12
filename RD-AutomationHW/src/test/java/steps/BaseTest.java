package steps;

import driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.PropertyManager;


public class BaseTest {


    public static WebDriver driver;
    Driver webDriver = new Driver();
    PropertyManager propertyManager = new PropertyManager();
    String url = propertyManager.getProperty("APP_URL");




    @Before
    public void before() {
        driver = webDriver.initializeDriver();
        driver.get(url);
        setDriver(driver);
    }



    @After
    public void after() {
        webDriver.quitDriver();
    }


    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        BaseTest.driver = driver;
    }





}


