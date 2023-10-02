package stepDefinition.webStepDefinition.filterBasedOnCompletePublished;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.filterBasedOnCompletePubElement.FilterBasedOnCompletePubElements;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class FilterBasedOnCompletePublishedStepdefs {
    FilterBasedOnCompletePubElements elements;
    @Given("User in Collection List page")
    public void userInCollectionListPage() {
        System.out.println("User in Collection List page");

    }

    @When("User click on Complete & Published filter")
    public void userClickOnCompletePublishedFilter() throws InterruptedException {
        elements=new FilterBasedOnCompletePubElements(driver);
        elements.clickOnCompleteAndPublished();

    }

    @Then("Only those collection will be displayed which has style in Complete & Published status")
    public void onlyThoseCollectionWillBeDisplayedWhichHasStyleInCompletePublishedStatus() {
        System.out.println("Only those collection will be displayed which has style in Complete & Published status");
    }
}
