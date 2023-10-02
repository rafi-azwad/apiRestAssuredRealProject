package pageObject.createCollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CreateCollectionElements {
    WebDriver driver;
    By clickCollection=By.xpath("//a[text()=\"Collections\"]");

    By addCollection=By.xpath("//span[text()=\"Collection\"]");

    By collectionNameXpath= By.xpath("//input[@id=\"collectionName\"]");

   By  clickBrand=By.xpath("//div[@class=\"click-box click mb-1\"]");

   By searchBrand=By.xpath("(//input[@placeholder=\"Search\"])[8]");

   By selectItem=By.xpath("//span[text()=\"HERMES PARIS\"]");

   By selectSeason=By.xpath("//select[@id=\"season\"]");


   By clickSubmit=By.xpath("//button[text()=\"Submit\"]");





    public CreateCollectionElements(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

   public void clickOnCollection() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(clickCollection).click();
       Thread.sleep(7000);
        driver.findElement(addCollection).click();
   }
   public  void insertCollectionNameSearch(String collectionName,String search) throws InterruptedException {
       Thread.sleep(2000);
        driver.findElement(collectionNameXpath).sendKeys(collectionName);
        driver.findElement(clickBrand).click();
        driver.findElement(searchBrand).sendKeys(search);
       List<WebElement> liElements = driver.findElements(By.tagName("li"));

       WebElement liElement = driver.findElement(selectItem); // Locate the <li> element
       Actions actions = new Actions(driver);
       actions.moveToElement(liElement).click().perform();

       WebElement dropdown = driver.findElement(selectSeason);
       Select selectDropdown = new Select(dropdown);
       selectDropdown.selectByValue("SPRING_20");
       driver.findElement(clickSubmit).click();
    }
}
