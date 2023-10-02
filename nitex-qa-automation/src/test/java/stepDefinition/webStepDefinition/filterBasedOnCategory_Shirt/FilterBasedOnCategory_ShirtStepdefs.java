package stepDefinition.webStepDefinition.filterBasedOnCategory_Shirt;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.filterBasedOnCategory_ShirtElement.FilterBasedOnCategory_ShirtElements;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class FilterBasedOnCategory_ShirtStepdefs {
    FilterBasedOnCategory_ShirtElements elements;
    @Given("user in Collection list page")
    public void userInCollectionListPage() {
        System.out.println("user in Collection list page");

    }

    @When("User click on status dropdown and search and Select {string}")
    public void userClickOnStatusDropdownAndSearchAndSelectCategory(String category) throws InterruptedException {
        elements=new FilterBasedOnCategory_ShirtElements(driver);
        elements.clickCategoryAndSearchAndSelect(category);

    }

    @Then("selected category will be displayed in the list, if not matched then an empty page with a message will be displayed")
    public void selectedCategoryWillBeDisplayedInTheListIfNotMatchedThenAnEmptyPageWithAMessageWillBeDisplayed() {
        System.out.println("selected category will be displayed in the list, if not matched then an empty page with a message will be displayed");
    }
}
