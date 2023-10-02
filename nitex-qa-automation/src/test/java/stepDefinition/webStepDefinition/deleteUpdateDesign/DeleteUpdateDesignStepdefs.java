package stepDefinition.webStepDefinition.deleteUpdateDesign;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.deleteUpdateDesign.DeleteUpdateDesignElements;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class DeleteUpdateDesignStepdefs {

    DeleteUpdateDesignElements elements;
    @Given("Authenticated user in the Collection view page")
    public void authenticatedUserInTheCollectionViewPage() {
        WebDriver driver;
    }

    @When("User hover mouse on a design and click on the more icon")
    public void userHoverMouseOnADesignAndClickOnTheMoreIcon() throws InterruptedException {
        elements=new DeleteUpdateDesignElements(driver);
        elements.hoverMouseAndClickMoreIcon();
    }

    @And("User click on the Delete button")
    public void userClickOnTheDeleteButton() throws InterruptedException {

        elements.clickDeleteIcon();
    }

    @Then("The style will be deleted from the collection")
    public void theStyleWillBeDeletedFromTheCollection() {

        System.out.println(" The style will be deleted from the collection");
    }
}
