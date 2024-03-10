package steps;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.QADemoElementsPage;
import tests.BaseTest;


public class QAElementSteps {

    private WebDriver driver = BaseTest.getDriver();
    private QADemoElementsPage elementsPage = new QADemoElementsPage(driver);

    @When("^DemoQA Elements bolumundeki \"(Buttons|Web Tables)\" menusunu ac$")
    public void openElementsMeuPages(String menuname){
        elementsPage.openElementsMeuPages(menuname);
    }

    @And("Buttons sayfasinda Click Me buttonuna bas")
    public void clickMeButtons(){
        elementsPage.clickMeButtons();
    }

    @Then("Gelen mesajin 'You have done a dynamic click' oldugunu kontrol et")
    public void verifyClickMeBottonsMesage(){
        elementsPage.verifyClickMeBottonsMesage();
    }


    @Given("^Wait for (\\d+) seconds$")
    public void waitForIt(int n) throws InterruptedException {elementsPage.waitForIt(n);}




}
