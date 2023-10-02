package stepDefinition.webStepDefinition.filterBasedOnStatus_buyerRequest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.filterBasdOnStatus_BuyerRequestElement.FilterBasedOnStatus_BuyerRequestElements;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class FilterBasdOnStatus_BuyerRequestStepdefs {
   FilterBasedOnStatus_BuyerRequestElements elements;
    @Given("Authenticated user Collection list page")
    public void authenticatedUserCollectionListPage() {
        System.out.println("Authenticated user Collection list page");
    }

    @When("User click on status and click on Search field")
    public void userClickOnStatusAndClickOnSearchField() throws InterruptedException {
         elements=new FilterBasedOnStatus_BuyerRequestElements(driver);
         elements.clickStatusAndSearch();
    }

    @And("User insert {string} and click on Select box")
    public void userInsertStatusAndClickOnSelectBox(String status) throws InterruptedException {
          elements.insertValueSelectBox(status);
    }

    @Then("Collection with the selected Status will be displayed in the list")
    public void collectionWithTheSelectedStatusWillBeDisplayedInTheList() {
        System.out.println("Collection with the selected Status will be displayed in the list");
    }
}
