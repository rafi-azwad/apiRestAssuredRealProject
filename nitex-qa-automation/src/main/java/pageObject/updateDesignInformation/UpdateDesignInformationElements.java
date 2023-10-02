package pageObject.updateDesignInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class UpdateDesignInformationElements {
    WebDriver driver;
   By clickUpdate= By.xpath("(//span[@class=\"update-basic-info-btn\"])[1]");

    By clickMarket=By.xpath("//select[@id=\"productGroupId\"]");

   By clickCategory=By.xpath("//p[text()=\"Category\"]");

  By categorySearch=By.xpath("//input[@placeholder=\"Search\"]");

  By singleCategoryXpath=By.xpath("//span[text()=\"POLO SWEATSHIRT\"]");

  By Style_ref=By.xpath("//input[@placeholder=\"Style ref\"]");

  By StyleName=By.xpath("//input[@placeholder=\"Style name\"]");

   By selectBodyFabric=By.xpath("(//p[text()=\"Select fabric\"])[1]");

   By searchBodyFabric=By.xpath("//input[@placeholder=\"Example: Knit-Fleece, 80% cotton 20% polyester, 250 GSM\"]");

 // By singleBodyFabric=By.xpath("//span[text()=\"Sweater, 65% Viscose 35% Nylon, 200.0 Gauge\"]") ;
   By singleBodyFabric=By.xpath("(//span[@class=\"single-item-focus\"])[1]");
   By selectFabric=By.xpath("//p[text()=\"Select fabric\"]");

   By searchFabric=By.xpath("//input[@placeholder=\"Example: Knit-Fleece, 80% cotton 20% polyester, 250 GSM\"]");

  By singleFabric=By.xpath("//li[@class=\"single-color-item single-item d-flex \"]");

    By selectTrims=By.xpath("//p[text()=\"Select trims\"]");

    By searchTrims=By.xpath("//input[@placeholder=\"Example: Button, 2 cm square sewing buttons\"]") ;

    By singleTrims=By.xpath("//li[@class=\"single-color-item single-item d-flex \"]");

    By clickEmbellishment=By.xpath("//td[@colspan=\"2\"]");

    By print_1Description=By.xpath("(//input[@id=\"description\"])[1]");

    By clickSupplier=By.xpath("(//div[@class=\"click-box click mb-1\"])[8]");

    By searchSupplier=By.xpath("//input[@placeholder=\"Search\"]");

    By selectSupplier=By.xpath("//span[@class=\"single-item-focus\"]");

    By nonWash=By.xpath("(//div[@class=\"form-group  mb-0\"])[1]");

    By nonEmbroidery=By.xpath("(//div[@class=\"form-group  mb-0\"])[2]");

    By addColor=By.xpath("(//button[@type=\"button\"])[9]");

    By clickSolid=By.xpath("(//li[@class=\"multi-color-box\"])[1]");

    By searchColor=By.xpath("//input[@placeholder=\"Search\"]");

    By selectColor=By.xpath("(//div[@class=\"single-color-item d-flex multi-color-box\"])[1]");

    By clickSubmit=By.xpath("//span[text()=\"SUBMIT\"]");

    By addSizeAndFittingTypeXpath=By.xpath("(//td[@class=\"size-cell\"])[3]");

    By selectSize=By.xpath("//td[text()=\"XL\"]");

    By fittingTypeXpath=By.xpath("//p[text()=\"Fitting type\"]");

   // By clickAddSizeAndFittingType=By.xpath("(//td[@class=\"size-cell\"])[3]");

    By searchFittingType=By.xpath("//input[@placeholder=\"Search\"]");

    By selectFittingType=By.xpath("//li[@class=\"single-color-item single-item d-flex \"]");

    By sizeStandardXpath=By.xpath("(//div[@class=\"click-box click mb-1\"])[10]");

    By searchSizeStandard=By.xpath("//input[@placeholder=\"Search\"]");

    By clickSizeStandard=By.xpath("//li[@class=\"single-color-item single-item d-flex \"]");

    By clickLength=By.xpath("//p[text()=\"Length\"]");

    By searchLength=By.xpath("//input[@placeholder=\"Search\"]");

    By selectLength=By.xpath("//li[@class=\"single-color-item single-item d-flex \"]");

    By clickRise=By.xpath("//p[text()=\"Rise\"]");

    By searchRise=By.xpath("//input[@placeholder=\"Search\"]");

    By selectRise=By.xpath("//li[@class=\"single-color-item single-item d-flex \"]");

    By clickBrandInspiration=By.xpath("//p[text()=\"Brand inspiration\"]");

    By searchBrandInspiration=By.xpath("//input[@placeholder=\"Search\"]");

    By selectBrandInspiration=By.xpath("(//li[@class=\"single-color-item single-item d-flex \"])[1]");

    By clickOnUpdate=By.xpath("//button[text()=\"Update\"]");

    By clickCross=By.cssSelector(".close > svg");



    public UpdateDesignInformationElements(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void clickOnUpdate() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(clickUpdate).click();
    }
    public void searchAndSelectCategoryStyle_refStyle_name(String category,String style_ref,String style_name) throws InterruptedException {   // value="Girls"
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(clickMarket));
        Thread.sleep(3000);
        select.selectByVisibleText("Girls");
        Thread.sleep(3000);
        driver.findElement(clickCategory).click();
        driver.findElement(categorySearch).sendKeys(category);
        driver.findElement(singleCategoryXpath).click();
        driver.findElement(Style_ref).sendKeys(style_ref);
        driver.findElement(StyleName).sendKeys(style_name);

    }
    public void searchAndSelectBodyFabricFabricTrims(String bodyFabric,String fabric,String trims) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(selectBodyFabric).click();
        driver.findElement(searchBodyFabric).sendKeys(bodyFabric);
        Thread.sleep(3000);
        driver.findElement(singleBodyFabric).click();
        Thread.sleep(3000);
        driver.findElement(selectFabric).click();
        driver.findElement(searchFabric).sendKeys(fabric);
        Thread.sleep(3000);
        driver.findElement(singleFabric).click();
        Thread.sleep(2000);
        driver.findElement(selectTrims).click();
        driver.findElement(searchTrims).sendKeys(trims);
        Thread.sleep(2000);
        driver.findElement(singleTrims).click();

    }
    public void insertPrint1SelectSupplierAndNonWashAndNonEmbroidery(String print1,String supplier) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(clickEmbellishment).click();
        Thread.sleep(2000);
        driver.findElement(print_1Description).sendKeys(print1);
        driver.findElement(clickSupplier).click();
        driver.findElement(searchSupplier).sendKeys(supplier);
        Thread.sleep(2000);
        driver.findElement(selectSupplier).click();
        Thread.sleep(2000);
        driver.findElement(nonWash).click();
        driver.findElement(nonEmbroidery).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//html")).click();

    }
    public void searchAndSelectColor(String color) throws InterruptedException {
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.xpath("(//div[@class=\"d-flex align-items-center\"])[1]"));
       Actions action = new Actions(driver);
        Thread.sleep(3000);


        action.moveToElement(element).perform();
        WebElement element1 = driver.findElement(By.xpath("(//button[@class=\"btn btn-default dropdown-toggle pr-1 pl-0\"])[1]"));
        element1.click();
        //driver.findElement(addColor).click();
        Thread.sleep(3000);
        driver.findElement(clickSolid).click();
        driver.findElement(searchColor).sendKeys(color);
        Thread.sleep(3000);
        driver.findElement(selectColor).click();
        Thread.sleep(2000);
        driver.findElement(clickSubmit).click();
    }
    public void addSizeAndFitting() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(addSizeAndFittingTypeXpath).click();
    }
    public void searchAndSelectFittingTypeAndSizeStandardAndLengthAndRiseAndBrandInspiration(String fittingType,String sizeStandard,String length,String rise,String brandInspiration) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(selectSize).click();
        Thread.sleep(5000);
        driver.findElement(fittingTypeXpath).click();
        driver.findElement(searchFittingType).sendKeys(fittingType);
        driver.findElement(selectFittingType).click();
        Thread.sleep(2000);
        driver.findElement(sizeStandardXpath).click();
        driver.findElement(searchSizeStandard).sendKeys(sizeStandard);
        Thread.sleep(2000);
        driver.findElement(clickSizeStandard).click();
        Thread.sleep(2000);
        driver.findElement(clickLength).click();
        driver.findElement(searchLength).sendKeys(length);
        Thread.sleep(2000);
        driver.findElement(selectLength).click();
        Thread.sleep(2000);
        driver.findElement(clickRise).click();
        driver.findElement(searchRise).sendKeys(rise);
        Thread.sleep(2000);
        driver.findElement(selectRise).click();
        Thread.sleep(2000);
        driver.findElement(clickBrandInspiration).click();
        driver.findElement(searchBrandInspiration).sendKeys(brandInspiration);
        Thread.sleep(2000);
        driver.findElement(selectBrandInspiration).click();
        Thread.sleep(5000);
        WebElement modalElement = driver.findElement(By.xpath("/html/body/div[4]"));

        // Perform an "Escape" key press action to close the modal
        Actions actions = new Actions(driver);
        actions.sendKeys(modalElement, Keys.ESCAPE).perform();
        Thread.sleep(4000);
        driver.findElement(clickOnUpdate).click();
        Thread.sleep(2000);
        driver.findElement(clickCross).click();
    }
}
