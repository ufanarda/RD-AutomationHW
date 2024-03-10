package tests;

import org.testng.annotations.Test;
import pages.QADemoElementsPage;
import pages.QADemoHomePage;

public class Odev15 extends BaseTest{
    @Test
    public void testQAToolsButtonsPage() {
        QADemoElementsPage elementsPage = new QADemoElementsPage(driver);
        QADemoHomePage demoHomePage = new QADemoHomePage(driver);
        demoHomePage.openQADemoPages("Elements");
        elementsPage.openElementsMeuPages("Buttons").clickMeButtons().verifyClickMeBottonsMesage();
    }

    @Test
    public void testQAToolsWebTables() throws InterruptedException {
        QADemoElementsPage elementsPage = new QADemoElementsPage(driver);
        QADemoHomePage demoHomePage = new QADemoHomePage(driver);
        demoHomePage.openQADemoPages("Elements");
        elementsPage.openElementsMeuPages("Web Tables")
                .pressWebTablesButtons("Add")
                .fillFirstName("Arda").fillLastName("Ufan").fillEmail("ufan@arda.com").fillAge("77").fillSalary("5000").fillDepartment("QATest").pressWebTablesButtons("Submit")
                .pressEntryEdit("ufan@arda.com")
                .fillFirstName("Ufan").fillLastName("Arda").fillEmail("arda@ufan.com").fillAge("66").fillSalary("6000").fillDepartment("QAAutomation").pressWebTablesButtons("Submit")
                .waitForIt(5);
    }
}
