package pageObject.filterBasedOnMarket_InfantElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FilterBasedOnMarket_InfantElement {
    WebDriver driver;
    By marketButtonXpath= By.xpath("//button[text()=\"Market\"]");
    By infantXpath=By.xpath("//span[text()=\"Infant\"]");
    public FilterBasedOnMarket_InfantElement(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void clickMarketAndSelect() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(marketButtonXpath).click();
        Thread.sleep(2000);
        driver.findElement(marketButtonXpath).click();
        Thread.sleep(2000);
        driver.findElement(infantXpath).click();
    }
}
