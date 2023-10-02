package stepDefinition.webStepDefinition.filterBasedOnDevelopment;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.filterBasedOnDevelopmentElement.FilterBasedOnDevelopmentElements;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class FilterBasedOnDevelopmentStepdefs {
    FilterBasedOnDevelopmentElements elements;
    @Given("Authenticated user in collection List page")
    public void authenticatedUserInCollectionListPage() {
        System.out.println("Authenticated user in collection List page");
    }

    @When("User click on Development filter")
    public void userClickOnDevelopmentFilter() throws InterruptedException {
        elements=new FilterBasedOnDevelopmentElements(driver);
        elements.clickOnDevelopment();
        
    }

    @Then("Only those collection will be displayed which has style in Development status")
    public void onlyThoseCollectionWillBeDisplayedWhichHasStyleInDevelopmentStatus() {
        System.out.println("Only those collection will be displayed which has style in Development status");
    }
}
