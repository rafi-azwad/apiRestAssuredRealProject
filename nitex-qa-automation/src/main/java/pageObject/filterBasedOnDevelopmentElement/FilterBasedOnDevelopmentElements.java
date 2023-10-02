package pageObject.filterBasedOnDevelopmentElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FilterBasedOnDevelopmentElements {
    WebDriver driver;
    By developmentFilterXpath= By.xpath("//span[text()=\"Development\"]");
    public FilterBasedOnDevelopmentElements(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void clickOnDevelopment() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(developmentFilterXpath).click();
        Thread.sleep(3000);
        driver.findElement(developmentFilterXpath).click();
    }

}
