package stepDefinition.webStepDefinition.clearSerachValue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.clearSearchValueElement.ClearSearchValueElement;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class ClearSearchValueStepdefs {
    ClearSearchValueElement elements;
    @Given("User in Collection list page")
    public void userInCollectionListPage() {
        System.out.println("User in Collection list page");
    }

    @When("User click on search option and click on search field and insert {string}")
    public void userClickOnSearchOptionAndClickOnSearchFieldAndInsertCollectionName(String collectionName) throws InterruptedException {
        elements=new ClearSearchValueElement(driver);
        elements.clickSearchAndInsertValue(collectionName);

    }

    @And("User Click on the cross icon of the Chip")
    public void userClickOnTheCrossIconOfTheChip() throws InterruptedException {
        elements.clickCrossIcon();


    }

    @Then("Search will be cleared and all the collection will be displayed in the list")
    public void searchWillBeClearedAndAllTheCollectionWillBeDisplayedInTheList() {
        System.out.println("Search will be cleared and all the collection will be displayed in the list");
    }
}
