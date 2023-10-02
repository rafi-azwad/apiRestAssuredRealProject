package stepDefinition.webStepDefinition.createOrder;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.createOrder.CreateOrderElements;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class CreateOrderStepdefs {
    CreateOrderElements element;
    @Given("Authenticated User in the collection view page")
    public void authenticatedUserInTheCollectionViewPage() {
        WebDriver driver;
    }

    @When("User hover mouse and select design and click on place order button")
    public void userHoverMouseAndSelectDesignAndClickOnPlaceOrderButton() throws InterruptedException {
      element=new CreateOrderElements(driver);
        String category="Sweatshirt";
        String style_ref="SW-M-2023";
        String style_name="Half-shirt";
        String bodyFabric="viscose";
        String fabric="polyester";
        String trims="button";
        String print1="Natural";
        String supplier="kac";
        String color="red";
        String fittingType="boxy";
        String sizeStandard="EU";
        String length="Corp";
        String rise="High rise";
        String brandInspiration="Charli";
      element.updateDesign(category,style_ref,style_name,bodyFabric,fabric,trims,print1,supplier,color,fittingType,sizeStandard,length,rise,brandInspiration);
    element.mouseHoverAndSelectDesign();
    }

    @And("User insert {string} and search and select {string} and insert {string} and select PO receive date and select ETD and upload PO")
    public void userInsertOrderTitleAndSearchAndSelectBuyerAndInsertPoNumberAndSelectPOReceiveDateAndSelectETDAndUploadPO(String orderTitle,String buyer,String poNumber) throws InterruptedException {
        element.selectBuyerAndPhnNumberAndPoReceive(orderTitle,buyer,poNumber);
    }

    @And("User click on add size button and select sizes and click on update button")
    public void userClickOnAddSizeButtonAndSelectSizesAndClickOnUpdateButton() throws InterruptedException {
        element.addSizeAndUpdate();

    }

    @And("User click on the add color button and click on Solid and search and select {string} and click on submit")
    public void userClickOnTheAddColorButtonAndClickOnSolidAndSearchAndSelectColorAndClickOnSubmit(String color) throws InterruptedException {
        element.searchAndSelectColor(color);
    }

    @And("User click on the add color and click on MULTI and search and select {string} add click on submit button")
    public void userClickOnTheAddColorAndClickOnMULTIAndSearchAndSelectColourAddClickOnSubmitButton(String colour) throws InterruptedException {
        element.searchAndSelectMultiColor(colour);
    }

    @And("User click on the qty cell and insert {string} against the color and size and user insert {string}")
    public void userClickOnTheQtyCellAndInsertQtyAgainstTheColorAndSizeAndUserInsertUnitPrice(String qty,String unitPrice) throws InterruptedException {
        element.insertInputQtyAndUnitPriceCell(qty,unitPrice);
    }

    @And("User click on the submit button and Click on place order")
    public void userClickOnTheSubmitButtonAndClickOnPlaceOrder() throws InterruptedException {
        element.clickOnSubmitAndPlaceOrder();
    }

    @Then("Order will be placed successfully")
    public void orderWillBePlacedSuccessfully() {
        System.out.println("Order will be placed successfully");
    }
}
