package stepDefinition.webStepDefinition.searchCollectionBasedDesignNumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.searchCollectionBasedDesignNumber.SearchCollectionElements;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class SearchByDesignNumberStepdefs {
    SearchCollectionElements elements;
    @Given("Authenticated user in collection list page")
    public void authenticatedUserInCollectionListPage() {
        WebDriver driver;
    }

    @When("User insert {string} on search field")
    public void userInsertDesignNoOnSearchField(String designNo) throws InterruptedException {
        elements=new SearchCollectionElements(driver);
        elements.insertValueOnSearchField(designNo);
    }

    @Then("The number will be added as chip and search collection will be displayed if not found then it is show an empty page with a message")
    public void theNumberWillBeAddedAsChipAndSearchCollectionWillBeDisplayedIfNotFoundThenItIsShowAnEmptyPageWithAMessage() {
        System.out.println("The number will be added as chip and search collection will be displayed if not found then it is show an empty page with a message");
    }
}
