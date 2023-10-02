package pageObject.filterBasedOnCategory_JacketElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FilterBasedOnCategory_JacketElement {
    WebDriver driver;
     By categoryButtonXpath= By.xpath("//button[text()=\"Category\"]");

     By searchButtonXpath=By.xpath("(//input[@placeholder=\"Search\"])[2]");

     By jacketXpath=By.xpath("//span[text()=\"Jacket\"]");
    public FilterBasedOnCategory_JacketElement(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void clickOnCategorySearchAndSelect(String Jacket) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(categoryButtonXpath).click();
        Thread.sleep(2000);
        driver.findElement(searchButtonXpath).sendKeys(Jacket);
        Thread.sleep(2000);
        driver.findElement(jacketXpath).click();

    }

}
