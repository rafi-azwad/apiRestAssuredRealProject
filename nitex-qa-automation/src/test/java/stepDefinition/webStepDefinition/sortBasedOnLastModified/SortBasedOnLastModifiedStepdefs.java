package stepDefinition.webStepDefinition.sortBasedOnLastModified;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.sortBasedOnLastModifiedElement.SortLastModified;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class SortBasedOnLastModifiedStepdefs {
    SortLastModified elements;
    @Given("Authenticated user in collection List Page")
    public void authenticatedUserInCollectionListPage() {
        System.out.println("Authenticated user in collection List Page");
    }

    @When("User click on sorting filter and select Last modified")
    public void userClickOnSortingFilterAndSelectLastModified() throws InterruptedException {
       elements=new SortLastModified(driver);
       elements.clickFilterAndSelectLastModified();

    }

    @Then("Collection will be sorted in the list page as Last modified")
    public void collectionWillBeSortedInTheListPageAsLastModified() {
        System.out.println("Collection will be sorted in the list page as Last modified");
    }
}
