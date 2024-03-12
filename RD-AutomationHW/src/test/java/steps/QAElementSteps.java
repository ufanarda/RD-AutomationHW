package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.QADemoElementsPage;


public class QAElementSteps {

    private WebDriver driver = BaseTest.getDriver();
    private QADemoElementsPage elementsPage = new QADemoElementsPage(driver);

    @When("^DemoQA Elements bolumundeki \"(Buttons|Web Tables)\" menusunu ac$")
    public void openElementsMeuPages(String menuname) {
        elementsPage.openElementsMeuPages(menuname);
    }

    @When("Buttons sayfasinda Click Me buttonuna bas")
    public void clickMeButtons() {
        elementsPage.clickMeButtons();
    }

    @Then("Gelen mesajin 'You have done a dynamic click' oldugunu kontrol et")
    public void verifyClickMeBottonsMesage() {
        elementsPage.verifyClickMeBottonsMesage();
    }

    @Given("^Wait for (\\d+) seconds$")
    public void waitForIt(int n) throws InterruptedException {
        elementsPage.waitForIt(n);
    }

    @When("^Web Tables sayfasinda \"(Add|Submit)\" butonuna bas$")
    public void pressWebTablesButtons(String buttonName) {
        elementsPage.pressWebTablesButtons(buttonName);
    }

    @When("^Isim alanini \"([^\"]*)\" olarak doldur$")
    public void fillFirstName(String firstName) {
        elementsPage.fillFirstName(firstName);
    }

    @When("^Soyisim alanini \"([^\"]*)\" olarak doldur$")
    public void fillLastName(String lastName) {
        elementsPage.fillLastName(lastName);
    }

    @When("^E-Posta alanini \"([^\"]*)\" olarak doldur$")
    public void fillEmail(String email) {
        elementsPage.fillEmail(email);
    }

    @When("^Yas alanini \"([^\"]*)\" olarak doldur$")
    public void fillAge(String age) {
        elementsPage.fillAge(age);
    }

    @When("^Gelir alanini \"([^\"]*)\" olarak doldur$")
    public void fillSalary(String salary) {
        elementsPage.fillSalary(salary);
    }

    @When("^Departman alanini \"([^\"]*)\" olarak doldur$")
    public void fillDepartment(String departmant) {
        elementsPage.fillDepartment(departmant);
    }

    @Then("Son girilen kaydi dogrula")
    public void verifyNewEntry() {
        elementsPage.verifyNewEntry();
    }

    @When("Son girilen kaydi editle")
    public void pressLastEntryEdit() {
        elementsPage.pressLastEntryEdit();
    }

}
