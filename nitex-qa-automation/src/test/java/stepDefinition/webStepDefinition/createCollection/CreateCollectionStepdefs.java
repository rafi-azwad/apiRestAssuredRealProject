package stepDefinition.webStepDefinition.createCollection;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.createCollection.CreateCollectionElements;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class CreateCollectionStepdefs {

    CreateCollectionElements elements;
    @Given("Authenticated user is in the collection list page")
    public void authenticatedUserIsInTheCollectionListPage() {
        WebDriver driver;
    }

    @When("User click in the add collection button")
    public void userClickInTheAddCollectionButton() throws InterruptedException {
        elements=new CreateCollectionElements(driver);
        elements.clickOnCollection();
    }

    @And("User insert {string} and {string} and select brand and select season and click on submit button")
    public void userInsertCollectionNameAndSearchAndSelectBrandAndSelectSeasonAndClickOnSubmitButton(String collectionName,String search) throws InterruptedException {
        elements.insertCollectionNameSearch(collectionName,search);
    }

    @Then("Collection will be created")
    public void collectionWillBeCreated() {
        System.out.println("Collection will be created");
    }
}
