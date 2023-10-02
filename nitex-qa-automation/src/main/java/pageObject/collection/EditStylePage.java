package pageObject.collection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class EditStylePage {
    WebDriver driver;
    Actions actions;

    //By studioMenu = By.xpath("//a[contains(text(),'Nitex studio')]");
    By studioMenu = By.xpath("//a[text()=\"Nitex studio\"]");
    By editIcon = By.xpath("(//div[@class=\"card-top\"])[1]/descendant::span[@title=\"Edit\"]");
    By firstProduct= By.xpath("(//div[@class=\"card-top\"])[1]");
    //By drawIcon= By.xpath("(//div[@class=\"toolbar\"]/child::button)[2]");
//  By drawIcon= By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Logout'])[1]/following::*[name()='svg'][3]");
    By drawIcon= By.cssSelector(".toolbar > button:nth-child(3)");
    By canvas= By.xpath("//div[@id='parent_canvasId1']/div/canvas[2]");
    By toolBar= By.xpath("//div[@id=\"nitex__app\"]/child::div[@class=\"toolbar\"]");







    public  EditStylePage(WebDriver driver){
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actions = new Actions(driver);

    }

    public void clickNitexStudioMenu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(studioMenu).click();
    }
    public void hoverProduct(){
        actions.moveToElement(driver.findElement(firstProduct)).perform();
    }

    public void clickEditIcon(){
        driver.findElement(editIcon).click();

    }

    public void drawLine() throws InterruptedException {
        Thread.sleep(5000);
        actions.moveToElement(driver.findElement(drawIcon)).perform();

//      WebElement element = driver.findElement(By.xpath(String.valueOf(drawIcon)));
//
//    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//      element.click();

//        Thread.sleep(5000);
//        //actions.moveToElement(driver.findElement(toolBar)).perform();
        driver.findElement(drawIcon).click();
//        Thread.sleep(2000);
        actions.clickAndHold(driver.findElement(canvas)).build().perform();

        // Move the mouse to a specific offset (e.g., 100 pixels to the right and 50 pixels down)
        actions.moveByOffset(468,65).build().perform();


        // Release the left mouse button
        actions.release().build().perform();

        // Perform other actions (if needed)
    }


}
