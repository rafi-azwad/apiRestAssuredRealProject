package stepDefinition.webStepDefinition.filterBasedOnStatus_Presentation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.filterBasedOnStatus_presentationElement.FilterBasedOnStatus_presentationElements;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class FilterBasedOnStatus_PresentationStepdefs {
    FilterBasedOnStatus_presentationElements elements;
    @Given("Authenticated user collection list page")
    public void authenticatedUserCollectionListPage() {
        System.out.println("Authenticated user collection list page");
    }

    @When("User click on status and click on search field")
    public void userClickOnStatusAndClickOnSearchField() throws InterruptedException {
        elements=new FilterBasedOnStatus_presentationElements(driver);
        elements.clickStatusAndSearch();

    }

    @And("User insert {string} and click on select box")
    public void userInsertStatusAndClickOnSelectBox(String status) throws InterruptedException {
        elements.insertAndSelectCheckBox(status);

    }

    @Then("Collection with the selected status will be displayed in the list")
    public void collectionWithTheSelectedStatusWillBeDisplayedInTheList() {
        System.out.println("Collection with the selected status will be displayed in the list");
    }
}
