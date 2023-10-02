package stepDefinition.webStepDefinition.filterBasedOnMarket_Woman;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.filterBasedOnMarket_WomanElement.FilterBasedOnMarket_WomanElement;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class FilterBasedOnMarket_WomanStepdefs {
    FilterBasedOnMarket_WomanElement element;
    @Given("User in Collection List Page")
    public void userInCollectionListPage() {
        System.out.println("User in Collection List Page");
    }

    @When("User click on market dropdown and select Women")
    public void userClickOnMarketDropdownAndSelectWomen() throws InterruptedException {
        element=new FilterBasedOnMarket_WomanElement(driver);
        element.clickMarketAndSelectWoman();

    }

    @Then("Collection containing style with the selected market will be displayed in the List")
    public void collectionContainingStyleWithTheSelectedMarketWillBeDisplayedInTheList() {
        System.out.println("Collection containing style with the selected market will be displayed in the List");
    }
}
