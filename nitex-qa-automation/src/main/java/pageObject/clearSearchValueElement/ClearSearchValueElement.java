package pageObject.clearSearchValueElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ClearSearchValueElement {
    WebDriver driver;
    By searchIcon=By.cssSelector(".hidden svg");

    //By searchFieldXpath=By.xpath("//input[@name='name']");
    By searchFieldXpath=By.xpath("//input[@placeholder=\"Design number\"]");
    By clickValue=By.xpath("//li[text()=\"SMMWBR7-SD-001\"]");
    By removeDesignName=By.cssSelector(".chip-close > svg");
    public ClearSearchValueElement(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void clickSearchAndInsertValue(String collectionName ) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(searchFieldXpath).sendKeys(collectionName);
        Thread.sleep(3000);
        driver.findElement(clickValue).click();

    }
    public void clickCrossIcon() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(removeDesignName).click();
    }
}
