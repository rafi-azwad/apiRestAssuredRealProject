package stepDefinition.webStepDefinition.addDesign;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.addDesign.AddDesignElements;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class AddDesignStepdefs {
    AddDesignElements elements;
    @Given("Authenticated user in the collection view page")
    public void authenticatedUserInTheCollectionViewPage() {
        WebDriver driver;
    }

    @When("User click on the multiple style button")
    public void userClickOnTheMultipleStyleButton() throws InterruptedException {
        elements=new AddDesignElements(driver);
       elements.clickOnMultiStyle();
    }

    @And("User click on the upload area and select multiple style from the directory and click on the submit button")
    public void userClickOnTheUploadAreaAndSelectMultipleStyleFromTheDirectoryAndClickOnTheSubmitButton() throws InterruptedException {
        elements.uploadItems();
        elements.clickOnSubmit();
    }

    @Then("Multiple style will be added to the collection")
    public void multipleStyleWillBeAddedToTheCollection() {
        System.out.println("Multiple style will be added to the collection");
    }
}
