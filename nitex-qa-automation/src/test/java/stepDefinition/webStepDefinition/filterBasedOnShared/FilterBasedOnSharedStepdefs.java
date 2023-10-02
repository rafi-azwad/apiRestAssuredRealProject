package stepDefinition.webStepDefinition.filterBasedOnShared;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.filterBasedOnSharedElement.FilterBasedOnSharedElements;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class FilterBasedOnSharedStepdefs {
    FilterBasedOnSharedElements elements;
    @Given("user In collection list Page")
    public void userInCollectionListPage() {
        System.out.println("user In collection list Page");
    }

    @When("User click on Shared filter")
    public void userClickOnSharedFilter() throws InterruptedException {
        elements=new FilterBasedOnSharedElements(driver);
        elements.clickOnSharedFilter();
    }

    @Then("Only those collection will be displayed which has been Shared with the logged in user")
    public void onlyThoseCollectionWillBeDisplayedWhichHasBeenSharedWithTheLoggedInUser() {
        System.out.println("Only those collection will be displayed which has been Shared with the logged in user");
    }
}
