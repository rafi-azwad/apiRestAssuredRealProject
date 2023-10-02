package stepDefinition.webStepDefinition.clearASortingOption;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.clearSortingOptionElement.ClearSortingOptionElements;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class ClearSortingOptionStepdefs {
    ClearSortingOptionElements elements;
    @Given("User in collection list page")
    public void userInCollectionListPage() {
        System.out.println("User in collection list page");

    }

    @When("User click on sorting filter and select last modified")
    public void userClickOnSortingFilterAndSelectLastModified() throws InterruptedException {
        elements=new ClearSortingOptionElements(driver);
        elements.filterAndSelectLastModified();

    }

    @And("User click on the cross icon of the Chip")
    public void userClickOnTheCrossIconOfTheChip() throws InterruptedException {
        elements.clickOnCrossIcon();

    }

    @Then("Sorting will be cleared and it will apply the default sorting option")
    public void sortingWillBeClearedAndItWillApplyTheDefaultSortingOption() {
        System.out.println("Sorting will be cleared and it will apply the default sorting option");
    }
}
