package pageObject.sortBasedOnOldestElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SortBasedOnOldestElement {
    WebDriver driver;
    //By filterButtonXpath= By.xpath("//div[@class=\"sort-button\"]");
    // -//select[@name="sort"]
    By filterButtonXpath= By.xpath("//select[@name=\"sort\"]");
    By oldestFirstXpath=By.xpath("//option[text()=\"Oldest first\"]");

    public SortBasedOnOldestElement(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void filterAndSelectOldestFirst() throws InterruptedException {
        Thread.sleep(3000);
      driver.findElement(filterButtonXpath).click();
      Thread.sleep(2000);
      driver.findElement(oldestFirstXpath).click();
    }
}
