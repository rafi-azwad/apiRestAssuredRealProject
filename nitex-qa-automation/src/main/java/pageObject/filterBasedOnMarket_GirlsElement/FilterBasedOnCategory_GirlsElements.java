package pageObject.filterBasedOnMarket_GirlsElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FilterBasedOnCategory_GirlsElements {
    WebDriver driver;
    By marketButtonXpath= By.xpath("//button[text()=\"Market\"]");

    By girlsBoxXpath=By.xpath("//span[text()=\"Girls\"]");
    public FilterBasedOnCategory_GirlsElements(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void clickMarketAndSelect() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(marketButtonXpath).click();
        Thread.sleep(2000);
        driver.findElement(girlsBoxXpath).click();
    }
}
