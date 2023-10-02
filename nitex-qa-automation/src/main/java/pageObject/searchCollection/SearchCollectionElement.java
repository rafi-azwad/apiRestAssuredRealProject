package pageObject.searchCollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SearchCollectionElement {
    WebDriver driver;
    By clickCollection=By.xpath("//a[text()=\"Collections\"]");

    By searchIcon=By.cssSelector(".hidden svg");

    //By searchFieldXpath=By.xpath("//input[@name='name']");
    By searchFieldXpath=By.xpath("//input[@placeholder=\"Design number\"]");
    By removeDesignName=By.cssSelector(".chip-close > svg");
    public SearchCollectionElement(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void clickCollection() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(clickCollection).click();
    }
    public void clickSearchAndInsertValue(String collectionName) throws InterruptedException {
        Thread.sleep(6000);
        driver.findElement(searchIcon).click();
        Thread.sleep(4000);
        driver.findElement(searchFieldXpath).sendKeys(collectionName);
        //Thread.sleep(2000);
        //driver.findElement(removeDesignName).click();
    }

}
