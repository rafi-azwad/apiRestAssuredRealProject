package pageObject.filterBasedOnCompletePubElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FilterBasedOnCompletePubElements {
    WebDriver driver;
    By completeAndPublishedXpath= By.xpath("//span[text()=\"Complete & Published\"]");
    public FilterBasedOnCompletePubElements(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void clickOnCompleteAndPublished() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(completeAndPublishedXpath).click();
    }
}
