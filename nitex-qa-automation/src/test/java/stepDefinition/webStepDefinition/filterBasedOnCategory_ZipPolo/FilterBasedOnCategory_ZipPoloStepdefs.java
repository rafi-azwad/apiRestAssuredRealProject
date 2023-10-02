package stepDefinition.webStepDefinition.filterBasedOnCategory_ZipPolo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.filterBasedOnCategory_ZipPoloElement.FilterBasedOnCategory_ZipPoloElements;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class FilterBasedOnCategory_ZipPoloStepdefs {
    FilterBasedOnCategory_ZipPoloElements elements;
    @Given("user in collection list page")
    public void userInCollectionListPage() {
        System.out.println("user in collection list page");
    }

    @When("User Click on status dropdown and search and select {string}")
    public void userClickOnStatusDropdownAndSearchAndSelectCategory(String category) throws InterruptedException {
        elements=new FilterBasedOnCategory_ZipPoloElements(driver);
        elements.clickCategorySearchAndSelect(category);

    }

    @Then("selected category will be displayed in the list, if not matched then an empty Page with a message will be displayed")
    public void selectedCategoryWillBeDisplayedInTheListIfNotMatchedThenAnEmptyPageWithAMessageWillBeDisplayed() {
        System.out.println("Collection containing style with the selected category will be displayed in the list, if not matched then an empty page with a message will be displayed");
    }
}
