package stepDefinition.webStepDefinition.login;

import core.Helper.BrowserHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObject.login.LoginPage;

import java.net.MalformedURLException;

import static core.urlDefine.webURL.nitex_web_collection_url;

public class LoginStepdefs {
    public static String url =nitex_web_collection_url;

    public static WebDriver driver;
    BrowserHandler browserHandler;
    LoginPage loginPage;

    @Given("base url will provide")
    public void baseUrlWillProvide() throws MalformedURLException {
        browserHandler = new BrowserHandler();
        String browser = System.getProperty("Browser");
        System.out.println(".............................+" + browser);
        driver = browserHandler.selectBrowser(browser,url);
        loginPage= new LoginPage(driver);
        
    }

    @When("user will enter  {string} and {string}")
    public void userWillEnterPasswordAndEmail(String password, String email) {
        loginPage.setEmailId(email);
        loginPage.setPasswordId(password);
        loginPage.clickLoginButton();

    }

    @Then("it will redirect to dashboard")
    public void itWillRedirectToDashboard() throws InterruptedException {
        String expected_url = "https://testadmin.nitex.com/dashboard";
        Thread.sleep(3000);
        String actual_url= driver.getCurrentUrl();
        Assert.assertEquals(expected_url,actual_url);
    }
}
