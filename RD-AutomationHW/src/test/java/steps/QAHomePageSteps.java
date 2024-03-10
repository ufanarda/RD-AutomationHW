package steps;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.QADemoHomePage;
import tests.BaseTest;

public class QAHomePageSteps {

    private WebDriver driver = BaseTest.getDriver();
    private QADemoHomePage demoHomePage = new QADemoHomePage(driver);


    @When("^DemoQA Ana sayfasinda \"(Elements|Forms|Alerts, Frame & Windows|Widgets|Interactions)\" sayfasini ac$")
    public void QADemoHomePage(String menuname) {
        demoHomePage.openQADemoPages(menuname);
    }
}
