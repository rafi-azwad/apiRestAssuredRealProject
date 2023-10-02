package pageObject.filterBasdOnStatus_BuyerRequestElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FilterBasedOnStatus_BuyerRequestElements {
    WebDriver driver;
    By clickExternal=By.xpath("(//a[text()=\"Dashboard\"])[1]");
    By clickCollection=By.xpath("//a[text()=\"Collections\"]");

    By statusButtonXpath= By.xpath("//button[text()=\"Status\"]");
    By searchXpath=By.xpath("(//input[@placeholder=\"Search\"])[1]");
    By clickValue=By.xpath("//label[text()=\"Buyer request\"]");

    public FilterBasedOnStatus_BuyerRequestElements(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void clickStatusAndSearch() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(clickExternal).click();
        Thread.sleep(3000);
        driver.findElement(clickCollection).click();
        Thread.sleep(3000);
        driver.findElement(statusButtonXpath).click();
    }
    public void insertValueSelectBox(String status) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(searchXpath).sendKeys(status);
        Thread.sleep(2000);
        driver.findElement(clickValue).click();
    }

}
