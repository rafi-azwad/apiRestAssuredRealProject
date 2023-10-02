package pageObject.filterBasedOnMarket_WomanElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FilterBasedOnMarket_WomanElement {
    WebDriver driver;
    By clickCollection=By.xpath("//a[text()=\"Collections\"]");
    By marketButtonXpath= By.xpath("//button[text()=\"Market\"]");
    By womanBoxXpath=By.xpath("//span[text()=\"Women\"]");
    public FilterBasedOnMarket_WomanElement(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void clickMarketAndSelectWoman() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(clickCollection).click();
        Thread.sleep(3000);
        driver.findElement(marketButtonXpath).click();
        Thread.sleep(2000);
        driver.findElement(marketButtonXpath).click();
        Thread.sleep(3000);
        driver.findElement(womanBoxXpath).click();
    }

}
