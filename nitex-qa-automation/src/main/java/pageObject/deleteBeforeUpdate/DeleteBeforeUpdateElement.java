package pageObject.deleteBeforeUpdate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DeleteBeforeUpdateElement {

    WebDriver driver;

    By imageXpath=By.xpath("(//img[@alt=\"product-image\"])[2]");

  // By imageDelete=By.xpath("(//img[@src=\"/icons/delete24.svg\"])[2]");


    By imageDelete=By.cssSelector(".col-md-3:nth-child(2) .edit-items img");


    public DeleteBeforeUpdateElement(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void hoverAndDelete() throws InterruptedException {
        Thread.sleep(6000);
        WebElement elementToDelete = driver.findElement(imageXpath);
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToDelete).perform();
        Thread.sleep(4000);

        WebElement deleteButton = driver.findElement(imageDelete);
        deleteButton.click();


    }
}
