package pageObject.filterBasedOnmineElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FilterBasedOnMineElements {
    WebDriver driver;
    By mineFilterXpath= By.xpath("//span[text()=\"Mine\"]");
    public FilterBasedOnMineElements(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void clickMineFilter() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(mineFilterXpath).click();
    }

}
