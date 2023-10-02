package stepDefinition.webStepDefinition.filterBasedOnStatus_NitexDesign;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.filterBasedOnStatus_NitexDesignElement.FilterBasedOnStatus_NitexDesignElement;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class FilterBasedOnStatus_NitexDesignStepdefs {
    FilterBasedOnStatus_NitexDesignElement element;
    @Given("Authenticated User in Collection List page")
    public void authenticatedUserInCollectionListPage() {
        System.out.println("Authenticated User in Collection List page");
    }

    @When("User click on status dropdown and search and select {string}")
    public void userClickOnStatusDropdownAndSearchAndSelectStatus(String status) throws InterruptedException {
        element=new FilterBasedOnStatus_NitexDesignElement(driver);
        element.searchAndSelectStatus(status);

    }

    @Then("Only the collection with Nitex design status will be displayed in the list")
    public void onlyTheCollectionWithNitexDesignStatusWillBeDisplayedInTheList() {
        System.out.println("Only the collection with Nitex design status will be displayed in the list");
    }
}
