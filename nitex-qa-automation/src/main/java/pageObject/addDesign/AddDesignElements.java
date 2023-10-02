package pageObject.addDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static core.Helper.FilePathHelper.*;

public class AddDesignElements {

    WebDriver driver;

    By clickMultiStyle= By.xpath("//span[text()=\"Multiple Style\"]");

    By clickUpload=By.xpath("//input[@id=\"drag-upload\"]");

    By clickSubmit=By.xpath("//button[text()=\"Submit\"]");




    public AddDesignElements(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void clickOnMultiStyle() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(clickMultiStyle).click();

    }
    public void uploadItems() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(clickUpload).sendKeys(imageUpload1);
        Thread.sleep(3000);
        driver.findElement(clickUpload).sendKeys(imageUpload2);
        Thread.sleep(3000);
        driver.findElement(clickUpload).sendKeys(imageUpload3);
    }
    public void clickOnSubmit() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(clickSubmit).click();
    }

}
