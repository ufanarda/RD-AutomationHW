package tests;

import driver.Driver;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.PropertyManager;

public class BaseTest {


    public static WebDriver driver;
    Driver webDriver = new Driver();
    PropertyManager propertyManager = new PropertyManager();
    String url = propertyManager.getProperty("APP_URL");




    @BeforeMethod()
    public void before() {
        driver = webDriver.initializeDriver(driver);
        driver.get(url);
        setDriver(driver);
    }



    @AfterMethod()
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


