package stepDefinition.webStepDefinition.updateDesignInformation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.updateDesignInformation.UpdateDesignInformationElements;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class UpdateDesignInformationStepdefs {

    UpdateDesignInformationElements elements;
    @Given("Authenticated user in the collection view Page")
    public void authenticatedUserInTheCollectionViewPage() {
        WebDriver driver;
    }

    @When("User click on the update button")
    public void userClickOnTheUpdateButton() throws InterruptedException {
         elements=new UpdateDesignInformationElements(driver);
         elements.clickOnUpdate();
    }

    @And("User select Market and search and select {string} and insert {string} and {string}")
    public void userSelectMarketAndSearchAndSelectCategoryAndInsertStyle_refAndStyle_name(String category,String style_ref,String style_name) throws InterruptedException {
       elements.searchAndSelectCategoryStyle_refStyle_name(category,style_ref,style_name);
    }

    @And("User search and select {string} and {string} and {string}")
    public void userSearchAndSelectBodyFabricAndFabricAndTrims(String bodyFabric,String fabric,String trims) throws InterruptedException {
       elements.searchAndSelectBodyFabricFabricTrims(bodyFabric,fabric,trims);
    }

    @And("User click on the embellishment and insert {string} and search and select {string} and select Non-wash and Non-Embroidery and click outside")
    public void userClickOnTheEmbellishmentAndInsertPrintAndSearchAndSelectSupplierAndSelectNonWashAndNonEmbroideryAndClickOutside(String print1,String supplier) throws InterruptedException {
        elements.insertPrint1SelectSupplierAndNonWashAndNonEmbroidery(print1,supplier);
    }

    @And("User click on the add color and click on solid and search and select {string} add click on submit button")
    public void userClickOnTheAddColorAndClickOnSolidAndSearchAndSelectColorAddClickOnSubmitButton(String color) throws InterruptedException {
        elements.searchAndSelectColor(color);
    }

    @And("User click on the add size and fitting type cell")
    public void userClickOnTheAddSizeAndFittingTypeCell() throws InterruptedException {

       elements.addSizeAndFitting();
    }

    @And("User select sizes and search and select {string} and {string} and {string} and {string} and {string} and click on outside and Update button")
    public void userSelectSizesAndSearchAndSelectFittingTypeAndSizeStandardAndLengthAndRiseAndBrandInspirationAndClickOnOutsideAndUpdateButton(String fittingType,String sizeStandard,String length,String rise,String brandInspiration) throws InterruptedException {
        elements.searchAndSelectFittingTypeAndSizeStandardAndLengthAndRiseAndBrandInspiration(fittingType,sizeStandard,length,rise,brandInspiration);
    }

    @Then("Information will be updated for the design")
    public void informationWillBeUpdatedForTheDesign() {
        System.out.println("Information will be updated for the design");
    }
}
