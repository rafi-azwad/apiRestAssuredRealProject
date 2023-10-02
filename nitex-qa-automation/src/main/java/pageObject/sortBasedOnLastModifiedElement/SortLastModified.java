package pageObject.sortBasedOnLastModifiedElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SortLastModified {
    WebDriver driver;
    By sortingFilterXpath= By.xpath("//div[@class=\"sort-button\"]");
    By lastModifiedXpath=By.xpath("//option[text()=\"Last modified\"]");
    public SortLastModified(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clickFilterAndSelectLastModified() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(sortingFilterXpath).click();
        Thread.sleep(2000);
        driver.findElement(lastModifiedXpath).click();
    }

}
