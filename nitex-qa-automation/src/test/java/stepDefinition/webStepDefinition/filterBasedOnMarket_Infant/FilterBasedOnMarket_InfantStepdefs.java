package stepDefinition.webStepDefinition.filterBasedOnMarket_Infant;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.filterBasedOnMarket_InfantElement.FilterBasedOnMarket_InfantElement;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class FilterBasedOnMarket_InfantStepdefs {
    FilterBasedOnMarket_InfantElement element;
    @Given("Authenticated User in Collection List Page")
    public void authenticatedUserInCollectionListPage() {
        System.out.println("Authenticated User in Collection List Page");

    }

    @When("User click on market dropdown and select Infant")
    public void userClickOnMarketDropdownAndSelectInfant() throws InterruptedException {
        element=new FilterBasedOnMarket_InfantElement(driver);
        element.clickMarketAndSelect();

    }

    @Then("Collection containing style with the selected market will be displayed in the list, if not matched then an empty page with a message will be displayed")
    public void collectionContainingStyleWithTheSelectedMarketWillBeDisplayedInTheListIfNotMatchedThenAnEmptyPageWithAMessageWillBeDisplayed() {
        System.out.println("Collection containing style with the selected market will be displayed in the list, if not matched then an empty page with a message will be displayed");
    }
}
