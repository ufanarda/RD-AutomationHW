package driver;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Driver {
    public static WebDriver driver;

    public static WebDriver initializeDriver(WebDriver driver) {
        driver = DriverFactory.getDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        return driver;
    }


    public void quitDriver() {
        driver.quit();
    }
}