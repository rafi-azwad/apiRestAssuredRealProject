package stepDefinition.webStepDefinition.sortBasedOnNewestFirst;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.sortBasedOnNewestFirst.SortingNewestFirstElements;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class SortBasedOnNewestStepdefs {
    SortingNewestFirstElements elements;
    @Given("Authenticated user in collection list Page")
    public void authenticatedUserInCollectionListPage() {

        System.out.println("...............");
    }

    @When("User click on sorting filter and select Newest first")
    public void userClickOnSortingFilterAndSelectNewestFirst() throws InterruptedException {
        elements=new SortingNewestFirstElements(driver);
        elements.clickFilterAndSelect();
    }
    @And("User test sorting {string}")
    public void userTestSortingValue(String value) {
        System.out.println("test value");
    }
    @Then("Collection will be sorted in the list page as Newest first")
    public void collectionWillBeSortedInTheListPageAsNewestFirst() {
        System.out.println("Collection will be sorted in the list page as Newest first");
    }


}
