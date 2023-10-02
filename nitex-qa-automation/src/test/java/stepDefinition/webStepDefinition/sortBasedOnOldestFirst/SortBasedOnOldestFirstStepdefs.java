package stepDefinition.webStepDefinition.sortBasedOnOldestFirst;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.sortBasedOnOldestElement.SortBasedOnOldestElement;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class SortBasedOnOldestFirstStepdefs {
    SortBasedOnOldestElement element;
    @Given("Authenticated User in Collection list page")
    public void authenticatedUserInCollectionListPage() {
        System.out.println("Authenticated User in Collection list page");

    }

    @When("User click on sorting filter and select Oldest first")
    public void userClickOnSortingFilterAndSelectOldestFirst() throws InterruptedException {
        element=new SortBasedOnOldestElement(driver);
        element.filterAndSelectOldestFirst();
    }

    @Then("Collection will be sorted in the list page as Oldest first")
    public void collectionWillBeSortedInTheListPageAsOldestFirst() {
        System.out.println("Collection will be sorted in the list page as Oldest first");
    }
}
