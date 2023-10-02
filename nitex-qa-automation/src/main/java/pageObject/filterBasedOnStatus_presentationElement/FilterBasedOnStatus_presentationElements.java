package pageObject.filterBasedOnStatus_presentationElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FilterBasedOnStatus_presentationElements {
    WebDriver driver;
    By statusButtonXpath= By.xpath("//button[text()=\"Status\"]");
    By searchXpath=By.xpath("(//input[@placeholder=\"Search\"])[1]");
     By presentationXpath=By.xpath("//label[text()=\"Presentation\"]");
     By clickExternal=By.xpath("(//a[text()=\"Dashboard\"])[1]");
    By clickCollection=By.xpath("//a[text()=\"Collections\"]");
    public FilterBasedOnStatus_presentationElements(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void clickStatusAndSearch() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(clickExternal).click();
        Thread.sleep(2000);
        driver.findElement(clickCollection).click();
        Thread.sleep(3000);
        driver.findElement(statusButtonXpath).click();

    }
    public void insertAndSelectCheckBox(String status) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(searchXpath).sendKeys(status);
        Thread.sleep(3000);
        driver.findElement(presentationXpath).click();
    }

}
