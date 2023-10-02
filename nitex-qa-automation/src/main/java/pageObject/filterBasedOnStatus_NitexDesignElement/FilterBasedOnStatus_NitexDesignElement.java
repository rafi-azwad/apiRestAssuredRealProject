package pageObject.filterBasedOnStatus_NitexDesignElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FilterBasedOnStatus_NitexDesignElement {
    WebDriver driver;
    By statusButtonXpath= By.xpath("//button[text()=\"Status\"]");
    By searchXpath=By.xpath("(//input[@placeholder=\"Search\"])[1]");
    By nitexDesignXpath=By.xpath("//label[text()=\"Nitex design\"]");
    public FilterBasedOnStatus_NitexDesignElement(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void searchAndSelectStatus(String status) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(statusButtonXpath).click();
        Thread.sleep(3000);
        driver.findElement(searchXpath).sendKeys(status);
        Thread.sleep(3000);
        driver.findElement(nitexDesignXpath).click();

    }
}
