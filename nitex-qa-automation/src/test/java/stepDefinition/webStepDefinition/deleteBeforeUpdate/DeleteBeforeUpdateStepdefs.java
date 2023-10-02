package stepDefinition.webStepDefinition.deleteBeforeUpdate;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.deleteBeforeUpdate.DeleteBeforeUpdateElement;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class DeleteBeforeUpdateStepdefs {
    DeleteBeforeUpdateElement element;
    @Given("Authenticated user in the collection View page")
    public void authenticatedUserInTheCollectionViewPage() {
        WebDriver driver;
    }

    @When("User hove mouse on a design and click on the delete icon of a style")
    public void userHoveMouseOnADesignAndClickOnTheDeleteIconOfAStyle() throws InterruptedException {
       element=new DeleteBeforeUpdateElement(driver);
       element.hoverAndDelete();
    }

    @Then("The design will be deleted from the collection")
    public void theDesignWillBeDeletedFromTheCollection() {
        System.out.println("The design will be deleted from the collection");
    }
}
