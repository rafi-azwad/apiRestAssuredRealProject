package stepDefinition.webStepDefinition.searchCollection;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.searchCollection.SearchCollectionElement;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class SearchCollectionStepdefs {
    SearchCollectionElement element;
    @Given("Authenticated user in home page")
    public void authenticatedUserInHomePage() {
        WebDriver driver;

    }

    @When("User click on Collection")
    public void userClickOnCollection() throws InterruptedException {
        element=new SearchCollectionElement(driver);
        element.clickCollection();
    }

    @And("User click on search icon and User insert {string} in search field")
    public void userClickOnSearchIconAndUserInsertCollectionNameInSearchField(String collectionName) throws InterruptedException {
        element.clickSearchAndInsertValue(collectionName);
    }

    @Then("The name will be added as chip and search collection will be displayed if not found then it is show an empty page with a message")
    public void theNameWillBeAddedAsChipAndSearchCollectionWillBeDisplayedIfNotFoundThenItIsShowAnEmptyPageWithAMessage() {
        System.out.println("The name will be added as chip and search collection will be displayed if not found then it is show an empty page with a message");
    }
}
