package stepDefinition.webStepDefinition.filterBasedOnMine;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.filterBasedOnmineElement.FilterBasedOnMineElements;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class FilterBasedOnMineStepdefs {
    FilterBasedOnMineElements elements;
    @Given("Authenticated User in collection list page")
    public void authenticatedUserInCollectionListPage() {
        System.out.println("Authenticated User in collection list page");

    }

    @When("User click on Mine filter")
    public void userClickOnMineFilter() throws InterruptedException {
        elements=new FilterBasedOnMineElements(driver);
        elements.clickMineFilter();
    }

    @Then("Only those collection will be displayed which has been created by the logged in user")
    public void onlyThoseCollectionWillBeDisplayedWhichHasBeenCreatedByTheLoggedInUser() {
        System.out.println("Only those collection will be displayed which has been created by the logged in user");
    }
}
