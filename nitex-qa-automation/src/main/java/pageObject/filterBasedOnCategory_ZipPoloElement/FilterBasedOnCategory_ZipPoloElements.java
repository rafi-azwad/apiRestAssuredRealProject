package pageObject.filterBasedOnCategory_ZipPoloElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FilterBasedOnCategory_ZipPoloElements {
    WebDriver driver;

    By categoryButtonXpath= By.xpath("//button[text()=\"Category\"]");

    By searchButtonXpath=By.xpath("(//input[@placeholder=\"Search\"])[2]");

    By zipPoloXpath=By.xpath("//span[text()=\"Zip polo \"]");
    public FilterBasedOnCategory_ZipPoloElements(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void clickCategorySearchAndSelect(String category) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(categoryButtonXpath).click();
        Thread.sleep(2000);
        driver.findElement(categoryButtonXpath).click();
        Thread.sleep(2000);
        driver.findElement(searchButtonXpath).clear();
        Thread.sleep(2000);
        driver.findElement(searchButtonXpath).sendKeys(category);
        Thread.sleep(2000);
        driver.findElement(zipPoloXpath).click();
    }
}
