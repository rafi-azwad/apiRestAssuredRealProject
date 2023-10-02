package pageObject.deleteUpdateDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DeleteUpdateDesignElements {
    WebDriver driver;

    By hoverDesign= By.xpath("(//div[@class=\"single-design-card with-editable shadow-1dp \"])[1]");

    By clickOnCheckboxIcon=By.cssSelector(".col-md-3:nth-child(1) .add-to-favorite");

    By favoriteIconXpath=By.cssSelector(".col-md-3:nth-child(1) .add-to-favorite");

    By clickMoreIcon=By.cssSelector(".close > svg");

    By deleteXpath=By.xpath("//span[text()=\"Delete\"]");

    public DeleteUpdateDesignElements(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void hoverMouseAndClickMoreIcon() throws InterruptedException {
        Thread.sleep(4000);

        WebElement element = driver.findElement(hoverDesign);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
       // actions.click(element).perform();
        Thread.sleep(4000);
        WebElement element2 = driver.findElement(By.xpath("//button[@id=\"menu1\"]"));
        element2.click();
    }
    public void clickDeleteIcon() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(deleteXpath).click();

    }
}
