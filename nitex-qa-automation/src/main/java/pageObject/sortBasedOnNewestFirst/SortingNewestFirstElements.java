package pageObject.sortBasedOnNewestFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SortingNewestFirstElements {
    WebDriver driver;
    By sortingFilterXpath= By.xpath("//div[@class=\"sort-button\"]");
    By newestFirst=By.xpath("//option[text()=\"Newest first\"]");
    //By removeNewest=By.xpath("//span[@class=\"chip-close cursor-pointer\"]");//.chip-close path
    By removeNewest=By.cssSelector(".chip-close path");
    public SortingNewestFirstElements(WebDriver driver){
        this.driver=driver;
    }

    public void clickFilterAndSelect() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(sortingFilterXpath).click();
        Thread.sleep(2000);
        driver.findElement(newestFirst).click();
    }

}
