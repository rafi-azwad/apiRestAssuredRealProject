package stepDefinition.webStepDefinition.editStyle;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.collection.EditStylePage;

import static stepDefinition.webStepDefinition.login.LoginStepdefs.driver;

public class EditStyleStepdefs {
    EditStylePage editStylePage;
    @Given("Authenticated user can click nitex studio menu")
    public void authenticatedUserCanClickNitexStudioMenu() throws InterruptedException {
        System.out.println("test");
        editStylePage = new EditStylePage(driver);
        editStylePage.clickNitexStudioMenu();
        editStylePage.hoverProduct();
        editStylePage.clickEditIcon();
        editStylePage.drawLine();



        
    }

    @When("user will click arrow icon")
    public void userWillClickArrowIcon() {
        System.out.println("tested");
        
    }

    @And("add design")
    public void addDesign() {
        System.out.println("tested");
    }

    @Then("user can save that design")
    public void userCanSaveThatDesign() {
        System.out.println("tested");
    }

    @And("get {string}")
    public void getId(String id) {
        System.out.println(id);
    }
}
