package stepDefinition.webStepDefinition.filterBasedOnMarket_Girls;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.filterBasedOnMarket_GirlsElement.FilterBasedOnCategory_GirlsElements;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class FilterBasedOnMarket_girlsStepdefs {
    FilterBasedOnCategory_GirlsElements elements;
    @Given("user in collection List page")
    public void userInCollectionListPage() {
        System.out.println("user in collection List page");

    }

    @When("User click on market dropdown and select Girls")
    public void userClickOnMarketDropdownAndSelectGirls() throws InterruptedException {
        elements=new FilterBasedOnCategory_GirlsElements(driver);
        elements.clickMarketAndSelect();

    }

    @Then("Collection containing style with the selected market will be displayed in the list")
    public void collectionContainingStyleWithTheSelectedMarketWillBeDisplayedInTheList() {
        System.out.println("Collection containing style with the selected market will be displayed in the list");
    }
}
