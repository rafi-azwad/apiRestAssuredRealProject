package pageObject.filterBasedOnCategory_ShirtElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FilterBasedOnCategory_ShirtElements {
    WebDriver driver;
    By categoryButtonXpath= By.xpath("//button[text()=\"Category\"]");

    By searchButtonXpath=By.xpath("(//input[@placeholder=\"Search\"])[2]");

    By shirtXpath=By.xpath("//span[text()=\"Sweatshirt\"]");
    public FilterBasedOnCategory_ShirtElements(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void clickCategoryAndSearchAndSelect(String category) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(categoryButtonXpath).click();
        Thread.sleep(2000);
        driver.findElement(categoryButtonXpath).click();
        Thread.sleep(2000);
        driver.findElement(searchButtonXpath).clear();
        Thread.sleep(2000);
        driver.findElement(searchButtonXpath).sendKeys(category);
        Thread.sleep(2000);
        driver.findElement(shirtXpath).click();
    }
}
