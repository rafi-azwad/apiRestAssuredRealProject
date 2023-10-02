package pageObject.clearSortingOptionElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ClearSortingOptionElements {
    WebDriver driver;
   // By sortingFilterXpath= By.xpath("//div[@class=\"sort-button\"]");
    By sortingFilterXpath=By.xpath("//select[@name=\"sort\"]");
    By lastModifiedXpath=By.xpath("//option[text()=\"Last modified\"]");
   // By clearLastModified=By.cssSelector(".chip-close path");
    By clearLastModified=By.xpath("//span[@class=\"chip-close cursor-pointer\"]");
    public ClearSortingOptionElements(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    public void filterAndSelectLastModified() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(sortingFilterXpath).click();
        Thread.sleep(2000);
        driver.findElement(lastModifiedXpath).click();

    }
    public void clickOnCrossIcon() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(clearLastModified).click();
    }

}
