package stepDefinition.apiStepDefinition.designedit;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static core.urlDefine.apiURL.base_url;

public class DgnPutProDocPinnedStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;

    Response postCostApiResponse;
    String url;


    @Given("design put pro doc pinned api will be provided")
    public void designPutProDocPinnedApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit material update put pro doc pinned api url with {string} and {string} and {string}")
    public void userWillHitMaterialUpdatePutProDocPinnedApiUrlWithAndAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
    }

    @And("user will hit material update put api {string} and {string} and {string}")
    public void userWillHitMaterialUpdatePutApiAndAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
    }

    @Then("dgn put pro doc api will be verified with DB")
    public void dgnPutProDocApiWillBeVerifiedWithDB() throws NoSuchAlgorithmException, KeyManagementException {

        postCostApiResponse = ApiCallHelper.putCall(HeaderFormatHelper.commonHeadersForNewAgent(),"",url);
        System.out.println(postCostApiResponse.body().asString());

        try {
            Assert.assertEquals(postCostApiResponse.statusCode(),200);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}
