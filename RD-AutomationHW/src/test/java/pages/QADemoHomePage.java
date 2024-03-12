package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QADemoHomePage extends BasePageUtil {

    public QADemoHomePage(WebDriver driver) {
        super(driver);
    }



    public QADemoHomePage openQADemoPages(String name){
        clickElement(By.xpath("//h5[normalize-space()='"+name+"']"));
        return this;
    }

}
