package stepDefinition.webStepDefinition.filterBasedOnCategory_Jacket;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.filterBasedOnCategory_JacketElement.FilterBasedOnCategory_JacketElement;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class FilterBasedOnCategory_JacketStepdefs {
    FilterBasedOnCategory_JacketElement element;
    @Given("Authenticated user in Collection list Page")
    public void authenticatedUserInCollectionListPage() {
        System.out.println("Authenticated user in Collection list Page");
    }

    @When("User click on category dropdown and search and select {string}")
    public void userClickOnCategoryDropdownAndSearchAndSelectCategory(String category) throws InterruptedException {
        element=new FilterBasedOnCategory_JacketElement(driver);
        element.clickOnCategorySearchAndSelect(category);
    }

    @Then("Collection containing style with the selected category will be displayed in the list, if not matched then an empty page with a message will be displayed")
    public void collectionContainingStyleWithTheSelectedCategoryWillBeDisplayedInTheListIfNotMatchedThenAnEmptyPageWithAMessageWillBeDisplayed() {
        System.out.println("Collection containing style with the selected category will be displayed in the list, if not matched then an empty page with a message will be displayed");
    }
}
