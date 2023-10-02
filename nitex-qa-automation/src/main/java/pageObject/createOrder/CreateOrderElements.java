package pageObject.createOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageObject.updateDesignInformation.UpdateDesignInformationElements;

import java.util.concurrent.TimeUnit;

public class CreateOrderElements {
    WebDriver driver;
    UpdateDesignInformationElements elements;
    By hoverOnDesign= By.xpath("(//div[@class=\"single-design-card with-editable shadow-1dp \"])[1]");

    By clickCheckbox=By.cssSelector(".d-flex > label");

    By addFavoriteXpath=By.cssSelector(".add-to-favorite");

    By placeOrderXpath=By.xpath("//span[text()=\"Place order\"]");

    By orderTitleXpath=By.xpath("//input[@id=\"oder-title\"]");

    By buyerXpath=By.xpath("//input[@placeholder=\"Search with buyer E-mail\"]");

    By poNumberXpath=By.xpath("//input[@id=\"po-number\"]");

    By poReceiveDate=By.xpath("//input[@id=\"po-receive\"]");

    By estimatedTimeXpath=By.xpath("//input[@id=\"etd\"]");

    By addSizeXpath=By.xpath("//p[@class=\"semibold-14 col-heading cursor-pointer size-add custom-tooltip\"]");

    By selectSizeXpath=By.xpath("(//td[@class=\"size \"])[6]");

    By updateButtonXpath=By.xpath("//span[text()=\"UPDATE\"]");

    By addColorXpath=By.xpath("//button[@class=\"btn btn-default dropdown-toggle pr-1 pl-0\"]");

     By solidColorXpath=By.xpath("//span[text()=\"SOLID\"]");

     By searchColorXpath=By.xpath("//input[@placeholder=\"Search\"]");

     By selectGreenColor=By.xpath("(//div[@class=\"single-color-item d-flex multi-color-box\"])[1]");

     By submitXpath=By.xpath("//span[text()=\"SUBMIT\"]");

     By multiColorXpath=By.xpath("//span[text()=\"MULTI\"]");

     By searchMultiColor=By.xpath("//input[@placeholder=\"Search\"]");

     By selectMultiColor=By.xpath("(//div[@class=\"single-color-item d-flex multi-color-box\"])[1]");

     By colorTitleXpath=By.xpath("//input[@placeholder=\"Write color title\"]");

     By clickSubmitXpath=By.xpath("//span[text()=\"SUBMIT\"]");

     By qtySellXpath=By.xpath("(//input[@placeholder=\"00\"])[1]");

     By unitPriceXpath=By.xpath("//input[@placeholder=\"$00\"]");

     By clickOnFinalSubmit=By.xpath("//button[text()=\"Submit\"]");

     By selectBuyerXpath=By.xpath("//input[@placeholder=\"Search with buyer E-mail\"]");

     By buyerSuggestField=By.xpath("//div[@class=\"suggest-filed\"]");

     By placeOrderButton=By.xpath("//button[text()=\"Place order\"]");


    public CreateOrderElements(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void updateDesign(String category,String style_ref,String style_name,String bodyFabric,String fabric,String trims,String print1,String supplier,String color,String fittingType,String sizeStandard,String length,String rise,String brandInspiration) throws InterruptedException {
        elements=new UpdateDesignInformationElements(driver);
        Thread.sleep(5000);
        elements.clickOnUpdate();
        elements.searchAndSelectCategoryStyle_refStyle_name(category,style_ref,style_name);
        elements.searchAndSelectBodyFabricFabricTrims(bodyFabric,fabric,trims);
        elements.insertPrint1SelectSupplierAndNonWashAndNonEmbroidery(print1,supplier);
        elements.searchAndSelectColor(color);
        elements.addSizeAndFitting();
        elements.searchAndSelectFittingTypeAndSizeStandardAndLengthAndRiseAndBrandInspiration(fittingType,sizeStandard,length,rise,brandInspiration);

    }
    public void mouseHoverAndSelectDesign() throws InterruptedException {
        Thread.sleep(4000);
        WebElement element = driver.findElement(hoverOnDesign);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        Thread.sleep(2000);
        WebElement ele=driver.findElement(clickCheckbox);
        ele.click();
        driver.findElement(placeOrderXpath).click();

    }
    public void selectBuyerAndPhnNumberAndPoReceive(String orderTitle,String buyer,String poNumber) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(orderTitleXpath).click();
        driver.findElement(orderTitleXpath).sendKeys(orderTitle);
        driver.findElement(buyerXpath).click();
        driver.findElement(buyerXpath).sendKeys(buyer);
        driver.findElement(poNumberXpath).click();
        driver.findElement(poNumberXpath).sendKeys(poNumber);
        driver.findElement(poReceiveDate).sendKeys("2023-07-25");
        driver.findElement(estimatedTimeXpath).sendKeys("2023-08-10");

    }
    public void addSizeAndUpdate() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(addSizeXpath).click();
        driver.findElement(selectSizeXpath).click();
        Thread.sleep(2000);
        driver.findElement(updateButtonXpath).click();

    }

    public void searchAndSelectColor(String color) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(addColorXpath).click();
        driver.findElement(solidColorXpath).click();
        driver.findElement(searchColorXpath).sendKeys(color);
        Thread.sleep(3000);
        driver.findElement(selectGreenColor).click();
        Thread.sleep(2000);
        driver.findElement(submitXpath).click();
    }

    public void searchAndSelectMultiColor(String colour) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(addColorXpath).click();
        driver.findElement(multiColorXpath).click();
        Thread.sleep(2000);
        driver.findElement(searchMultiColor).sendKeys(colour);
        Thread.sleep(3000);
        driver.findElement(selectMultiColor).click();
        driver.findElement(colorTitleXpath).sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(clickSubmitXpath).click();
    }
    public void insertInputQtyAndUnitPriceCell(String qty,String unitPrice) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(qtySellXpath).sendKeys(qty);
        Thread.sleep(2000);
        driver.findElement(unitPriceXpath).sendKeys(unitPrice);
    }
    public void clickOnSubmitAndPlaceOrder() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(clickOnFinalSubmit).click();
        Thread.sleep(2000);

        driver.findElement(selectBuyerXpath).click();
        Thread.sleep(2000);
        driver.findElement(buyerSuggestField).click();
        Thread.sleep(2000);
        driver.findElement(clickOnFinalSubmit).click();
        Thread.sleep(4000);
        driver.findElement(placeOrderButton).click();

    }
}
