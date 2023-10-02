package pageObject.filterBasedOnSharedElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FilterBasedOnSharedElements {
    WebDriver driver;
    By shareFilterXpath= By.xpath("//span[text()=\"Shared\"]");
    public FilterBasedOnSharedElements(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    }
   public void clickOnSharedFilter() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(shareFilterXpath).click();
   }

}
