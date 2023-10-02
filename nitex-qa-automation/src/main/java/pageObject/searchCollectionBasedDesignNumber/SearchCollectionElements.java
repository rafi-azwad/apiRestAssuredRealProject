package pageObject.searchCollectionBasedDesignNumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SearchCollectionElements {
    WebDriver driver;
    //By searchFieldXpath=By.xpath("//input[@name='name']");
    By searchFieldXpath=By.xpath("//input[@placeholder=\"Design number\"]");
    By clickDesign=By.xpath("//li[text()=\"MT23-A0289\"]");

    //By removeDesignNumber=By.cssSelector(".chip-close path"); //span[@class="chip-close cursor-pointer"]
    By removeDesignNumber=By.xpath("//span[@class=\"chip-close cursor-pointer\"]");
    public SearchCollectionElements(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void insertValueOnSearchField(String designNo) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(searchFieldXpath).clear();
        Thread.sleep(2000);
        driver.findElement(searchFieldXpath).sendKeys(designNo);
        Thread.sleep(2000);
        driver.findElement(clickDesign).click();
        Thread.sleep(5000);
        driver.findElement(removeDesignNumber).click();
    }
}
